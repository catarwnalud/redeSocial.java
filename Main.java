import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]){

        final List <Usuario> listUser = new ArrayList <Usuario> ();
    
        Scanner scan = new Scanner(System.in);

        boolean acesso = true;

        while(acesso){
    
        System.out.println("                     ");
        System.out.println("                           REDESOCIAL     ");
        System.out.println("                     ");
        System.out.println("           (1)Cadastrar                  (2)Login");
        System.out.println("                     ");
    
        int opcao = scan.nextInt(); 
    
        switch(opcao){ 
    
            case 1: // Cadastro de um usuário
    
            System.out.println("                 ");
            System.out.println("Insira um email: ");
            String emailLido = scan.next();

            for(int i = 0; i < listUser.size(); i++){
                while(emailLido.equals(listUser.get(i).getEmail())){
                System.out.println("Este email já está sendo utilizado! Tente outro:");
                emailLido = scan.next();
                }
            }
    
            System.out.println("Insira uma senha: ");
            int senhaLida = scan.nextInt();
         
            System.out.println("Insira um nome de usuário: ");
            String userLido  = scan.next();

            for (int i = 0; i < listUser.size(); i++){
                while(userLido.equals(listUser.get(i).getUser())){
                    System.out.println("Este user já está sendo utilizado! Tente outro:");
                    userLido = scan.next();
                }
            }

            System.out.println("                     ");
    
            listUser.add(new Usuario(emailLido, senhaLida, userLido));

            System.out.println("Cadastrado com sucesso!");

            break;
    
            case 2: // Login
    
            System.out.println("                     ");
            System.out.println("Insira o email: ");
            String emailLog = scan.next();
    
            System.out.println("Insira a senha: ");
            int senhaLog = scan.nextInt();
            System.out.println("                     ");

            for(int i = 0; i < listUser.size(); i++){

                if((emailLog.equals(listUser.get(i).getEmail()) && senhaLog != listUser.get(i).getSenha()))
                    System.out.println("Falha no login.");
                
                if(emailLog.equals(listUser.get(i).getEmail()) && senhaLog == listUser.get(i).getSenha()){ // Caso email e senha corretos
                    
                    System.out.println(listUser.get(i).getUser());
                    System.out.println("Logado com sucesso!");
                    System.out.println("                     ");
                    
                    boolean temp = true;
                    while(temp){

                        System.out.println("             "); // Menu incial
                        System.out.println("(1) Postagens");
                        System.out.println("(2) Seguidores");
                        System.out.println("(3) Configurações da conta");
                        System.out.println("(4) Sair da conta");
                        System.out.println("                     ");

                        int op = scan.nextInt();

                        switch(op){

                            case 1: // Postagens

                            System.out.println("                             ");
                            System.out.println("(1) O que você está pensando?");
                            System.out.println("(2) Excluir postagem");
                            System.out.println("(3) Minha timeline");
                            System.out.println("(4) Minhas postagens");
                            System.out.println("                     ");

                                int op2 = scan.nextInt();

                                switch(op2){

                                    case 1: // Adiciona postagem

                                    System.out.println("                     ");
                                    System.out.println("Número da postagem:");
                                    int numPost = scan.nextInt();
                                
                                    Scanner input = new Scanner(System.in);
                                    System.out.println("Conteúdo:");
                                    String texto = input.nextLine();
                                
                                    listUser.get(i).addPost(listUser.get(i), numPost, texto);

                                    break;

                                    case 2: // Remove postagem

                                    System.out.println("                     ");
                                    System.out.println("Número da postagem a ser excluida:");

                                    int num = scan.nextInt();

                                    listUser.get(i).removePost(num);

                                    break;
                            
                                    case 3: // TimeLine

                                    System.out.println("                     ");
                                    System.out.println("(1) Ver as postagens"); // Mostra as postagens de todos usuários
                                    System.out.println("(2) Comentários"); 
                                    System.out.println("                    ");

                                    int opTl = scan.nextInt();

                                        switch(opTl){
                                    
                                            case 1:
                                            
                                            System.out.println(" ");
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("                   Timeline                      ");
                                            for(int j = 0; j < listUser.size(); j++)
                                            listUser.get(j).mostrarPosts();

                                            break;


                                            case 2:

                                            System.out.println("                      ");
                                            System.out.println("(1) Fazer comentário");
                                            System.out.println("(2) Deletar comentário");
                                            System.out.println("                     ");

                                            int opComent = scan.nextInt();

                                                switch(opComent){

                                                    case 1:

                                                    System.out.println("                                ");
                                                    System.out.println("@ do autor da postagem original:");
                                                    String arrobaOg = scan.next();

                                                    for(Usuario aux: listUser){
                                                    if(arrobaOg.equals(aux.getUser())){

                                                    System.out.println("Número da postagem original:");
                                                    int numOG = scan.nextInt();

                                                    System.out.println("Número do comentário:");
                                                    int idComentario = scan.nextInt();

                                                    Scanner input2 = new Scanner(System.in);
                                                    System.out.println("Seu comentário:");
                                                    String conteudo = input2.nextLine();

                                                    listUser.get(i).addComentario(listUser.get(i), aux, numOG, idComentario, conteudo);
                                                    
                                                    }
                                                }

                                                    break;
                                    
                                                    case 2:

                                                    System.out.println("                                  ");
                                                    System.out.println("@ do autor da postagem original:");
                                                    String arrobaComent = scan.next();

                                                    for(Usuario aux: listUser){
                                                    if(arrobaComent.equals(aux.getUser())){

                                                    System.out.println("Número da postagem original:");
                                                    int numOG = scan.nextInt();

                                                    System.out.println("Número do comentário:");
                                                    int idComentario = scan.nextInt();

                                                    listUser.get(i).removeComentario(listUser.get(i), aux, numOG, idComentario);
                                                    
                                                        }
                                                    }
                                                    
                                                    break; 
                                                }

                                                break; 
                            
                                        }

                                        break;

                                    case 4: // Mostra minhas postagens
                                    
                                    listUser.get(i).mostrarPosts();
                                    
                                    break;
                                
                                }
                                
                                break;
                            
                            case 2:
                            
                            System.out.println("                     ");
                            System.out.println("(1) Adicionar seguidor");
                            System.out.println("(2) Remover seguidor");
                            System.out.println("(3) Meus seguidores");
                            System.out.println("                   ");

                            int op3 = scan.nextInt();

                            switch(op3){

                                case 1:
                                
                                System.out.println("           ");
                                System.out.println("@ da conta:");
                                String arroba = scan.next();

                                listUser.get(i).addSeguidor(arroba);

                                break;
                              
                                case 2:

                                System.out.println("           ");
                                System.out.println("@ da conta:");
                                String arroba2 = scan.next();
                                
                                listUser.get(i).removeSeguidor(arroba2);
                            
                                break;

                                case 3:

                                listUser.get(i).mostrarSeguidor();

                                break;

                            }

                            break;

                            case 3:
                            
                            System.out.println("                     ");
                            System.out.println("(1) Alterar meu e-mail");
                            System.out.println("(2) Alterar meu @");
                            System.out.println("(3) Alterar minha senha");
                            System.out.println("                     ");

                            int op4 = scan.nextInt();

                            switch(op4){

                                case 1:

                                System.out.println("           ");
                                System.out.println("Novo email:");

                                String novoEmail = scan.next();

                                listUser.get(i).setEmail(novoEmail);

                                break;

                                case 2:
                                
                                System.out.println("        ");
                                System.out.println("Novo @:");

                                String novoUser = scan.next();

                                listUser.get(i).setUser(novoUser);

                                break;

                                case 3:

                                System.out.println("           ");
                                System.out.println("Nova senha:");

                                int novaSenha = scan.nextInt();

                                listUser.get(i).setSenha(novaSenha);

                                break;
                            }

                            break;

                            case 4: // Sair da conta

                            temp = false;  
                        }
                    }
                }
            }
        
            break;
        }
    }
}
}