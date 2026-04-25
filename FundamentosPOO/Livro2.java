public class Livro2 {
    public static void main(String[] args) {
        Livro livro1;

        livro1 = new Livro();
        livro1.alterarTitulo("Seu título do livro será ");
        livro1.alterarAutor("John Green");
        livro1.novoNumeroDePaginas(400);
        livro1.novoPreço(50.00);

        livro1.apresentar();

        System.out.println();

    }
}
