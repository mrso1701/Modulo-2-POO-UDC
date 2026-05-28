package Taller8;

public class Vehiculo {
    // Atributos protegidos para permitir el acceso a las clases hijas
    protected String marca;
    protected int velocidadMaxima;

    // Constructor de Vehiculo
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Metodo para mostrar la informacion base
    public void mostrarInformacion() {
        System.out.println("Marca del vehiculo: " + marca);
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
    }
}
