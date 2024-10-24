package Calificaciones;

public class Informacion {
    String nombre;
    String correo;
    int edad;

    public Informacion(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public void presentarse(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
    }
}
