package Taller10;

public class ClaseHija extends ClaseBase {
    // Intento de sobrescribir cambiando la firma (agregando un parametro)
    // @Override
    public void procesarInformacion(int numero) {
        System.out.println("Procesando el numero: " + numero);
    }
}
