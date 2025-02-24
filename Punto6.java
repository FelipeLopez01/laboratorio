package taller;

import java.util.ArrayList;
import java.util.Scanner;

class Producto{
	String nombre;
	Double precio;
	int cantidad;
	
	public Producto(String nombre, Double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "nombre:" + nombre + ", precio:" + precio + ", cantidad: " + cantidad; 		
	}
}

public class Punto6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Producto> inventario = new ArrayList<>();
		int opcion;
		
		do {

			System.out.println("\n menu del inventario: ");
			System.out.println("1. Agregar producto");
			System.out.println("2. Eliminar prodcuto");
			System.out.println("3. Mostrar inventario");
			System.out.println("4. Salir");
			System.out.print("Selepcione una opcion: ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (opcion){
			case 1:
				System.out.print("ingrese el nombre del producto: ");
				String nombre = scanner.nextLine();
				System.out.print("ingrese el precio del producto: ");
				Double precio = scanner.nextDouble();
				System.out.print("ingrese la cantidad: ");
				int cantidad = scanner.nextInt();
				inventario.add(new Producto(nombre,precio,cantidad));
				System.out.println("Prodcuto agregado exitosamente. ");
				break;
			case 2:
				System.out.print("ingrese el nombre de producto a eliminar: ");
				String nombreEliminar = scanner.nextLine();
				inventario.removeIf(p -> p.nombre.equalsIgnoreCase(nombreEliminar));
				System.out.println("el producto eliminado si exitia en el programa");
				break;
				
			case 3:
				System.out.println("\n inventario actual: ");
				for (Producto p : inventario) {
					System.out.println(p);
				}
				break;
			case 4:
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("opncion invalidad intente nueva mente.");				
		}
	}while (opcion !=4);
		scanner.close();
	}

}
