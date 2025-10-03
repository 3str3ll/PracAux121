package Practica1.POO.ej7;

public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Max", "Perro");
        Mascota mascota2 = new Mascota("Luna", "Gato");
        mascota1.mostrarInfo();
        System.out.println();
        mascota2.mostrarInfo();
        System.out.println("\nalimentando");
        mascota1.alimentar();
        mascota2.alimentar();
        System.out.println("\njugando");
        mascota1.jugar();
        mascota2.jugar();

    }
}
