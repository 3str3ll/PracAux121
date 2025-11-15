package Practica2.Relaciones.ej10;

import java.util.ArrayList;

public class PersonaEvento {
    private String nombre;
    private String apellido;
    private String ci;
    private int edad;
    private String email;
    private String telefono;
    
    public PersonaEvento(String nombre, String apellido, String ci, int edad, 
                        String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCi() { return ci; }
    public int getEdad() { return edad; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public String toString() {
        return getNombreCompleto() + " (CI: " + ci + ", Edad: " + edad + ")";
    }
}
