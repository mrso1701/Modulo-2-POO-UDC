package Taller11;

public abstract class Instrumento {
    // Intento de definir un metodo abstracto pero con cuerpo (concreto)
    // public abstract void tocar() {
    //     System.out.println("Haciendo ruido...");
    // }
    
    // Metodo concreto normal (NO es obligatorio sobrescribirlo)
    public void afinar() {
        System.out.println("Afinando el instrumento");
    }
}
