package Practica1.POLIMORFISMO.ej11;

public class Main{
    public static void main(String[] args) {
        Crucero crucero1 = new Crucero("Caribe Paradise", "Miami", "Bahamas");
        Crucero crucero2 = new Crucero("Mediterranean Dream", "Barcelona", "Italia");
        Pasajero pasajero1 = new Pasajero("Juan Vargas", 35, "Masculino", 502, 500.0);
        Pasajero pasajero2 = new Pasajero("Martina Vasques", 28, "Femenino", 603, 1000.0);
        Pasajero pasajero3 = new Pasajero("Wilmer Montero", 42, "Masculino", 401, 925.0);
        Pasajero pasajero4 = new Pasajero("Ana García", 31, "Femenino", 305, 750.0);
        Pasajero pasajero5 = new Pasajero("Carlos López", 45, "Masculino", 208, 850.0);

        System.out.println(" 2 cruceros y 5 pasajeros creados exitosamente!\n");
        crucero1.agregarPasajero(pasajero1);
        crucero1.agregarPasajero(pasajero2);
        crucero1.agregarPasajero(pasajero3);
        System.out.println(" 3 pasajeros agregados al Crucero 1");
        crucero2.agregarPasajero(pasajero4);
        crucero2.agregarPasajero(pasajero5);
        System.out.println("2 pasajeros agregados al Crucero 2\n");
        System.out.println("3. PROBANDO OPERADORES ++ Y -- (MOSTRAR/LEER):");
        System.out.println("\n--- Operador ++ (Leer) en Pasajeros ---");
        pasajero1.incrementar();
        pasajero2.incrementar();
        System.out.println("\nOperador  (Mostrar) en Pasajeros ");
        pasajero1.decrementar();
        pasajero2.decrementar();
        System.out.println("\n Operador ++ (Leer) en Cruceros ");
        crucero1.incrementar();
        crucero2.incrementar();
        System.out.println("\n Operador  (Mostrar) en Cruceros ");
        crucero1.decrementar();
        crucero2.decrementar();
        System.out.println("\n4. PROBANDO OPERADOR == (SUMA TOTAL PASAJES):");
        crucero1.igual();
        crucero2.igual();
        System.out.println("\n5. PROBANDO OPERADOR + (COMPARAR PASAJEROS):");
        crucero1.sumar(crucero2);
        System.out.println("\n6. PROBANDO OPERADOR - (DISTRIBUCIÓN POR GÉNERO):");
        crucero1.restar();
        crucero2.restar();

    }
}
