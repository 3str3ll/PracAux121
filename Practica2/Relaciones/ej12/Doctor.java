package Practica2.Relaciones.ej12;
 
public class Doctor {
    private String nombre;
    private String especialidad;
    private int añosExperiencia;
    
    public Doctor(String nombre, String especialidad, int añosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }
    
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public int getAñosExperiencia() { return añosExperiencia; }
    
    public String toString() {
        return "Dr. " + nombre + " - " + especialidad + " (" + añosExperiencia + " años exp.)";
    }
}
    