package Taller8;

public class Persona {
    protected String nombre; 
    protected int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo base para mostrar la informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anos");
    }
}
