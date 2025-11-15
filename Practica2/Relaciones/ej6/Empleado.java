package Practica2.Relaciones.ej6;
import java.util.ArrayList;
import java.util.Date;
public class Empleado {
    private String nombre;
    private String cargo;
    private String turno;
    private double salario;
    
    public Empleado(String nombre, String cargo, String turno, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.turno = turno;
        this.salario = salario;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public String getTurno() { return turno; }
    public double getSalario() { return salario; }
    
    public String toString() {
        return nombre + " - " + cargo + " (" + turno + ") - Bs." + salario;
    }
}
