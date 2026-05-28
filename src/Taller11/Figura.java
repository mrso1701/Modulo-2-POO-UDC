package Taller11;

public abstract class Figura {
    public abstract double calcularArea();

    // Método concreto que utiliza el método abstracto
    // Aunque calcularArea() no tiene código aquí, Java confía en que
    // las clases hijas lo tendrán cuando este método se ejecute.
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
