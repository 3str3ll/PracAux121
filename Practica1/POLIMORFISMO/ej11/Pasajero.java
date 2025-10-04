package Practica1.POLIMORFISMO.ej11;

public class Pasajero {
    private String nombre;
    private int edad;
    private String genero;
    private int nroHabitacion;
    private double costoPasaje;
    public Pasajero(String nombre, int edad, String genero, int nroHabitacion, double costoPasaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nroHabitacion = nroHabitacion;
        this.costoPasaje = costoPasaje;
    }
    public void incrementar() {
        System.out.println("Leyendo datos del pasajero: " + this.nombre);
        System.out.println("  Edad: " + edad + ", Género: " + genero);
        System.out.println("  Habitación: " + nroHabitacion + ", Costo: $" + costoPasaje);
    }
    public void decrementar() {
        System.out.println("=== DATOS DEL PASAJERO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Habitación: " + nroHabitacion);
        System.out.println("Costo pasaje: $" + costoPasaje);
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    @Override
    public String toString() {
        return String.format("Pasajero{nombre='%s', edad=%d, genero='%s', habitacion=%d, costo=%.2f}",
                nombre, edad, genero, nroHabitacion, costoPasaje);
    }
}
