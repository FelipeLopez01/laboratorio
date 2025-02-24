package taller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Punto2 {

    
    static class Estudiante {
        String nombre;
        double calificacion;

        
        public Estudiante(String nombre, double calificacion) {
            this.nombre = nombre;
            this.calificacion = calificacion;
        }
    }

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = registrarCalificaciones();
        generarInforme(estudiantes);
    }

    public static ArrayList<Estudiante> registrarCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        System.out.println(" Sistema de Registro de Calificaciones");
        System.out.println("Ingrese 'fin' como nombre para terminar el registro.\n");

        while (true) {
            System.out.print("Nombre del estudiante: ");
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            double calificacion = obtenerCalificacion(scanner);
            estudiantes.add(new Estudiante(nombre, calificacion));
        }
        scanner.close();
        return estudiantes;
    }

    public static double obtenerCalificacion(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Ingrese la calificación: ");
                double calificacion = Double.parseDouble(scanner.nextLine().trim());

                if (calificacion >= 0 && calificacion <= 10) {
                    return calificacion;
                } else {
                    System.out.println(" La calificación debe estar entre 0 y 10. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Entrada inválida. Debe ingresar un número.");
            }
        }
    }

    public static void generarInforme(ArrayList<Estudiante> estudiantes) {
        System.out.println("\n Informe de Calificaciones");
       

        ArrayList<Estudiante> aprobados = new ArrayList<>();
        ArrayList<Estudiante> reprobados = new ArrayList<>();

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.calificacion >= 5) {
                aprobados.add(estudiante);
            } else {
                reprobados.add(estudiante);
            }
        }

      
        aprobados.sort(Comparator.comparing(e -> e.nombre));
        reprobados.sort(Comparator.comparing(e -> e.nombre));

        System.out.println("\n Estudiantes aprobados:");
        if (aprobados.isEmpty()) {
            System.out.println("No hay estudiantes aprobados.");
        } else {
            for (Estudiante e : aprobados) {
                System.out.printf("- %s  %.2f%n", e.nombre, e.calificacion);
            }
        }

        System.out.println("\n Estudiantes reprobados:");
        if (reprobados.isEmpty()) {
            System.out.println("No hay estudiantes reprobados.");
        } else {
            for (Estudiante e : reprobados) {
                System.out.printf("- %s  %.2f%n", e.nombre, e.calificacion);
            }
        }
    }
}
