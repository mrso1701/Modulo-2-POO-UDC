package Taller11;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación obligatoria del área para un rectángulo
    @Override
    public double calcularArea() {
        // Fórmula: base * altura
        return base * altura;
    }
}
