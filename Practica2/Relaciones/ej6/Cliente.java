package Practica2.Relaciones.ej6;
public class Cliente {
    private String nombre;
    private String ci;
    private String telefono;
    private String email;
    
    public Cliente(String nombre, String ci, String telefono, String email) {
        this.nombre = nombre;
        this.ci = ci;
        this.telefono = telefono;
        this.email = email;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getCi() { return ci; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
    
    public String toString() {
        return nombre + " (CI: " + ci + ") - Tel: " + telefono;
    }
}