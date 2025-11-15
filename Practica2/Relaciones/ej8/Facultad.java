package Practica2.Relaciones.ej8;
import java.util.ArrayList;
public class Facultad {
    private String nombre;
    private ArrayList<Persona> estudiantes;
    
    public Facultad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    
    public void agregarEstudiante(Persona estudiante) {
        estudiantes.add(estudiante);
    }
    
    public String getNombre() { return nombre; }
    public ArrayList<Persona> getEstudiantes() { return estudiantes; }
}