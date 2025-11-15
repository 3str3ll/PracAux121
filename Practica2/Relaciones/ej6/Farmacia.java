package Practica2.Relaciones.ej6;
import java.util.ArrayList;
import java.util.Date;
public class Farmacia {
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario;
    private ArrayList<Medicamento> inventario;
    private ArrayList<Empleado> empleados;
    private ArrayList<Venta> ventas;
    
    public Farmacia(String nombre, String direccion, String telefono, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.inventario = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    // COMPOSICIÓN: Los empleados se crean con la farmacia
    public void contratarEmpleado(String nombre, String cargo, String turno, double salario) {
        Empleado emp = new Empleado(nombre, cargo, turno, salario);
        empleados.add(emp);
        System.out.println("✓ " + nombre + " contratado como " + cargo);
    }
    
    // AGREGACIÓN: Los medicamentos existen independientemente
    public void agregarMedicamento(Medicamento med) {
        inventario.add(med);
        System.out.println("✓ " + med.getNombre() + " agregado al inventario");
    }
    
    // AGREGACIÓN: Las ventas se crean con clientes existentes
    public Venta crearVenta(String numeroVenta, Cliente cliente) {
        Venta venta = new Venta(numeroVenta, cliente);
        ventas.add(venta);
        System.out.println("✓ Venta #" + numeroVenta + " creada para " + cliente.getNombre());
        return venta;
    }
    
    public Medicamento buscarMedicamento(String nombre) {
        for (Medicamento med : inventario) {
            if (med.getNombre().equalsIgnoreCase(nombre)) {
                return med;
            }
        }
        return null;
    }
    
    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO " + nombre + " ===");
        for (Medicamento med : inventario) {
            System.out.println("- " + med);
        }
    }
    
    public void mostrarEmpleados() {
        System.out.println("\n=== EMPLEADOS " + nombre + " ===");
        for (Empleado emp : empleados) {
            System.out.println("- " + emp);
        }
    }
    
    public void mostrarVentas() {
        System.out.println("\n=== VENTAS " + nombre + " ===");
        for (Venta venta : ventas) {
            venta.mostrarVenta();
        }
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public ArrayList<Medicamento> getInventario() { return inventario; }
}

