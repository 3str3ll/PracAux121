package Practica1.POO.ej11;

public class Cliente {
    private String nombre;
    private String telefono;
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            this.telefono = telefono;
        }
    }
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " | Teléfono: " + telefono);
    }
    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', telefono='" + telefono + "'}";
    }
}

