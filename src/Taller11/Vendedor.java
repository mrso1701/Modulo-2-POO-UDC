package Taller11;

public class Vendedor extends Empleado {
    private double sueldoBasico;
    private double ventasRealizadas;
    private double porcentajeComision;

    // Constructor
    public Vendedor(String nombre, double sueldoBasico, double ventasRealizadas, double porcentajeComision) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    // 2. Implementacion del salario para un Vendedor
    @Override
    public double calcularSalario() {
        return sueldoBasico + (ventasRealizadas * porcentajeComision);
    }
}
