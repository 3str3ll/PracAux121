package Practica2.Excepciones.ej4;

public class StockInsuficienteException extends Exception {
    StockInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
