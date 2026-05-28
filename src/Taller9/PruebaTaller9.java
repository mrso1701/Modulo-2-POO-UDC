package Taller9;

public class PruebaTaller9 {

    public static void main(String[] args) {
        // Instanciamos el objeto Empleado
        Empleado trabajador = new Empleado("Laura Martinez", 35, "Recursos Humanos");
        
        System.out.println("--- Detalles del Trabajador ---");
        
        // Al ejecutar este metodo, primero se imprimiran el nombre y la edad (gracias a super)
        // y despues se imprimira el departamento.
        trabajador.mostrarDetalles();
        
        System.out.println("-------------------------------");
    }
    
}
