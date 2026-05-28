package Taller11;

public class PruebaTaller11 {

    public static void main(String[] args) {
        // Instanciamos el círculo (radio 5) y el rectángulo (base 4, altura 6)
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);
        
        System.out.println("--- Resultados de Areas ---");
        
        System.out.print("Circulo: ");
        // Llama a mostrarArea() de Figura, la cual a su vez llama a calcularArea() de Circulo
        miCirculo.mostrarArea();
        
        System.out.print("Rectangulo: ");
        // Llama a mostrarArea() de Figura, la cual a su vez llama a calcularArea() de Rectangulo
        miRectangulo.mostrarArea();
        
        System.out.println("---------------------------");
        
        // Creamos un gerente (Nombre, Salario base, Bono)
        Empleado jefe = new Gerente("Carlos Alvarado", 3500.00, 800.00);
        
        // Creamos un vendedor (Nombre, Sueldo basico, Ventas totales, Porcentaje de comision en decimal)
        Empleado ejecutivoVentas = new Vendedor("Lucia Fernandez", 1200.00, 5000.00, 0.10);
        
        System.out.println("--- Nomina de Empleados ---");
        
        // Llama a mostrarDetalles() de Empleado, calculando el sueldo con las reglas de Gerente
        jefe.mostrarDetalles();
        System.out.println("---------------------------");
        
        // Llama a mostrarDetalles() de Empleado, calculando el sueldo con las reglas de Vendedor
        ejecutivoVentas.mostrarDetalles();
        System.out.println("---------------------------");

    }
    
}
