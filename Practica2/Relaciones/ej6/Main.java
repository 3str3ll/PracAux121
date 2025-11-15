package Practica2.Relaciones.ej6;
import java.util.Date;
public class Main{
    public static void main(String[] args) {
         System.out.println(" SISTEMA COMPLETO DE FARMACIA\n");
        
        // Crear farmacia (COMPOSICIÓN con empleados)
        Farmacia farmacia = new Farmacia("Farmacia Central", "Av. Principal 123", "2222222", "08:00-22:00");
        
        // Contratar empleados (COMPOSICIÓN)
        farmacia.contratarEmpleado("Juan Pérez", "Farmacéutico", "Mañana", 5000);
        farmacia.contratarEmpleado("María López", "Cajero", "Tarde", 3500);
        
        // Crear medicamentos (AGREGACIÓN)
        Medicamento paracetamol = new Medicamento("Paracetamol", "Analgésico", 5.0, 100, "Bayer", new Date());
        Medicamento amoxicilina = new Medicamento("Amoxicilina", "Antibiótico", 15.0, 50, "Pfizer", new Date());
        Medicamento tapsin = new Medicamento("Tapsin", "Gripe", 8.0, 30, "Lukol", new Date());
        
        // Agregar medicamentos a la farmacia (AGREGACIÓN)
        farmacia.agregarMedicamento(paracetamol);
        farmacia.agregarMedicamento(amoxicilina);
        farmacia.agregarMedicamento(tapsin);
        
        // Crear clientes (independientes)
        Cliente cliente1 = new Cliente("Carlos Rojas", "1234567", "777888999", "carlos@email.com");
        Cliente cliente2 = new Cliente("Ana Torres", "7654321", "666555444", "ana@email.com");
        
        // Realizar ventas (AGREGACIÓN con clientes y medicamentos)
        Venta venta1 = farmacia.crearVenta("V001", cliente1);
        venta1.agregarMedicamento(paracetamol, 2);
        venta1.agregarMedicamento(tapsin, 1);
        
        Venta venta2 = farmacia.crearVenta("V002", cliente2);
        venta2.agregarMedicamento(amoxicilina, 1);
        
        // Mostrar información completa
        farmacia.mostrarEmpleados();
        farmacia.mostrarInventario();
        farmacia.mostrarVentas();
        
        // Demostrar relaciones
        System.out.println("\n=== DEMOSTRACIÓN DE RELACIONES ===");
        System.out.println("COMPOSICIÓN: Empleados existen solo con la farmacia");
        System.out.println(" AGREGACIÓN: Medicamentos existen independientemente");
        System.out.println("AGREGACIÓN: Clientes existen independientemente");
        System.out.println("ASOCIACIÓN: Venta conecta cliente con medicamentos");
        
        // Verificar que los medicamentos siguen existiendo fuera
        System.out.println("\nMedicamento fuera de farmacia: " + paracetamol.getNombre());
        System.out.println("Cliente fuera de venta: " + cliente1.getNombre());
    
    }
}