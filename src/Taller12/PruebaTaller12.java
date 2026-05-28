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
        
        // Creamos nuestro objeto Ave
        Ave miPajarito = new Ave();
        
        System.out.println("--- Comportamientos del Ave ---");
        
        // Ejecutamos la accion de volar
        miPajarito.volar();
        
        // Ejecutamos la accion de cantar
        miPajarito.cantar();
        
        System.out.println("-------------------------------");
        
        // Instanciamos el objeto Pez
        Pez miPez = new Pez();
        
        System.out.println("--- Acciones del Pez ---");
        
        // Ejecutamos la accion de nadar
        miPez.nadar();
        
        // Ejecutamos la accion de respirar
        miPez.respirar();
        
        System.out.println("------------------------");
    }
    
}
