package Taller8;

public class ClaseDerivada extends ClaseBase{
    public void intentarAcceso() {
        // Acceso exitoso al atributo protegido
        System.out.println("Dato permitido: " + this.datoPublico);
        // System.out.println("Intentando ver el secreto: " + this.datoSecreto);
    }
}
