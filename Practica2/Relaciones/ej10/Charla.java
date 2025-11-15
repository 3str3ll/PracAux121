package Practica2.Relaciones.ej10;
import java.util.ArrayList;
public class Charla {
    private String titulo;
    private int duracion; s
    private String sala;
    private String horaInicio;
    private int capacidadMaxima;
    private Speaker speaker;
    private ArrayList<Participante> participantes;
    
    public Charla(String titulo, int duracion, String sala, String horaInicio, 
                 int capacidadMaxima, Speaker speaker) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.sala = sala;
        this.horaInicio = horaInicio;
        this.capacidadMaxima = capacidadMaxima;
        this.speaker = speaker;
        this.participantes = new ArrayList<>();
    }
    
    public boolean agregarParticipante(Participante participante) {
        if (participantes.size() < capacidadMaxima) {
            participantes.add(participante);
            return true;
        }
        return false;
    }
    
    public boolean eliminarParticipante(String ci) {
        return participantes.removeIf(p -> p.getCi().equals(ci));
    }
    
    public double calcularEdadPromedioParticipantes() {
        if (participantes.isEmpty()) return 0;
        
        int sumaEdades = 0;
        for (Participante p : participantes) {
            sumaEdades += p.getEdad();
        }
        return (double) sumaEdades / participantes.size();
    }
    
    public boolean tienePersona(String nombre, String apellido) {
        if (speaker.getNombre().equalsIgnoreCase(nombre) && 
            speaker.getApellido().equalsIgnoreCase(apellido)) {
            return true;
        }
        for (Participante p : participantes) {
            if (p.getNombre().equalsIgnoreCase(nombre) && 
                p.getApellido().equalsIgnoreCase(apellido)) {
                return true;
            }
        }
        return false;
    }
    
    public int contarParticipantesPorTipo(String tipo) {
        int count = 0;
        for (Participante p : participantes) {
            if (p.getTipoInscripcion().equalsIgnoreCase(tipo)) {
                count++;
            }
        }
        return count;
    }
    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracion; }
    public String getSala() { return sala; }
    public String getHoraInicio() { return horaInicio; }
    public int getCapacidadMaxima() { return capacidadMaxima; }
    public Speaker getSpeaker() { return speaker; }
    public ArrayList<Participante> getParticipantes() { return participantes; }
    public int getNumeroParticipantes() { return participantes.size(); }
    
    public void mostrarInformacion() {
        System.out.println("\n=== " + titulo + " ===");
        System.out.println("Speaker: " + speaker.getNombreCompleto());
        System.out.println("Especialidad: " + speaker.getEspecialidad());
        System.out.println("Sala: " + sala + " - Hora: " + horaInicio);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Participantes: " + participantes.size() + "/" + capacidadMaxima);
        System.out.println("Edad promedio: " + String.format("%.1f", calcularEdadPromedioParticipantes()));
        
        if (!participantes.isEmpty()) {
            System.out.println("\n--- Lista de Participantes ---");
            for (Participante p : participantes) {
                System.out.println("- " + p);
            }
        }
    }
}