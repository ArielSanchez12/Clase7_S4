package Calificaciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el correo del estudiante: ");
        String correo = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        System.out.println("Ingrese la nota del primer bimestre: ");
        double bi1 = scanner.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre: ");
        double bi2 = scanner.nextDouble();
        scanner.nextLine();

        Informacion estudiante1 = new Informacion(nombre, correo, edad);
        estudiante1.presentarse();
        System.out.println();
        Notas notasEstudiante1 = new Notas(bi1, bi2);
        double promedio = notasEstudiante1.promedio();

        System.out.println("El promedio del estudiante es: " + promedio);


    }

}
