public class Livro {
        private String titulo;
        private String autor;
        private int numeroDePaginas;
        private double preço;

    public void alterarTitulo(String novoTitulo){
        titulo = novoTitulo;
    }
    public void alterarAutor(String novoAutor){
            autor = novoAutor;   
    }

    public void novoNumeroDePaginas(int novoNumeroDePaginas){
            numeroDePaginas = novoNumeroDePaginas;
    }

    public void novoPreço(double novoPreço){
        preço = novoPreço;
    }       

    void apresentar () {
        System.out.println("O livro se chama " + titulo + "Autor é " + autor + "Possui número de " + numeroDePaginas);
    }

    }

