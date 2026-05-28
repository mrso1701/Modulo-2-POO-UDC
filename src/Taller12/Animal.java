package Taller12;

public class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El animal despliega sus alas y comienza a volar.");
    }

    // Implementacion del metodo de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println("El animal se sumerge y empieza a nadar en el agua.");
    }
}
