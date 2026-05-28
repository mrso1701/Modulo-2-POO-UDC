package Taller8;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    // Constructor de Coche
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        // 'super' llama al constructor de la clase padre (Vehiculo)
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Sobrescribimos el metodo para agregar la informacion del coche
    @Override
    public void mostrarInformacion() {
        // Llamamos al metodo mostrarInformacion() de la clase padre
        super.mostrarInformacion(); 
        // Agregamos el detalle extra del coche
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}
