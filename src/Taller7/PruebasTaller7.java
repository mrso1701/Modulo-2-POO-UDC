package Taller7;

public class PruebasTaller7 {

    public static void main(String[] args) {
        /*
        //Empleado empleado1 = new Empleado("Carlos Perez", 1500.00);
        
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
        */
        
        System.out.println("\n===============================================================");
        /*
        
        CuentaBancaria miCuenta = new CuentaBancaria("123456789", "Ahorros", 2500.0);
        
        // Acceso permitido: propiedad publica
        System.out.println("Tipo de cuenta: " + miCuenta.tipoCuenta);
        
        // Acceso permitido: a traves de los metodos publicos
        System.out.println("Saldo actual: $" + miCuenta.getSaldo());
        miCuenta.mostrarDetalles();
        
        // Intento de acceso directo a una propiedad privada 
        // System.out.println("Numero: " + miCuenta.numeroCuenta);
        
        
        */
        System.out.println("\n===============================================================");
        
        Utilidades calculadora = new Utilidades();
        
        // Definimos numeros para probar
        double numero1 = 15.0;
        double numero2 = 5.0;
        
        System.out.println("--- Resultados de Operaciones ---");
        
        // Validamos la suma
        double resultadoSuma = calculadora.sumar(numero1, numero2);
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + resultadoSuma);
        
        // Validamos la resta
        double resultadoResta = calculadora.restar(numero1, numero2);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resultadoResta);
        
        // Validamos la multiplicacion
        double resultadoMultiplicacion = calculadora.multiplicar(numero1, numero2);
        System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = " + resultadoMultiplicacion);
        
        // Validamos la division
        double resultadoDivision = calculadora.dividir(numero1, numero2);
        System.out.println("Division: " + numero1 + " / " + numero2 + " = " + resultadoDivision);
        
        System.out.println("---------------------------------");
        
        // Validamos el caso de error en la division por cero
        System.out.println("Prueba de division por cero:");
        calculadora.dividir(numero1, 0);
        
    }
    
}
