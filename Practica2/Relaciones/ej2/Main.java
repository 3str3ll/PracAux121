package Practica2.ej2;
public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE GESTIÓN DE DEPARTAMENTOS\n");
        Departamento depto1 = new Departamento("Ventas");
        Departamento depto2 = new Departamento("TI");
        Empleado emp1 = new Empleado("Juan Pérez", "Vendedor", 3000);
        Empleado emp2 = new Empleado("María López", "Gerente Ventas", 5000);
        Empleado emp3 = new Empleado("Carlos Ruiz", "Programador", 4000);
        depto1.agregarEmpleado(emp1);
        depto1.agregarEmpleado(emp2);
        depto2.agregarEmpleado(emp3);
        depto1.mostrarEmpleados();
        depto2.mostrarEmpleados();
        depto1.cambioSalario(10);
        depto1.mostrarEmpleados();
        System.out.println("\n¿Carlos está en Ventas? " + depto1.tieneEmpleado(emp3));
        depto1.moverEmpleadosA(depto2);
        depto1.mostrarEmpleados();
        depto2.mostrarEmpleados();
    }
}