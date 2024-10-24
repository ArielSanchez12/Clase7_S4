package Calificaciones;

public class Notas {
    double bi1, bi2;

    public Notas(double bi1, double bi2) {
        this.bi1 = bi1;
        this.bi2 = bi2;
    }

    public double promedio() {
        return (bi1 + bi2) / 2;
    }
}
