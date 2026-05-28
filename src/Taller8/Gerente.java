package Taller8;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String departamento, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
