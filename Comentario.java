public class Comentario extends Postagem{

     //CONSTRUTOR DE UM COMENTÁRIO
    Comentario(Usuario user, String conteudo, int numPost){
        super(user, conteudo, numPost);
    }

    public void imprimePostagem() {

        System.out.println("                                                   ");
        System.out.println("Comentário de " + user.getUser() + ":");
        System.out.println("                                                   ");
        System.out.println("          " + conteudo + "                           ");
        System.out.println("                                                   ");
        System.out.println("---------------------------------------------------");
        System.out.println("                                                   ");

    }
    
    public int getNumPostagem(){
        return this.numPost;
    }

    public Usuario getUser(){
        return user;
    }
}