package Practica1.POLIMORFISMO.ej2;

import java.util.Scanner;

public class Videojuego {

    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }
    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 0;
    }
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
        System.out.println("Se agregó 1 jugador al videojuego: " + nombre);
        System.out.println("Total de jugadores: " + cantidadJugadores);
    }
    public void agregarJugadores(Scanner scanner) {
        System.out.print("Ingrese la cantidad de jugadores a agregar para '" + nombre + "': ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        if (cantidad > 0) {
            this.cantidadJugadores += cantidad;
            System.out.println("Se agregaron " + cantidad + " jugadores al videojuego: " + nombre);
            System.out.println("Total de jugadores: " + cantidadJugadores);
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }
    public void agregarJugadores(int cantidad) {
        if (cantidad > 0) {
            this.cantidadJugadores += cantidad;
            System.out.println("Se agregaron " + cantidad + " jugadores al videojuego: " + nombre);
            System.out.println("Total de jugadores: " + cantidadJugadores);
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }
    @Override
    public String toString() {
        return "Videojuego: " + nombre +
                "  Plataforma: " + plataforma +
                " Jugadores: " + cantidadJugadores;
    }
}
