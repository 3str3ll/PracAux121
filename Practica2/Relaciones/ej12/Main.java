package Practica2.Relaciones.ej12;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
        System.out.println("SISTEMA DE HOSPITALES Y DOCTORES\n");
        Doctor doc1 = new Doctor("Carlos Rojas", "Cardiología", 15);
        Doctor doc2 = new Doctor("Ana Méndez", "Pediatría", 10);
        Doctor doc3 = new Doctor("Luis Torres", "Cirugía", 20);
        Doctor doc4 = new Doctor("Marta Cruz", "Cardiología", 12);
        
        Hospital hosp1 = new Hospital("Hospital Central", "Av. Principal 123");
        Hospital hosp2 = new Hospital("Clínica San José", "Calle Secundaria 456");

        hosp1.asignarDoctor(doc1);
        hosp1.asignarDoctor(doc2);
        hosp2.asignarDoctor(doc3);
        hosp2.asignarDoctor(doc4);
        hosp1.asignarDoctor(doc3); 
        hosp1.mostrarDoctores();
        hosp2.mostrarDoctores();
        System.out.println("\n--- Cardiólogos en Hospital Central ---");
        ArrayList<Doctor> cardiologos = hosp1.getDoctoresPorEspecialidad("Cardiología");
        for (Doctor doc : cardiologos) {
            System.out.println("- " + doc);
        }
        System.out.println("\n--- El Dr. " + doc1.getNombre() + " existe fuera de los hospitales ---");
        System.out.println("Especialidad: " + doc1.getEspecialidad());
    }
}
