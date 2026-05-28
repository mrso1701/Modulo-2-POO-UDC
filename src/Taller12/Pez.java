package Taller12;

public class Pez implements Respirador, Nadador {
     // Implementacion del metodo de la interfaz Nadador
    @Override
    public void nadar() {
        System.out.println("El pez mueve sus aletas y nada rapidamente por el arrecife.");
    }

    // Implementacion del metodo de la interfaz Respirador
    @Override
    public void respirar() {
        System.out.println("El pez absorbe oxigeno del agua a traves de sus branquias.");
    }
}
