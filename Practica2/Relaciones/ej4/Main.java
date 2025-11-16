package Practica2.ej4;
public class Main {
    public static void main(String[] args) {
        System.out.println("👕 SISTEMA DE GESTIÓN DE ROPERO\n");
        
        Ropero ropero = new Ropero("Madera");
        ropero.adicionarPrenda(new Ropa("Camisa", "Algodón"));
        ropero.adicionarPrenda(new Ropa("Pantalón", "Jean"));
        ropero.adicionarPrenda(new Ropa("Chaqueta", "Cuero"));
        ropero.adicionarPrenda(new Ropa("Camisa", "Seda"));
        ropero.adicionarPrenda(new Ropa("Falda", "Algodón"));
        ropero.mostrarTodasPrendas();
        ropero.mostrarPrendasMaterial("Algodón");
        ropero.mostrarPrendasTipo("Camisa");
        ropero.eliminarPorMaterial("Algodón");
        ropero.mostrarTodasPrendas();
        ropero.eliminarPorTipo("Chaqueta");
        ropero.mostrarTodasPrendas();
    }
}



