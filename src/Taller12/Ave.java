package Taller12;

public class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El ave despliega sus alas y vuela por el cielo.");
    }

    // Implementacion del metodo de la interfaz Cantante
    @Override
    public void cantar() {
        System.out.println("El ave entona una hermosa melodia al amanecer.");
    }
}
