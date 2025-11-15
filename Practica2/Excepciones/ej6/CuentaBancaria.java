package Practica2.Excepciones.ej6;

 public class CuentaBancaria{
    private String numeroCuenta;
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto) throws IllegalArgumentException {
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto debe ser positivo");
        }
        saldo += monto;
        System.out.println("Depósito: Bs." + monto);
    }
    
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo: Bs." + saldo);
        }
        saldo -= monto;
        System.out.println("Retiro: Bs." + monto);
    }
    
    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo: Bs." + saldo);
    }
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);
        
        System.out.println("=== SISTEMA BANCARIO ===");
        cuenta.mostrarInfo();
        
        // Prueba 1: Depósito válido
        try {
            cuenta.depositar(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en depósito: " + e.getMessage());
        }
        
        // Prueba 2: Depósito inválido
        try {
            cuenta.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en depósito: " + e.getMessage());
        }
        
        cuenta.mostrarInfo();
        
        // Prueba 3: Retiro válido
        try {
            cuenta.retirar(300);
        } catch (FondosInsuficientesException e) {
            System.out.println("Error en retiro: " + e.getMessage());
        }
        
        // Prueba 4: Retiro inválido
        try {
            cuenta.retirar(2000);
        } catch (FondosInsuficientesException e) {
            System.out.println("Error en retiro: " + e.getMessage());
        }
        
        cuenta.mostrarInfo();
        
        // Prueba final: Operaciones exitosas
        try {
            cuenta.depositar(200);
            cuenta.retirar(100);
            cuenta.mostrarInfo();
        } catch (IllegalArgumentException | FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

