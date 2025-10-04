package Practica1.POO.Ej13;

import java.util.Arrays;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] v;
    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.v = new String[30];
        this.nroVitaminas = 0;
        if (vitaminas != null) {
            for (int i = 0; i < vitaminas.length && i < 30; i++) {
                this.v[i] = vitaminas[i];
                this.nroVitaminas++;
            }
        }
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public int getNroVitaminas() {
        return nroVitaminas;
    }
    public String[] getVitaminas() {
        return Arrays.copyOf(v, nroVitaminas); 
    }
    public void mostrarInformacion() {
        System.out.println("Fruta: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de vitaminas: " + nroVitaminas);
        System.out.print("Vitaminas: ");
        for (int i = 0; i < nroVitaminas; i++) {
            System.out.print(v[i] + (i < nroVitaminas - 1 ? ", " : ""));
        }
        System.out.println("\n");
    }

}
