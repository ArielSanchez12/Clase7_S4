package MiPracticaBasica;
import java.util.Scanner;
//import OCTUBRE24.Operaciones; asi se importa paquete a otro paquete
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su año de nacimiento: ");
        int anio = scanner.nextInt();
        int edad = 2024 - anio;

        Persona persona1 = new Persona(edad);
        persona1.mostrarResultado();


    }
}
