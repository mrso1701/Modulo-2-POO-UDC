package Taller7;

public class CuentaBancaria {
    private  int numeroCuenta;
    public String tipoCuenta;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodo publico para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("--- Detalles de la Cuenta ---");
        System.out.println("Numero de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("-----------------------------");
    }
    
}
