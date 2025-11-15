package Practica2.Excepciones.ej4;

public class Main {
    public static void main(String[] args) {
        SistemaInventarioConExcepciones inventario = new SistemaInventarioConExcepciones();
    
        try {
            inventario.agregarProducto(new Producto("P001", "Laptop", 5000, 10));
            inventario.agregarProducto(new Producto("P002", "Mouse", 50, 100));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
        try {
            inventario.agregarProducto(new Producto("P001", "Tablet", 1000, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
        
        inventario.mostrarInventario();
        try {
            inventario.venderProducto("P001", 2);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }
        try {
            inventario.venderProducto("P999", 1);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }
        try {
            inventario.venderProducto("P001", 20);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }
        
        inventario.mostrarInventario();
    }
}

