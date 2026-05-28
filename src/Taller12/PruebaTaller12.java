package Taller12;

public class PruebaTaller12 {

    public static void main(String[] args) {
        // Instanciamos el objeto normal de la clase Persona
        Persona individuo = new Persona();
        
        System.out.println("--- Rutina de la Persona ---");
        
        // Invocamos el metodo proveniente de la interfaz Hablador
        individuo.hablar();
        
        // Invocamos el metodo proveniente de la interfaz Trabajador
        individuo.trabajar();
        
        System.out.println("----------------------------");
    }
    
}
