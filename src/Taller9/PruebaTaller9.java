package Taller9;

public class PruebaTaller9 {

    public static void main(String[] args) {
        // Instanciamos el objeto Empleado
        Empleado trabajador = new Empleado("Laura Martinez", 35, "Recursos Humanos");
        
        System.out.println("--- Detalles del Trabajador ---");
        
        trabajador.mostrarDetalles();
        
        System.out.println("-------------------------------");
        
        // Instanciamos un objeto de tipo Pez
        Pez miPez = new Pez("Pez Payaso", "Salada");
        
        System.out.println("--- Informacion del Animal ---");
        // Al ejecutar este metodo, llamara primero al de Animal y luego completara con el de Pez
        miPez.mostrarEspecie();
        System.out.println("------------------------------");
    }
    
}
