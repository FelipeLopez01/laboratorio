package taller;
import java.util.Scanner;
import java.util.Random;

public class Punto4 {
	public static void main(String[] args) {
	
		Random random = new Random();
		int numeroSecreto = random.nextInt(100)+1;
		int intentos = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adivina el numero entre 1 y 100. ");
		while(true) {
			System.out.println("ingresa el numeor: ");
			try {
				int intento = scanner.nextInt();
				intentos ++;
				 if (intento > numeroSecreto) {
					 System.out.println("el numero es menor intenta de nuevo: ");
				 } else if (intento < numeroSecreto) {
					 System.out.println("el numero es mayor intenta de nuevo: ");
				 }else {
					 System.out.println(" felicidades adivinaste el numeor " + intento + "intentos.");
					 break;
				 }
			} catch (Exception e) {
				System.out.println("por favor ingrse un numero valido. ");
				scanner.next(); 
			}
		}
		scanner.close();
	}

}
