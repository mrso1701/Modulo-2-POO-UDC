package Taller7;

public class Utilidades {
    public double sumar(double a, double b) {
        return a + b;
    }

    // Metodo publico para restar
    public double restar(double a, double b) {
        return a - b;
    }

    // Metodo publico para multiplicar
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Metodo publico para dividir
    public double dividir(double a, double b) {
        // Agregamos una pequena validacion para evitar errores matematicos
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0; 
        }
        return a / b;
    }
}
