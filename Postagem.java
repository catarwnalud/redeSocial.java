abstract class Postagem {

    protected Usuario user;
    protected int numPost;
    protected String conteudo;

    //CONSTRUTOR DE UMA POSTAGEM
    Postagem(Usuario user, String conteudo, int numPost){
        this.user = user;
        this.numPost = numPost;
        this.conteudo = conteudo;
    }

    abstract public void imprimePostagem();

    abstract public int getNumPostagem();
        
    
}