import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
      Scanner Teclado = new Scanner (System.in);
      
      int nota;
      int nota2;
      
    System.out.println("Digite a nota ");
    nota = Teclado.nextInt();
    System.out.println("Coloque a outra nota ");
    nota2 = Teclado.nextInt();

    System.out.println("A média aritmética = " + (nota + nota2) / 2);

    Teclado.close();


    }
}
