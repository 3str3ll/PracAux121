package Practica2.Excepciones.ej2;

public  class Calculadora {
    
    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }
    
    public static int convertirAEntero(String str) throws NumeroInvalidoException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("'" + str + "' no es un número válido");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE CALCULADORA ===\n");
        try {
            double resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
        
        // Prueba de conversión exitosa
        try {
            int numero = convertirAEntero("123");
            System.out.println("Número convertido: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println("Error de conversión: " + e.getMessage());
        }
        try {
            int numero = convertirAEntero("abc");
            System.out.println("Número convertido: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println("Error de conversión: " + e.getMessage());
        }
        
        
        try {
            int numero = convertirAEntero("20");
            double division = dividir(100, numero);
            System.out.println("100 / " + numero + " = " + division);
        } catch (NumeroInvalidoException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

    

    
    
    