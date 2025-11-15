package Practica2.Excepciones.ej4;

import java.util.ArrayList;
public class SistemaInventarioConExcepciones {
    private ArrayList<Producto> productos;
    
    public SistemaInventarioConExcepciones() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) throws IllegalArgumentException {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(p.getCodigo())) {
                throw new IllegalArgumentException("Código '" + p.getCodigo() + "' ya existe");
            }
        }
        
        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new IllegalArgumentException("Precio o stock no pueden ser negativos");
        }
        
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }
    
    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        throw new ProductoNoEncontradoException("Producto '" + codigo + "' no encontrado");
    }
    
    public void venderProducto(String codigo, int cantidad) 
            throws ProductoNoEncontradoException, StockInsuficienteException {
        
        Producto producto = buscarProducto(codigo);
        
        if (producto.getStock() < cantidad) {
            throw new StockInsuficienteException("Stock insuficiente. Disponible: " + producto.getStock());
        }
        
        producto.setStock(producto.getStock() - cantidad);
        System.out.println("Venta realizada: " + cantidad + " x " + producto.getNombre());
    }
    
    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO ===");
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}
    
    