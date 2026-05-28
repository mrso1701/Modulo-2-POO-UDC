package Taller11;

public class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    // 2. Implementacion del salario para un Gerente
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
