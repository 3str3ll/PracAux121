package Practica2.Relaciones.ej12;
 import java.util.ArrayList;
public class Hospital {
    private String nombre;
    private String direccion;
    private ArrayList<Doctor> doctores;
    
    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.doctores = new ArrayList<>();
    }
    
    public void asignarDoctor(Doctor doctor) {
        if (!doctores.contains(doctor)) {
            doctores.add(doctor);
            System.out.println("✓ " + doctor.getNombre() + " asignado a " + nombre);
        } else {
            System.out.println("✗ " + doctor.getNombre() + " ya está asignado a " + nombre);
        }
    }
    
    public void mostrarDoctores() {
        System.out.println("\n--- Doctores de " + nombre + " ---");
        if (doctores.isEmpty()) {
            System.out.println("No hay doctores asignados");
        } else {
            for (Doctor doc : doctores) {
                System.out.println("- " + doc);
            }
        }
    }
    
    public ArrayList<Doctor> getDoctoresPorEspecialidad(String especialidad) {
        ArrayList<Doctor> resultado = new ArrayList<>();
        for (Doctor doc : doctores) {
            if (doc.getEspecialidad().equalsIgnoreCase(especialidad)) {
                resultado.add(doc);
            }
        }
        return resultado;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public ArrayList<Doctor> getDoctores() { return doctores; }
}