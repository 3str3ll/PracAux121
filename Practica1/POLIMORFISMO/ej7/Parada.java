package Practica1.POLIMORFISMO.ej7;

import java.util.Arrays;
import java.util.Scanner;

public class Parada {

    private String[] admins;
    private String[][] autos;
    private String nombreP;
    private static final int MODELO = 0;
    private static final int CONDUCTOR = 1;
    private static final int PLACA = 2;
    private static final int MAX_ADMINS = 10;
    private static final int MAX_AUTOS = 10;
    public Parada() {
        this.admins = new String[MAX_ADMINS];
        this.autos = new String[MAX_AUTOS][3];
        this.nombreP = "Parada Sin Nombre";
        Arrays.fill(admins, null);
        for (int i = 0; i < MAX_AUTOS; i++) {
            Arrays.fill(autos[i], null);
        }
    }
    public Parada(Scanner scanner) {
        this();

        System.out.print("Ingrese el nombre de la parada: ");
        this.nombreP = scanner.nextLine();

        System.out.println("Parada '" + this.nombreP + "' creada exitosamente!");
    }
    public void mostrar() {
        System.out.printf (" Nombre: %-45s \n", nombreP);

        System.out.println(" Administradores:    ");
        int adminsCount = contarAdmins();
        if (adminsCount == 0) {
            System.out.println(" No hay administradores registrados     ");
        } else {
            for (int i = 0; i < MAX_ADMINS; i++) {
                if (admins[i] != null) {
                    System.out.printf("   %d. %-40s \n", i + 1, admins[i]);
                }
            }
        }
        System.out.println(" Vehículos registrados");
        int autosCount = contarAutos();
        if (autosCount == 0) {
            System.out.println("   No hay vehículos registrados");
        } else {
            for (int i = 0; i < MAX_AUTOS; i++) {
                if (autos[i][MODELO] != null) {
                    System.out.printf("  %d. Modelo: %-8s Conductor: %-15s \n",
                            i + 1, autos[i][MODELO], autos[i][CONDUCTOR]);
                    System.out.printf("    Placa: %-36s \n", autos[i][PLACA]);
                }
            }
        }
    }
    public boolean adicionar(String admin) {
        for (int i = 0; i < MAX_ADMINS; i++) {
            if (admins[i] == null) {
                admins[i] = admin;
                System.out.println(" Administrador '" + admin + "' agregado exitosamente!");
                return true;
            }
        }
        System.out.println(" No se puede agregar más administradores. Límite alcanzado.");
        return false;
    }
    public boolean adicionar(String modelo, String conductor, String placa) {
        for (int i = 0; i < MAX_AUTOS; i++) {
            if (autos[i][MODELO] == null) {
                autos[i][MODELO] = modelo;
                autos[i][CONDUCTOR] = conductor;
                autos[i][PLACA] = placa;
                System.out.println("Vehículo agregado exitosamente!");
                System.out.println("  Modelo: " + modelo + ", Conductor: " + conductor + ", Placa: " + placa);
                return true;
            }
        }
        System.out.println(" No se puede agregar más vehículos. Límite alcanzado.");
        return false;
    }
    private int contarAdmins() {
        int count = 0;
        for (String admin : admins) {
            if (admin != null) count++;
        }
        return count;
    }

    private int contarAutos() {
        int count = 0;
        for (String[] auto : autos) {
            if (auto[MODELO] != null) count++;
        }
        return count;
    }


}
