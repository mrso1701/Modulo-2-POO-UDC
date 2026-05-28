package Taller9;


public class Animal {
    protected String especie;

    // Constructor
    public Animal(String especie) {
        this.especie = especie;
    }

    // Metodo para mostrar la especie
    public void mostrarEspecie() {
        System.out.println("Especie del animal: " + especie);
    }
}
