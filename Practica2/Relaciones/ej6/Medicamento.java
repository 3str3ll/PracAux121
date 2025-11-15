package Practica2.Relaciones.ej6;

import java.util.ArrayList;
import java.util.Date;
class Medicamento {
    private String nombre;
    private String tipo;
    private double precio;
    private int stock;
    private String laboratorio;
    private Date fechaVencimiento;
    
    public Medicamento(String nombre, String tipo, double precio, int stock, 
                      String laboratorio, Date fechaVencimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
        this.laboratorio = laboratorio;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public String getLaboratorio() { return laboratorio; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
    
    public void reducirStock(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        }
    }
    
    public void aumentarStock(int cantidad) {
        stock += cantidad;
    }
    
    public String toString() {
        return nombre + " [" + tipo + "] - Lab: " + laboratorio + " - Bs." + precio + " - Stock: " + stock;
    }
}

