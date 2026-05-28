package Taller9;

public class PruebaTaller9 {

    public static void main(String[] args) {
        // Instanciamos el objeto Empleado
        Empleado trabajador = new Empleado("Laura Martinez", 35, "Recursos Humanos");
        
        System.out.println("--- Detalles del Trabajador ---");
        
        trabajador.mostrarDetalles();
        
        System.out.println("-------------------------------");
    }
    
}
