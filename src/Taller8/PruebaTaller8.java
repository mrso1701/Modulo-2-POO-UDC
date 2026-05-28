package Taller8;

public class PruebaTaller8 {

    public static void main(String[] args) {
        //
        // Creamos un nuevo estudiante
        Estudiante estudiante1 = new Estudiante("Ana Gomez", 20, "MAT-2026-001");
        
        System.out.println("--- Datos del Estudiante ---");
        // Al llamar a este metodo, se mostrara el nombre, la edad y la matricula
        estudiante1.mostrarInformacion();
        System.out.println("----------------------------");
        //
        System.out.println("======================================================");
        
        
    }
    
}
