package Practica2.Relaciones.ej8;
public class Persona {
    private String nombre;
    private String ci;
    private int edad;
    
    public Persona(String nombre, String ci, int edad) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
    }
    
    public String getNombre() { return nombre; }
    public String getCi() { return ci; }
    public int getEdad() { return edad; }
    
    public String toString() {
        return nombre + " (CI: " + ci + ", Edad: " + edad + ")";
    }
}


