public class Usuario {

    private String nome;
    private Livro livroAlugado; //USANDO CLASSE "LIVRO" COMO TIPO PARA A VARIÁVEL

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroAlugado() {
        return livroAlugado;
    }

    public void setLivroAlugado(Livro livroAlugado) {
        this.livroAlugado = livroAlugado;
    }

    public Usuario(String nome){
        this.nome = nome;
        this.livroAlugado = null;
    }

    public void alugarLivro (Livro livro){
        if (livro.isDisponivel()){ //VERIFICA SE O LIVRO ESTA DISPONÍVEL "TRUE"
            livroAlugado = livro; // SE ESTIVER "TRUE", VAI INICIALIZAR A VARIAÁVEL
            livro.setDisponivel(false); //VAI TORNAR O "FALSE" POR QUE O LIVRO NÃO ESTÁ MAIS DISPONÍEL, POIS JÁ FOI ALUGADO
            System.out.println("O usuário: " +nome+ "alugou o livro: "+ livro.getTitulo());
        } else {
            System.out.println("O livro: " + livro.getTitulo() + "não está mais disponível"); //SE NÃO ESTIVER DISPONÍEl "TRUE"
        }
    }

    public void devolverLivro (){

        if (livroAlugado != null){ //VAI VERIFICAR A A CONDIÇÃO DO LIVRO
        livroAlugado.setDisponivel(true); //DEVOLVEU O LIVRO E AGORA "SETOU" UM TRUE, POIS, COMO O LIVRO FOI DEVOLVIDO, VOLTOU A SER DISPONÍVEL
            System.out.println(nome+ "devolveu o livro: "+livroAlugado.getTitulo());
            livroAlugado = null; //RESETOU A INFORMAÇÃO
        } else {
            System.out.println(nome+ " não tem o livro para devolver");
        }
    }

}
