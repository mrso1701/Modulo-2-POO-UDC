package Taller12;

public class Perro implements Volador {
    // Obligados a implementar un metodo que no tiene sentido para un Perro
    @Override
    public void volar() {
        // Un perro no vuela, asi que el programador suele dejar esto vacio
        // o lanzar un error, lo cual es una senal de un mal diseno.
        System.out.println("Error: Los perros no pueden volar.");
    }
}
