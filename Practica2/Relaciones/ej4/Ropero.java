package Practica2.ej4;

import java.util.ArrayList;

class Ropero {
    private String material;
    private ArrayList<Ropa> prendas;
    private int nroRopas;
    private static final int CAPACIDAD_MAXIMA = 20;
    
    public Ropero(String material) {
        this.material = material;
        this.prendas = new ArrayList<>();
        this.nroRopas = 0;
    }
    
    public boolean adicionarPrenda(Ropa prenda) {
        if (nroRopas < CAPACIDAD_MAXIMA) {
            prendas.add(prenda);
            nroRopas++;
            System.out.println("✓ Prenda agregada: " + prenda);
            return true;
        } else {
            System.out.println("✗ Ropero lleno, no se puede agregar más prendas");
            return false;
        }
    }
    
    public void eliminarPorMaterial(String material) {
        prendas.removeIf(prenda -> prenda.getMaterial().equalsIgnoreCase(material));
        nroRopas = prendas.size();
        System.out.println("✓ Prendas de material '" + material + "' eliminadas");
    }
    
    public void eliminarPorTipo(String tipo) {
        prendas.removeIf(prenda -> prenda.getTipo().equalsIgnoreCase(tipo));
        nroRopas = prendas.size();
        System.out.println("✓ Prendas de tipo '" + tipo + "' eliminadas");
    }
    
    public void mostrarPrendasMaterial(String material) {
        System.out.println("\n--- Prendas de material: " + material + " ---");
        for (Ropa prenda : prendas) {
            if (prenda.getMaterial().equalsIgnoreCase(material)) {
                System.out.println("- " + prenda);
            }
        }
    }
    
    public void mostrarPrendasTipo(String tipo) {
        System.out.println("\n--- Prendas de tipo: " + tipo + " ---");
        for (Ropa prenda : prendas) {
            if (prenda.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println("- " + prenda);
            }
        }
    }
    
    public void mostrarTodasPrendas() {
        System.out.println("\n--- Todas las prendas en el ropero (" + material + ") ---");
        for (Ropa prenda : prendas) {
            System.out.println("- " + prenda);
        }
    }
}
