package Taller11;

public abstract class Empleado {
    protected String nombre;

    // Constructor de la clase abstracta
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //  Metodo abstracto 
    public abstract double calcularSalario();

    // Metodo concreto que aprovecha el polimorfismo
    public void mostrarDetalles() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario neto: $" + calcularSalario());
    }
}
