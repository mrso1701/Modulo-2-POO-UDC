package Taller7;

public class Empleado {
    public String nombre;
    
    // La propiedad salario debe ser privada para protegerla y usar los get/set
    private double salario;

    // Constructor 
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); // Usamos el set aquí mismo para aplicar la validación desde el inicio
    }
    
    public double getSalario() {
        return salario;
    }

    // Método set público con validación
    public void setSalario(double salario) {
        // Validación: El salario no puede ser negativo
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario para " + this.nombre + " no puede ser un valor negativo.");
        }
    }
}
