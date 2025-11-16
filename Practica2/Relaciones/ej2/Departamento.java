package Practica2.ej2;
import java.util.ArrayList;
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
        System.out.println( emp.getNombre() + " agregado al departamento " + nombre);
    }

    public void mostrarEmpleados() {
        System.out.println("\n--- Empleados de " + nombre + " ---");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados");
        } else {
            for (Empleado emp : empleados) {
                System.out.println("- " + emp);
            }
        }
    }

    public void cambioSalario(double porcentaje) {
        for (Empleado emp : empleados) {
            double nuevoSalario = emp.getSalario() * (1 + porcentaje/100);
            emp.setSalario(nuevoSalario);
        }
        System.out.println("Salarios actualizados en " + porcentaje + "%");
    }

    public boolean tieneEmpleado(Empleado emp) {
        return empleados.contains(emp);
    }

    public void moverEmpleadosA(Departamento otroDepto) {
        for (Empleado emp : empleados) {
            otroDepto.agregarEmpleado(emp);
        }
        empleados.clear();
        System.out.println("Todos los empleados movidos a " + otroDepto.nombre);
    }

    public ArrayList<Empleado> getEmpleados() { return empleados; }
}

