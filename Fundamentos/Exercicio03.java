import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        //Se o número for par, seria verdadeiro e solicita para digitar um número.
        int pares;
        boolean x = true;
        System.out.println("Digite um número");

        //Se par for dividido à 2, será par. Caso contrário, será ímpar.

        pares = Teclado.nextInt();
        x = (pares % 2) ==0;
        if (x) {
            System.out.println("É par");
        } else { System.out.println("É ímpar");

        } 
            Teclado.close();
        }

    }
