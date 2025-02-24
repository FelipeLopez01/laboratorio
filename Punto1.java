package taller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Punto1 {
	

	public static void main(String[] args) {
		
		
		ArrayList<Integer> Pares = new ArrayList<>();
		ArrayList<Integer> Impares = new ArrayList<>();
		
		System.out.println(" por favor ingrese 10: ");
		 for (int i = 0; i < 10; i ++) {
			 String input = JOptionPane.showInputDialog("ingrese el numero "+ (i +1)+":");
			 int numero = Integer.parseInt(input);
			 
			 if (numero % 2 == 0) {
				 Pares.add(numero);
			 } 
			     else {
				 Impares.add(numero);}
				 
			 }
	

		 String mensaje = "Números pares: " + Pares + "\nCantidad de pares: " + Pares.size() +
                 "\n\nNúmeros impares: " + Impares + "\nCantidad de impares: " + Impares.size();

JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
	
}

}
