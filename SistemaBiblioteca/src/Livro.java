public class Livro {

    //ATRIBUTOS DA CLASSE//
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro (String titulo, String autor){ //CONSTRUTOR E PARAMETROS
        this.titulo = titulo; //"THIS" REFERENCIA A VARIAVEL GLOGAL//
        this.autor = autor;
        this.disponivel = true; //JÁ INICIACIZANDO A VARIÁVEL BOOLEANA
    }
    //GETTERS & SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
