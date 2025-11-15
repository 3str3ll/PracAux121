package Practica2.Relaciones.ej6;
import java.util.ArrayList;
import java.util.Date;
public class Venta {
    private String numeroVenta;
    private double total;
    private Date fechaVenta;
    private Cliente cliente;
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Registro> registros;
    
    public Venta(String numeroVenta, Cliente cliente) {
        this.numeroVenta = numeroVenta;
        this.cliente = cliente;
        this.fechaVenta = new Date();
        this.medicamentos = new ArrayList<>();
        this.registros = new ArrayList<>();
        this.total = 0;
    }
    
    public void agregarMedicamento(Medicamento med, int cantidad) {
        if (med.getStock() >= cantidad) {
            medicamentos.add(med);
            total += med.getPrecio() * cantidad;
            med.reducirStock(cantidad);
            registros.add(new Registro(new Date(), cantidad, "VENTA"));
            System.out.println("✓ " + cantidad + " " + med.getNombre() + " agregado a la venta");
        } else {
            System.out.println("✗ Stock insuficiente de " + med.getNombre());
        }
    }
    
    public void mostrarVenta() {
        System.out.println("\n=== Venta #" + numeroVenta + " ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fechaVenta);
        System.out.println("Medicamentos:");
        for (Medicamento med : medicamentos) {
            System.out.println("  - " + med.getNombre() + " - Bs." + med.getPrecio());
        }
        System.out.println("TOTAL: Bs." + total);
    }
    
    // Getters
    public double getTotal() { return total; }
    public Cliente getCliente() { return cliente; }
    public ArrayList<Medicamento> getMedicamentos() { return medicamentos; }
}
