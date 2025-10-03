public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, double precio, int stockInicial) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stockInicial;
    }
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a vender debe ser mayor a 0");
            return;
        }

        if (cantidad <= stock) {
            stock -= cantidad;
            double totalVenta = cantidad * precio;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
            System.out.println("Total de la venta: $" + totalVenta);
            System.out.println("Stock restante: " + stock);
        } else {
            System.out.println("Error: No hay suficiente stock para vender " + cantidad + " unidades");
            System.out.println("Stock disponible: " + stock);
        }
    }
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a reabastecer debe ser mayor a 0");
            return;
        }
        stock += cantidad;
        System.out.println("Stock reabastecido: " + cantidad + " unidades de " + nombre);
        System.out.println("Nuevo stock total: " + stock);
    }
    public void mostrarInformacion() {
        System.out.println("\ninformacion de producto");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

}