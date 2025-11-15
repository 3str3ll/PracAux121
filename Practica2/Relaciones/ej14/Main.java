package Practica2.Relaciones.ej14;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("🏢 SISTEMA DE GESTIÓN EMPRESARIAL\n");
        
        Empresa empresa = new Empresa("Tech Solutions S.A.");
        
        // Contratar empleados
        empresa.agregarEmpleado(new Empleado("Juan Pérez", "Programador", 5000));
        empresa.agregarEmpleado(new Empleado("María López", "Diseñadora", 4500));
        empresa.agregarEmpleado(new Empleado("Carlos Ruiz", "Gerente", 8000));
        empresa.agregarEmpleado(new Empleado("Ana Torres", "Analista", 5500));
        
        // Mostrar información
        empresa.mostrarInformacion();
        
        // Buscar empleado
        System.out.println("\n--- Búsqueda de empleado ---");
        Empleado emp = empresa.buscarEmpleado("María López");
        if (emp != null) {
            System.out.println("Encontrado: " + emp);
        } else {
            System.out.println("Empleado no encontrado");
        }
        
        // Calcular promedio salarial
        System.out.printf("\nPromedio salarial: Bs.%.2f\n", empresa.promedioSalarial());
        
        // Empleados con salario mayor a 5000
        System.out.println("\n--- Empleados con salario > Bs.5000 ---");
        ArrayList<Empleado> altosSalarios = empresa.empleadosSalarioMayor(5000);
        for (Empleado e : altosSalarios) {
            System.out.println("- " + e);
        }
        
        // Eliminar empleado
        empresa.eliminarEmpleado("Juan Pérez");
        empresa.mostrarInformacion();
    }
}

