import java.util.ArrayList;
import java.util.List;

public class Post extends Postagem{

    private List <Comentario> listC;

    //CONSTRUTOR DE UMA POSTAGEM
    Post(Usuario user, int numPost, String conteudo){
        super(user,conteudo, numPost);
        this.listC = new ArrayList<>();
    }

    public void imprimePostagem(){

        System.out.println("                                                 ");
        System.out.println("Post <" + getNumPostagem() + "> de " + user.getUser() + ":");
        System.out.println("                                   ");
        System.out.println("          " + conteudo + "         ");
        System.out.println("                                                 ");
        System.out.println("-------------------------------------------------");

    }

    public int getNumPostagem(){
        return numPost;
    }

    public List <Comentario> getListC(){
        return listC;
    }
}