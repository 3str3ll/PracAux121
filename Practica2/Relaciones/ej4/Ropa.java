package Practica2.ej4;

import java.util.ArrayList;

class Ropa {
    private String tipo;
    private String material;
    
    public Ropa(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }
    
    public String getTipo() { return tipo; }
    public String getMaterial() { return material; }
    
    public String toString() {
        return tipo + " (" + material + ")";
    }
}
