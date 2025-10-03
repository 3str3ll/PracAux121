package Practica1.POLIMORFISMO.ej2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando videojuegos");
        Videojuego juego1 = new Videojuego("FIFA 24", "PlayStation 5", 2);
        System.out.println("1. " + juego1.toString());
        Videojuego juego2 = new Videojuego("Mario Kart", "Nintendo Switch");
        System.out.println("2. " + juego2.toString());
        Videojuego juego3 = new Videojuego("Call of Duty");
        System.out.println("3. " + juego3.toString());
        System.out.println(" Agregando 1 jugador a cada juego");
        juego1.agregarJugadores();
        juego2.agregarJugadores();
        juego3.agregarJugadores();

        System.out.println("\nAgregando jugadores por teclado ");
        juego1.agregarJugadores(scanner);
        juego2.agregarJugadores(scanner);

        System.out.println("\nAgregando jugadores con cantidad específica ");
        juego3.agregarJugadores(5);
        juego1.agregarJugadores(3);
        System.out.println(juego1.toString());
        System.out.println(juego2.toString());
        System.out.println(juego3.toString());
        int totalJugadores = juego1.getCantidadJugadores() +
                juego2.getCantidadJugadores() +
                juego3.getCantidadJugadores();
        System.out.println("Total de jugadores en todos los videojuegos: " + totalJugadores);

    }
}


