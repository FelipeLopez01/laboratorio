package taller;

import java.util.Scanner;

public class Punto7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese el numeor de filas para el rombo: ");
		int filas = scanner.nextInt();
		
		if (filas % 2 == 0) {
			filas++;
		}
		int mitad = filas / 2;
		for (int i=0; i <= mitad; i++) {
			for (int j=0; j < mitad - i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j< (2 * i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=mitad - 1; i>=0; i--) {
			for(int j= 0; j< mitad -i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<(2*i +1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
