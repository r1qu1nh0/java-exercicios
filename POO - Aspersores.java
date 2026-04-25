import java.util.Random; 
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
	Random gerador = new Random();

	int aspersores;
	int fileiras;

	System.out.println("Quantas fileiras será?: ");
	Scanner scanner = new Scanner(System.in);
	fileiras = scanner.nextInt();

	System.out.println("Quantos aspersores por fileira?: ");
	aspersores = scanner.nextInt(); 
	
	for (int i = 1; i <= fileiras; i++) {
		System.out.println("Verificando Fileira " + i + ":");
		for (int j = 1; j <= aspersores; j++) {
		double chance = gerador.nextDouble();
    		String status; 
    
    		if (chance < 0.20) {
        	status = "Falha";
    		} else {
        	status = "OK";
		}
		System.out.println("> Aspersor " + i + "." + j + ": " + status);
	}
	}
	scanner.close();
}
}

