package Practica1.POO.ej7;
public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;
    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 50;
    }
    public void alimentar() {
        energia += 20;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nombre + " ha sido alimentado. Energía actual: " + energia);
    }
    public void jugar() {
        if (energia >= 15) {
            energia -= 15;
            System.out.println(nombre + " ha jugado. Energía actual: " + energia);
        } else {
            System.out.println(nombre + " está demasiado cansado para jugar. Energía: " + energia);
        }
    }
    public void mostrarInfo() {
        System.out.println("informacion");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Energía: " + energia);
        System.out.println("Estado: " + (energia > 70 ? "Muy activo" :
                energia > 30 ? "Normal" : "Cansado"));
    }
    public String getNombre() {
        return nombre;
    }
}
