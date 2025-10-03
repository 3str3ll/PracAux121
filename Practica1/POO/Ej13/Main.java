package Practica1.POO.Ej13;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE FRUTAS ===\n");
        Fruta fruta1 = new Fruta("Kiwi", "Subtropical", new String[]{"K", "C", "E"});
        String[] vitaminasNaranja = {"C", "A", "B1", "B2"};
        Fruta fruta2 = new Fruta("Naranja", "Cítrica", vitaminasNaranja);
        Fruta fruta3 = new Fruta("Fresa", "Bosque", new String[]{"C", "K", "B9"});
        Fruta fruta4 = new Fruta("Limón", "Cítrica", new String[]{"C", "B6"});
        Fruta fruta5 = new Fruta("Mango", "Tropical", new String[]{"A", "C", "E"});
        Fruta[] frutas = {fruta1, fruta2, fruta3, fruta4, fruta5};
        System.out.println("--- TODAS LAS FRUTAS ---");
        for (Fruta fruta : frutas) {
            fruta.mostrarInformacion();
        }
        Fruta frutaMasVitaminas = encontrarFrutaConMasVitaminas(frutas);
        System.out.println("La fruta con más vitaminas es: " + frutaMasVitaminas.getNombre() + " con " + frutaMasVitaminas.getNroVitaminas() + " vitaminas");
        System.out.println("\n-vitamoina especifica de:");
        String frutaBuscada = "Naranja";
        mostrarVitaminasDeFruta(frutas, frutaBuscada);
        int totalVitaminasCitricas = contarVitaminasEnFrutasCitricas(frutas);
        System.out.println("Total de vitaminas en frutas cítricas: " + totalVitaminasCitricas);

        System.out.println("\norden por vitaminas");
        Fruta[] frutasOrdenadas = ordenarFrutasPorVitaminas(frutas);
        for (Fruta fruta : frutasOrdenadas) {
            String primeraVitamina = fruta.getNroVitaminas() > 0 ? fruta.getVitaminas()[0] : "Sin vitaminas";
            System.out.println(fruta.getNombre() + " - Primera vitamina: " + primeraVitamina);
        }
    }
    public static Fruta encontrarFrutaConMasVitaminas(Fruta[] frutas) {
        Fruta maxFruta = frutas[0];
        for (Fruta fruta : frutas) {
            if (fruta.getNroVitaminas() > maxFruta.getNroVitaminas()) {
                maxFruta = fruta;
            }
        }
        return maxFruta;
    }
    public static void mostrarVitaminasDeFruta(Fruta[] frutas, String nombreFruta) {
        for (Fruta fruta : frutas) {
            if (fruta.getNombre().equalsIgnoreCase(nombreFruta)) {
                System.out.println("Vitaminas de " + nombreFruta + ": " +
                        Arrays.toString(fruta.getVitaminas()));
                return;
            }
        }
        System.out.println("Fruta '" + nombreFruta + "' no encontrada");
    }
    public static int contarVitaminasEnFrutasCitricas(Fruta[] frutas) {
        int total = 0;
        for (Fruta fruta : frutas) {
            if (fruta.getTipo().equalsIgnoreCase("cítrica")) {
                total += fruta.getNroVitaminas();
                System.out.println(fruta.getNombre() + " (cítrica) tiene " +
                        fruta.getNroVitaminas() + " vitaminas");
            }
        }
        return total;
    }
    public static Fruta[] ordenarFrutasPorVitaminas(Fruta[] frutas) {
        Fruta[] copia = Arrays.copyOf(frutas, frutas.length);

        Arrays.sort(copia, new Comparator<Fruta>() {
            @Override
            public int compare(Fruta f1, Fruta f2) {
                String vit1 = f1.getNroVitaminas() > 0 ? f1.getVitaminas()[0] : "";
                String vit2 = f2.getNroVitaminas() > 0 ? f2.getVitaminas()[0] : "";
                return vit1.compareTo(vit2);
            }
        });

        return copia;
    }
}
