package Practica1.POO.ej15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Buzon {
    private int nro;
    private int nroC;
    private String[][][] c;
    public Buzon(int nro) {
        this.nro = nro;
        this.nroC = 0;
        this.c = new String[50][3][4]; 
    }
    public void agregarCarta(Carta carta) {
        if (nroC < 50) {
            c[nroC][0][0] = carta.getCodigo();    
            c[nroC][1][0] = carta.getRemitente(); 
            c[nroC][2][0] = carta.getDestinatario(); 
            c[nroC][0][1] = carta.getDescripcion(); 
            nroC++;
            System.out.println("Carta " + carta.getCodigo() + " agregada al buzón " + nro);
        } else {
            System.out.println("El buzón " + nro + " está lleno. No se puede agregar más cartas.");
        }
    }
    public int getNro() {
        return nro;
    }

    public int getNroC() {
        return nroC;
    }

    public String[][][] getCartas() {
        return c;
    }
    public void mostrarInformacion() {
        System.out.println("\n=== BUZÓN " + String.format("%03d", nro) + " ===");
        System.out.println("Número de cartas: " + nroC);
        for (int i = 0; i < nroC; i++) {
            System.out.println("Carta " + (i + 1) + ":");
            System.out.println("  Código: " + c[i][0][0]);
            System.out.println("  Remitente: " + c[i][1][0]);
            System.out.println("  Destinatario: " + c[i][2][0]);
        }
    }
    public int cartasRecibidasPor(String destinatario) {
        int count = 0;
        for (int i = 0; i < nroC; i++) {
            if (c[i][2][0] != null && c[i][2][0].equalsIgnoreCase(destinatario)) {
                count++;
            }
        }
        return count;
    }
    public boolean eliminarCartaPorCodigo(String codigo) {
        for (int i = 0; i < nroC; i++) {
            if (c[i][0][0] != null && c[i][0][0].equalsIgnoreCase(codigo)) {
                for (int j = i; j < nroC - 1; j++) {
                    c[j] = c[j + 1];
                }
                c[nroC - 1] = new String[3][4];
                nroC--;
                System.out.println("Carta " + codigo + " eliminada del buzón " + nro);
                return true;
            }
        }
        System.out.println("Carta " + codigo + " no encontrada en el buzón " + nro);
        return false;
    }
    public List<String> remitentesQueRecibieronCartas() {
        List<String> remitentesReceptores = new ArrayList<>();
        for (int i = 0; i < nroC; i++) {
            String remitente = c[i][1][0];
            for (int j = 0; j < nroC; j++) {
                if (c[j][2][0] != null && c[j][2][0].equalsIgnoreCase(remitente)) {
                    remitentesReceptores.add(remitente + " recibió carta de " + c[j][1][0]);
                    break;
                }
            }
        }
        return remitentesReceptores;
    }
    public void buscarPalabraEnDescripciones(String palabra) {
        System.out.println("\nBuscando palabra '" + palabra + "' en el buzón " + nro + ":");
        boolean encontrada = false;

        for (int i = 0; i < nroC; i++) {
            String descripcion = c[i][0][1]; 
            if (descripcion != null && descripcion.toLowerCase().contains(palabra.toLowerCase())) {
                System.out.println("✓ COINCIDENCIA ENCONTRADA:");
                System.out.println("  Código: " + c[i][0][0]);
                System.out.println("  Remitente: " + c[i][1][0]);
                System.out.println("  Destinatario: " + c[i][2][0]);
                System.out.println("  Fragmento: ..." +
                        descripcion.substring(
                                Math.max(0, descripcion.toLowerCase().indexOf(palabra.toLowerCase()) - 20),
                                Math.min(descripcion.length(), descripcion.toLowerCase().indexOf(palabra.toLowerCase()) + palabra.length() + 20)
                        ) + "...");
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron coincidencias para '" + palabra + "'");
        }
    }
}
