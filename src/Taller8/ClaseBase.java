package Taller8;

public class ClaseBase {
    // Atributo estrictamente privado
    private String datoSecreto = "Contraseña123";
    
    // Atributo protegido (este si se heredaria sin problemas)
    protected String datoPublico = "Hola mundo";
}
