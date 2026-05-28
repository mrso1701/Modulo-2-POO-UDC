package Taller8;

public class Estudiante extends Persona{
    private String matricula; 
    
    public Estudiante(String nombre, int edad, String matricula) {
        // Llamamos al constructor de Persona con super()
        super(nombre, edad);
        this.matricula = matricula;
    }

    // Sobrescribimos el metodo de la clase padre
    @Override
    public void mostrarInformacion() {
        // Ejecutamos el metodo original para mostrar nombre y edad
        super.mostrarInformacion();
        // Agregamos la informacion especifica del estudiante
        System.out.println("Matricula: " + matricula);
    }
}
