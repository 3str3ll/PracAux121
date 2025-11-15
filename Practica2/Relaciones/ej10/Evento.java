package Practica2.Relaciones.ej10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private String organizador;
    private String descripcion;
    private ArrayList<Charla> charlas;
    private ArrayList<Participante> participantesTotales;
    
    public Evento(String nombre, String fecha, String lugar, String organizador, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.organizador = organizador;
        this.descripcion = descripcion;
        this.charlas = new ArrayList<>();
        this.participantesTotales = new ArrayList<>();
    }
    
    public void agregarCharla(Charla charla) {
        charlas.add(charla);
        for (Participante p : charla.getParticipantes()) {
            if (!participantesTotales.contains(p)) {
                participantesTotales.add(p);
            }
        }
    }
    public double calcularEdadPromedioTotal() {
        if (participantesTotales.isEmpty()) return 0;
        
        int sumaEdades = 0;
        for (Participante p : participantesTotales) {
            sumaEdades += p.getEdad();
        }
        return (double) sumaEdades / participantesTotales.size();
    }

    public boolean buscarPersonaEnCharlas(String nombre, String apellido) {
        for (Charla charla : charlas) {
            if (charla.tienePersona(nombre, apellido)) {
                return true;
            }
        }
        return false;
    }public void eliminarCharlasPorSpeaker(String ciSpeaker) {
        int charlasEliminadas = 0;
        for (int i = charlas.size() - 1; i >= 0; i--) {
            if (charlas.get(i).getSpeaker().getCi().equals(ciSpeaker)) {
                Charla charlaEliminada = charlas.remove(i);
                System.out.println("✗ Charla eliminada: '" + charlaEliminada.getTitulo() + 
                                 "' - Speaker: " + charlaEliminada.getSpeaker().getNombreCompleto());
                charlasEliminadas++;
            }
        }
        System.out.println("✓ Total charlas eliminadas: " + charlasEliminadas);
    }
    public void ordenarCharlasPorParticipantes() {
        Collections.sort(charlas, new Comparator<Charla>() {
            @Override
            public int compare(Charla c1, Charla c2) {
                return Integer.compare(c2.getNumeroParticipantes(), c1.getNumeroParticipantes());
            }
        });
    }
    public void mostrarEstadisticas() {
        System.out.println("\n=== ESTADÍSTICAS DEL EVENTO: " + nombre + " ===");
        System.out.println("Total charlas: " + charlas.size());
        System.out.println("Total participantes únicos: " + participantesTotales.size());
        System.out.println("Edad promedio total: " + String.format("%.1f", calcularEdadPromedioTotal()));
        
        System.out.println("\n--- Participantes por Tipo ---");
        System.out.println("Estudiantes: " + contarParticipantesPorTipo("ESTUDIANTE"));
        System.out.println("Profesionales: " + contarParticipantesPorTipo("PROFESIONAL"));
        System.out.println("VIP: " + contarParticipantesPorTipo("VIP"));
    
        System.out.println("\n--- Charlas más Populares ---");
        ordenarCharlasPorParticipantes();
        for (int i = 0; i < Math.min(3, charlas.size()); i++) {
            Charla charla = charlas.get(i);
            System.out.println((i+1) + ". " + charla.getTitulo() + 
                             " (" + charla.getNumeroParticipantes() + " participantes)");
        }
    }
    
    public void mostrarTodasLasCharlas() {
        System.out.println("\n=== TODAS LAS CHARLAS ===");
        for (Charla charla : charlas) {
            charla.mostrarInformacion();
        }
    }
    
    private int contarParticipantesPorTipo(String tipo) {
        int count = 0;
        for (Participante p : participantesTotales) {
            if (p.getTipoInscripcion().equalsIgnoreCase(tipo)) {
                count++;
            }
        }
        return count;
    }
    public String getNombre() { return nombre; }
    public ArrayList<Charla> getCharlas() { return charlas; }
}