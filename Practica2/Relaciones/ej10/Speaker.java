package Practica2.Relaciones.ej10;

public class Speaker extends PersonaEvento {
    private String especialidad;
    private int añosExperiencia;
    
    public Speaker(String nombre, String apellido, String ci, int edad,
                  String email, String telefono, String especialidad, int añosExperiencia) {
        super(nombre, apellido, ci, edad, email, telefono);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }
    public String getEspecialidad() { return especialidad; }
    public int getAñosExperiencia() { return añosExperiencia; }
    
    public String toString() {
        return super.toString() + " - " + especialidad + " (" + añosExperiencia + " años exp.)";
    }
}