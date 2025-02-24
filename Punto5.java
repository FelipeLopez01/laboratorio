package taller;

import java.util.Scanner;

public class Punto5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de niveles de la piramide: ");
		int niveles = scanner.nextInt();
		int numero = 1;
		
		for (int i = 1; i<= niveles; i++) {
			for  (int j = 0; j<i; j++) {
				System.out.print(numero+ " ");
				numero++;
			}
			System.out.println();
		}
		scanner.close(); 
	}
}
