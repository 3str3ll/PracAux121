package Practica2.Relaciones.ej6;
import java.util.ArrayList;
import java.util.Date;

public class Registro {
    private Date fecha;
    private int cantidad;
    private String tipoOperacion; // "VENTA" o "COMPRA"
    
    public Registro(Date fecha, int cantidad, String tipoOperacion) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipoOperacion = tipoOperacion;
    }
    
    public String toString() {
        return fecha + " - " + cantidad + " unidades - " + tipoOperacion;
    }
}
