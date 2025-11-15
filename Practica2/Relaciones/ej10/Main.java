package Practica2.Relaciones.ej10;
public class Main {
    public static void main(String[] args) {
        System.out.println(" SISTEMA COMPLETO DE GESTIÓN DE EVENTOS\n");
        Evento evento = new Evento("Tech Conference 2025", "2025-03-15", "Centro de Convenciones", "UMSA",    "Conferencia anual de tecnología e innovación");
        Speaker speaker1 = new Speaker("Juan", "Pérez", "1111111", 35,  "juan@tech.com", "777111222", "Inteligencia Artificial", 10);
        Speaker speaker2 = new Speaker("María", "Gómez", "2222222", 28,    "maria@tech.com", "777333444", "Blockchain", 6);
        Speaker speaker3 = new Speaker("Carlos", "López", "3333333", 42,   "carlos@tech.com", "777555666", "Ciberseguridad", 15);
    
        Participante part1 = new Participante("Ana", "Torres", "4444444", 22,  "ana@est.umsa.edu.bo", "777777888",  "P001", "ESTUDIANTE", true);
        Participante part2 = new Participante("Luis", "Rojas", "5555555", 25,  "luis@empresa.com", "777999000",    "P002", "PROFESIONAL", true);
        Participante part3 = new Participante("Marta", "Cruz", "6666666", 30, "marta@empresa.com", "777111333",  "P003", "VIP", true);
        Participante part4 = new Participante("José", "Mendoza", "7777777", 19,  "jose@est.umsa.edu.bo", "777444555", 
                                            "P004", "ESTUDIANTE", false);
        Charla charla1 = new Charla("IA en la Vida Cotidiana", 90, "Sala A", "09:00", 50, speaker1);
        Charla charla2 = new Charla("Blockchain para Negocios", 60, "Sala B", "11:00", 30, speaker2);
        Charla charla3 = new Charla("Seguridad en la Nube", 75, "Sala C", "14:00", 40, speaker3);
        Charla charla4 = new Charla("Machine Learning Avanzado", 90, "Sala A", "16:00", 50, speaker1);
        charla1.agregarParticipante(part1);
        charla1.agregarParticipante(part2);
        charla1.agregarParticipante(part3);
         charla2.agregarParticipante(part1);
        charla2.agregarParticipante(part4);
         charla3.agregarParticipante(part2);
        charla3.agregarParticipante(part3);
         charla4.agregarParticipante(part1);
        charla4.agregarParticipante(part2);
        charla4.agregarParticipante(part3);
        charla4.agregarParticipante(part4);
        evento.agregarCharla(charla1);
        evento.agregarCharla(charla2);
        evento.agregarCharla(charla3);
        evento.agregarCharla(charla4);
         // a)
        System.out.println("a) Edad promedio de participantes: " + 
                          String.format("%.1f años", evento.calcularEdadPromedioTotal()));
         // b) 
        System.out.println("\nb) Búsqueda de personas:");
        String[] personasBuscar = {
            "Ana Torres",    
            "Pedro Sanchez", 
            "Luis Rojas"     
        };
        
        for (String persona : personasBuscar) {
            String[] partes = persona.split(" ");
            boolean encontrado = evento.buscarPersonaEnCharlas(partes[0], partes[1]);
            System.out.println("¿" + persona + " está en alguna charla? " + 
                              (encontrado ? "SÍ" : "NO"));
        }
        
        // c)
        System.out.println("\nc) Eliminación de charlas por speaker:");
        evento.eliminarCharlasPorSpeaker("1111111"); 
        
        System.out.println("\nd) Charlas ordenadas por número de participantes:");
        evento.ordenarCharlasPorParticipantes();
        evento.mostrarEstadisticas();
        evento.mostrarTodasLasCharlas();
        
    }
}
