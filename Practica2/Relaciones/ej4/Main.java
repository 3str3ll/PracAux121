package Practica2.ej4;
public class Main {
    public static void main(String[] args) {
        System.out.println("👕 SISTEMA DE GESTIÓN DE ROPERO\n");
        
        Ropero ropero = new Ropero("Madera");
        
        // Agregar prendas
        ropero.adicionarPrenda(new Ropa("Camisa", "Algodón"));
        ropero.adicionarPrenda(new Ropa("Pantalón", "Jean"));
        ropero.adicionarPrenda(new Ropa("Chaqueta", "Cuero"));
        ropero.adicionarPrenda(new Ropa("Camisa", "Seda"));
        ropero.adicionarPrenda(new Ropa("Falda", "Algodón"));
        
        // Mostrar todas las prendas
        ropero.mostrarTodasPrendas();
        
        // Mostrar por material
        ropero.mostrarPrendasMaterial("Algodón");
        
        // Mostrar por tipo
        ropero.mostrarPrendasTipo("Camisa");
        
        // Eliminar por material
        ropero.eliminarPorMaterial("Algodón");
        ropero.mostrarTodasPrendas();
        
        // Eliminar por tipo
        ropero.eliminarPorTipo("Chaqueta");
        ropero.mostrarTodasPrendas();
    }
}



