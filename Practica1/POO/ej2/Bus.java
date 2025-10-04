public class Bus {
    private int cantPasajeros;
    private int capacidadMaxima;
    private double totalRecaudado;
    private  double pasaje = 1.50;
    public Bus(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantPasajeros = 0;
        this.totalRecaudado = 0;
    }
    public void subirPasajeros(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0");
            return;
        }
        int asientosDisponibles = capacidadMaxima - cantPasajeros;

        if (cantidad <= asientosDisponibles) {
            cantPasajeros += cantidad;
            System.out.println(cantidad + " pasajeros subieron al bus.");
        } else {
            cantPasajeros = capacidadMaxima;
            System.out.println("Solo pudieron subir " + asientosDisponibles + " pasajeros. El bus está lleno.");
        }
    }
    public void cobrarPasaje(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            System.out.println("La cantidad debe ser mayor a 0");
            return;
        }

        double totalCobrado = cantidadPasajeros * pasaje;
        totalRecaudado += totalCobrado;
        System.out.println("Se cobró Bs. " + totalCobrado + " a " + cantidadPasajeros + " pasajeros.");
    }
    public void mostrarAsientosDisponibles() {
        int disponibles = capacidadMaxima - cantPasajeros;
        System.out.println("Asientos disponibles: " + disponibles + " de " + capacidadMaxima);
    }
    

}