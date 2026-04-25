import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int nota3;
        int nota4;

        System.out.println("Digite uma nota = ");
        nota3 = Teclado.nextInt();

        System.out.println("Digite outra nota = ");
        nota4 = Teclado.nextInt();


        System.out.println("A média ponderada do aluno será = " + (nota3*4 + nota4*6) / (nota3 + nota4));


        Teclado.close();

    }
}
