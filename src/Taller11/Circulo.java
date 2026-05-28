package Taller11;

public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación obligatoria del área para un círculo
    @Override
    public double calcularArea() {
        // Fórmula: pi * radio al cuadrado
        return Math.PI * radio * radio;
    }
}
