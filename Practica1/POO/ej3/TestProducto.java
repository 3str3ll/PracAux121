public class TestProducto {

        public static void main(String[] args) {
            Producto laptop = new Producto("Laptop Gamer", 1200.00, 10);
            Producto mouse = new Producto("Mouse Inalámbrico", 25.50, 50);
            System.out.println("GESTIÓN DE INVENTARIO\n");
            laptop.mostrarInformacion();
            mouse.mostrarInformacion();
            System.out.println("\n vendiendo");
            laptop.vender(3);
            mouse.vender(15);
            System.out.println("\n intento de venta con stock insuficiente");
            laptop.vender(10);
            System.out.println("\nrebasteciendo");
            laptop.reabastecer(20);
            mouse.reabastecer(30);
            System.out.println("\nventa tras reabastecimiento");
            laptop.vender(5);
            mouse.vender(25);
            System.out.println("\n  inventario");
            laptop.mostrarInformacion();
            mouse.mostrarInformacion();
            System.out.println("\npruebas de validacion");
            laptop.vender(-5);
            laptop.reabastecer(0);
        }
    }