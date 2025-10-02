public class TestBus {
    public static void main(String[] args) {
        Bus miBus = new Bus(50);
        System.out.println("\n--- Subiendo pasajeros ---");
        miBus.subirPasajeros(30);
        miBus.mostrarAsientosDisponibles();
        System.out.println("\n--- Cobrando pasajes ---");
        miBus.cobrarPasaje(30);

    }
}