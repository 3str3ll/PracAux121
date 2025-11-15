package Practica2.Relaciones.ej8;

import java.util.ArrayList;
public  class  Fraternidad {
    private String nombre;
    private Persona encargado;
    private ArrayList<Persona> miembros;
    private Facultad facultad;
    
    public Fraternidad(String nombre, Persona encargado, Facultad facultad) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.facultad = facultad;
        this.miembros = new ArrayList<>();
        this.miembros.add(encargado); // El encargado también es miembro
    }
    
    public boolean agregarMiembro(Persona nuevoMiembro) {
        // Verificar que no esté en otra fraternidad
        for (Persona miembro : miembros) {
            if (miembro.getCi().equals(nuevoMiembro.getCi())) {
                System.out.println("✗ " + nuevoMiembro.getNombre() + " ya es miembro");
                return false;
            }
        }
        
        miembros.add(nuevoMiembro);
        facultad.agregarEstudiante(nuevoMiembro);
        System.out.println("✓ " + nuevoMiembro.getNombre() + " agregado a " + nombre);
        return true;
    }
    
    public void mostrarMiembros() {
        System.out.println("\n--- Miembros de " + nombre + " ---");
        System.out.println("Encargado: " + encargado);
        System.out.println("Miembros:");
        for (Persona miembro : miembros) {
            if (!miembro.getCi().equals(encargado.getCi())) {
                System.out.println("- " + miembro);
            }
        }
    }
    
    public String getNombre() { 
        return nombre; }
    public Persona getEncargado() { 
        return encargado; }
    public ArrayList<Persona> getMiembros() {
         return miembros; }
}