package Practica1.POO.ej15;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de correo\n");

        Carta carta1 = new Carta("C123",
                "Querido amigo te escribo para decirte que ella no te ama por lo tanto debes seguir adelante con tu vida. El amor verdadero llegará cuando menos lo esperes pero con ella no lo encontraste xd.",
                "Juan Álvarez", "Peter Chaves");

        Carta carta2 = new Carta("C456",
                "Querido amigo te escribo para decirte que ella no te ama por lo tanto debes seguir adelante con tu vida. El amor verdadero llegará cuando menos lo esperes pero con ella no lo encontraste xd.",
                "Pepe Mujica", "Wilmer Pérez");

        Carta carta3 = new Carta("C789",
                "Querido amigo te escribo para decirte que ella no te ama por lo tanto debes seguir adelante con tu vida. El amor verdadero llegará cuando menos lo esperes pero con ella no lo encontraste xd.\"",
                "Paty Vasques", "Pepe Mujica");


        Carta carta4 = new Carta("C101",
                "Querido amigo te escribo para decirte que ella no te ama por lo tanto debes seguir adelante con tu vida. El amor verdadero tarda xd.\".",
                "Wilmer Pérez", "Juan Álvarez");

        Carta carta5 = new Carta("C202",
                "Querido amigo te escribo para decirte que ella no te ama por lo tanto debes seguir adelante con tu vida.  xd.\"",
                "Peter Chaves", "Paty Vasques");

        Carta carta6 = new Carta("C303",
                "Aprecio tu preocupacion pero yo la amo y si ella no me ama yo tengo amor por para los 2 " +
                        "por lo que te agradezco el consejo pero yo la amo .",
                "Carlos Ruiz", "Ana García");

        carta1.mostrarInformacion();
        carta2.mostrarInformacion();
        carta3.mostrarInformacion();
        Buzon buzon1 = new Buzon(1);
        Buzon buzon2 = new Buzon(2);
        Buzon buzon3 = new Buzon(3);
        buzon1.agregarCarta(carta1);
        buzon1.agregarCarta(carta2);
        buzon1.agregarCarta(carta3);
        buzon2.agregarCarta(carta4);
        buzon2.agregarCarta(carta5);
        buzon2.agregarCarta(carta6);
        buzon3.agregarCarta(carta1);
        buzon3.agregarCarta(carta4);
        buzon3.agregarCarta(carta5);
        buzon1.mostrarInformacion();
        buzon2.mostrarInformacion();
        buzon3.mostrarInformacion();

        System.out.println("\ncantida de artas recibidas");
        String destinatarioBuscado = "Pepe Mujica";
        System.out.println("Cartas recibidas por " + destinatarioBuscado + ":");
        System.out.println("Buzón 1: " + buzon1.cartasRecibidasPor(destinatarioBuscado));
        System.out.println("Buzón 2: " + buzon2.cartasRecibidasPor(destinatarioBuscado));
        System.out.println("\neliminacion por codigo");
        buzon1.eliminarCartaPorCodigo("C123");
        buzon1.mostrarInformacion();
        System.out.println("\nverificacion ");
        System.out.println("Buzón 1:");
        for (String resultado : buzon1.remitentesQueRecibieronCartas()) {
            System.out.println("  " + resultado);
        }

        System.out.println("Buzón 2:");
        for (String resultado : buzon2.remitentesQueRecibieronCartas()) {
            System.out.println("  " + resultado);
        }

        System.out.println("Buzón 3:");
        for (String resultado : buzon3.remitentesQueRecibieronCartas()) {
            System.out.println("  " + resultado);
        }
        System.out.println("\nbusqueda");
        String palabraClave = "amor";
        buzon1.buscarPalabraEnDescripciones(palabraClave);
        buzon2.buscarPalabraEnDescripciones(palabraClave);
        buzon3.buscarPalabraEnDescripciones(palabraClave);

    }
}
