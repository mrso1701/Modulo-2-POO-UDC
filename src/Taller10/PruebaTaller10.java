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
        
        // Instanciamos los objetos de forma normal
        Vehiculo miVehiculo = new Vehiculo();
        Bicicleta miBicicleta = new Bicicleta();
        
        // Instanciamos aplicando polimorfismo (variable Vehiculo, objeto Bicicleta)
        Vehiculo biciPolimorfica = new Bicicleta();
        
        System.out.println("--- Demostracion de Movimiento ---");
        
        // Llama al metodo de la clase Vehiculo
        System.out.print("Vehiculo normal: ");
        miVehiculo.moverse(); 
        
        // Llama al metodo sobrescrito en la clase Bicicleta
        System.out.print("Bicicleta normal: ");
        miBicicleta.moverse(); 
        
        // Llama al metodo sobrescrito gracias al polimorfismo
        System.out.print("Bicicleta con polimorfismo: ");
        biciPolimorfica.moverse(); 
        
        System.out.println("----------------------------------");
    }
    
}
