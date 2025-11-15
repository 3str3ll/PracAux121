package Practica2.Relaciones.ej14;
import java.util.ArrayList;
public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
        System.out.println("✓ " + emp.getNombre() + " contratado en " + nombre);
    }
    
    public void mostrarInformacion() {
        System.out.println("\n=== " + nombre + " ===");
        System.out.println("Total empleados: " + empleados.size());
        System.out.println("--- Lista de Empleados ---");
        for (Empleado emp : empleados) {
            System.out.println("- " + emp);
        }
    }
    
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                return emp;
            }
        }
        return null;
    }
    
    public boolean eliminarEmpleado(String nombre) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equalsIgnoreCase(nombre)) {
                Empleado emp = empleados.remove(i);
                System.out.println("✓ " + emp.getNombre() + " despedido de " + this.nombre);
                return true;
            }
        }
        System.out.println("✗ Empleado no encontrado: " + nombre);
        return false;
    }
    
    public double promedioSalarial() {
        if (empleados.isEmpty()) return 0;
        
        double total = 0;
        for (Empleado emp : empleados) {
            total += emp.getSalario();
        }
        return total / empleados.size();
    }
    
    public ArrayList<Empleado> empleadosSalarioMayor(double salarioMinimo) {
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getSalario() > salarioMinimo) {
                resultado.add(emp);
            }
        }
        return resultado;
    }
}
