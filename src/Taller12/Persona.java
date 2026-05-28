package Taller12;

public class Persona implements Hablador, Trabajador {
    // Implementacion obligatoria del contrato Hablador
    @Override
    public void hablar() {
        System.out.println("Hola, soy una persona y me comunico hablando.");
    }

    // Implementacion obligatoria del contrato Trabajador
    @Override
    public void trabajar() {
        System.out.println("Estoy enfocando mi energia en mi jornada laboral.");
    }
}
