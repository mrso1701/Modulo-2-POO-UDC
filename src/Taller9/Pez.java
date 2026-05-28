package Taller9;

public class Pez extends Animal {
    private String tipoDeAgua;

    // Constructor
    public Pez(String especie, String tipoDeAgua) {
        // Uso de super para invocar el constructor de la clase base (Animal)
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }

    // Sobrescritura del metodo
    @Override
    public void mostrarEspecie() {
        // Uso de super para invocar el metodo de la clase base
        super.mostrarEspecie(); 
        
        // Agregamos el comportamiento especifico de la clase Pez
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
