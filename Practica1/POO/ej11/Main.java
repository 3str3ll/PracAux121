package Practica1.POO.ej11;


public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE CAFETERÍA \n");
        Cliente cliente1 = new Cliente("María González", "555-1234");
        Pedido pedido1 = new Pedido(1001);
        System.out.println("\n MOSTRANDO INFORMACIÓN ");
        cliente1.mostrarInformacion();
        pedido1.mostrarInformacion();
        System.out.println("\nSIMULANDO PROCESO DEL PEDIDO ");
        pedido1.prepararPedido();
        pedido1.entregarPedido();
        System.out.println("\nUSANDO GETTERS Y SETTERS ");
        System.out.println("Nombre del cliente: " + cliente1.getNombre());
        System.out.println("Estado del pedido: " + pedido1.getEstado());
        cliente1.setTelefono("555-5678");
        pedido1.setEstado("completado");

        System.out.println("\nIndformacion");
        cliente1.mostrarInformacion();
        pedido1.mostrarInformacion();
    }
}
