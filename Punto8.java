package taller;
import java.util.Scanner;

public class Punto8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ingrese en numero de niveles parala piramide: ");
		int niveles = scanner.nextInt();
		
		int[] fibonacci = new int[niveles *(niveles +1)/ 2];
		fibonacci [0] = 1;
		if (niveles > 1)fibonacci [1]= 1;
		
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci [i]= fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		int index = 0;
		for (int i = 1; i<= niveles; i++) {
			for (int j = 0; j< niveles - i; j++) {
				System.out.print("   ");
			}
			for (int j=0;j<i; j++) {
				System.out.printf("%-4d  ", fibonacci[index++]);
			}
			System.out.println();
		}
		scanner.close();
	}

}
