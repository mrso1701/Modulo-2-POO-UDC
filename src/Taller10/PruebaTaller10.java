package Taller10;

public class PruebaTaller10 {

    public static void main(String[] args) {
        // La variable es de tipo Persona, pero el objeto instanciado es diferente
        Persona persona1 = new Persona();
        Persona persona2 = new Estudiante();
        Persona persona3 = new Profesor();
        
        System.out.println("--- Presentaciones ---");
        
        // Java sabe cual metodo ejecutar basandose en la instancia real del objeto
        persona1.presentarse(); // Ejecuta el de Persona
        persona2.presentarse(); // Ejecuta el de Estudiante
        persona3.presentarse(); // Ejecuta el de Profesor
        
        System.out.println("----------------------");
    }
    
}
