package taller;

import java.util.Scanner;
import java.util.Arrays;

public class Punto3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese una lista de numeros separados por coma ',': ");
		String entrada = scanner.nextLine().trim();
		
		if (entrada.isEmpty()) {
			System.out.println("no ingresaste ningun numero ");
			return;
			
		}
		
		try {
			String[] numerosStr = entrada.split(",");
			int[] numeros = new int[numerosStr.length];
			
			for(int i=0; i< numerosStr.length; i++) {
				numeros[i] = Integer.parseInt(numerosStr[i].trim());
			}
			Arrays.sort(numeros);
			System.out.println("numeros ordenado: " + Arrays.toString(numeros));
		} catch (NumberFormatException e) {
			System.out.println(" Error, ingresa solo numeros separados por coma. ");
			
		}
		scanner.close();

	}

}
