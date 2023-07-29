import java.util.ArrayList;
import java.util.List;

public class Usuario {

    protected String email;
    protected int senha;
    protected String user;
    protected List <Post> listPost;
    protected List <Seguidor> listSeguidores;

    // CONSTRUTOR DE UM NOVO USUÁRIO
    Usuario(String email, int senha, String user){
        this.email = email;
        this.senha = senha;
        this.user = user;
        this.listPost = new ArrayList<Post>();
        this.listSeguidores = new ArrayList<Seguidor>();
    }

    // CONSTRUTOR PAI DA CLASSE SEGUIDOR
    Usuario(String user){
        this.user = user;
    }
    
    public void setEmail(String novoEmail){
        this.email = novoEmail;
        System.out.println("                     ");
        System.out.println("Email alterado!");
    }
    public void setSenha(int novaSenha){
        this.senha = novaSenha;
        System.out.println("                     ");
        System.out.println("Senha alterada!");
    }
    public void setUser(String novoUser){
        this.user = novoUser;
        System.out.println("                     ");
        System.out.println("User alterado!");
    }

    public String getEmail(){
        return this.email;
    }
    public String getUser(){
        return this.user;
    }
    public int getSenha(){
        return this.senha;
    }


    public void addPost(Usuario user, int numPost, String texto){
        Post novoPost = new Post(user, numPost, texto); 
        listPost.add(novoPost);
        System.out.println("                     ");
        System.out.println("Postagem adicionada!");
    }


    public void removePost(int numPost){
        listPost.remove(numPost-1);
        System.out.println("                     ");
        System.out.println("Postagem removida!");
    }

    
    public void mostrarPosts(){
        for (int i = 0; i < listPost.size(); i++){
            Post pp = listPost.get(i);
            pp.imprimePostagem();
            for (int j = 0; j < listPost.get(i).getListC().size(); j++){
                Comentario cc = listPost.get(i).getListC().get(j);
                cc.imprimePostagem();
                }
            }
    }


    public void addSeguidor(String user){
        listSeguidores.add(new Seguidor(user));
        System.out.println("                     ");
        System.out.println("Seguidor adicionado!");
    }


    public void removeSeguidor(String user){
        listSeguidores.removeIf(aux ->(user.equals(aux.getUser())));
        System.out.println("                     ");
        System.out.println("Seguidor removido!");
    }
    

    public void mostrarSeguidor(){
        System.out.println("         ");
        for(Usuario aux : listSeguidores)
            System.out.println(aux.getUser());
        
    }


    public void addComentario(Usuario user, Usuario busca, int numPost, int idComentario, String conteudo){
        for(int i = 0; i < busca.listPost.size(); i++){
            if( i == numPost-1){
                busca.listPost.get(i).getListC().add(new Comentario(user, conteudo, idComentario-1));
                System.out.println("                     ");
                System.out.println("Comentário adicionado!");
            }
        }
    }


    public void removeComentario(Usuario user, Usuario busca, int numPost, int idComentario){
        for(int i = 0; i < busca.listPost.size(); i++){
            if(busca.listPost.get(i).getNumPostagem() == numPost){
                busca.listPost.get(i).getListC().removeIf(aux->(idComentario - 1 == aux.getNumPostagem()));
                System.out.println("                     ");
                System.out.println("Comentário removido!");
            }
        }
    }
}