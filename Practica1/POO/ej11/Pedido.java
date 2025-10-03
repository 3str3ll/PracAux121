package Practica1.POO.ej11;

public class Pedido {
    private int numeroPedido;
    private String estado; 
    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.estado = "registrado";
        System.out.println("Pedido #" + numeroPedido + " creado - Estado: " + estado);
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
        System.out.println("Pedido #" + numeroPedido + " - Estado actualizado: " + estado);
    }
    public void prepararPedido() {
        this.estado = "preparado";
        System.out.println("Pedido #" + numeroPedido + " está siendo preparado");
    }

    public void entregarPedido() {
        this.estado = "entregado";
        System.out.println("Pedido #" + numeroPedido + " ha sido entregado");
    }
    public void mostrarInformacion() {
        System.out.println("Pedido #" + numeroPedido + " | Estado: " + estado);
    }
}