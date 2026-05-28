package Taller7;

public class PruebasTaller7 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos Perez", 1500.00);
        
        // Accedemos a la propiedad pública directamente
        System.out.println("Nombre del empleado: " + empleado1.nombre);
        
        // Accedemos al salario a través del método get
        System.out.println("Salario actual: $" + empleado1.getSalario());
        
        System.out.println("-------------------------");
        
        // Intentamos poner un salario válido
        System.out.println("Aumentando el salario...");
        empleado1.setSalario(1800.50);
        System.out.println("Nuevo salario: $" + empleado1.getSalario());
        
        System.out.println("-------------------------");
        
        // Probamos la validación con un salario negativo
        System.out.println("Intentando asignar un salario negativo...");
        empleado1.setSalario(-500.00);
        
        // Comprobamos que el salario no cambió y sigue siendo 1800.50
        System.out.println("Salario despues del intento fallido: $" + empleado1.getSalario());
        
        System.out.println("\n===============================================================");
        ///////////////////////////////////////////////////////////////////////////////////////
        
        CuentaBancaria miCuenta = new CuentaBancaria("123456789", "Ahorros", 2500.0);
        
        // Acceso permitido: propiedad publica
        System.out.println("Tipo de cuenta: " + miCuenta.tipoCuenta);
        
        // Acceso permitido: a traves de los metodos publicos
        System.out.println("Saldo actual: $" + miCuenta.getSaldo());
        miCuenta.mostrarDetalles();
        
        // Intento de acceso directo a una propiedad privada 
        // System.out.println("Numero: " + miCuenta.numeroCuenta);
    }
    
}
