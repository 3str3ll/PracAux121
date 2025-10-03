package Practica1.POLIMORFISMO.ej7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parada parada1 = new Parada();
        parada1.mostrar();
        Parada parada2 = new Parada(scanner);
        // c)
        parada2.adicionar("Juan Pérez");
        parada2.adicionar("María García");
        parada2.adicionar("Carlos López");
        // d)
        parada2.adicionar("Toyota", "Ana Martínez", "ABC-123");
        parada2.adicionar("Nissan", "Pedro Rodríguez", "XYZ-789");
        parada2.adicionar("Honda", "Laura González", "DEF-456");
        parada2.adicionar("Ford", "Miguel Torres", "GHI-789");
        parada2.mostrar();


    }
}
