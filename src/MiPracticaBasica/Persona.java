package MiPracticaBasica;

public class Persona {
    int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public void imprimirEdad(){
        System.out.println("Usted es mayor de edad porque tiene " + edad + " años");
    }

    public boolean verificarMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarResultado() {
        if (verificarMayorDeEdad(edad) == true) {
            imprimirEdad();
        } else {
            System.out.println("La persona no es mayor de edad porque tiene " + edad + " años");
        }
    }
}
