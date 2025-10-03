package Practica1.POLIMORFISMO.ej13;

public class Main {
    public static void main(String[] args) {
        MP4 miReproductor = new MP4("Sony", 16.0);
        miReproductor.mostrarCapacidad();
        System.out.println("\n AGREGANDO CANCIONES");
        miReproductor.agregarCancion("Back To Black", "Amy Winehouse", 100.0);
        miReproductor.agregarCancion("Lost On You", "LP", 150.0);
        miReproductor.agregarCancion("Rolling in the Deep", "Adele", 120.0);
        System.out.println("\n AGREGANDO VIDEOS ");
        miReproductor.agregarVideo("Heathens", "twenty one pilots", 50.0);
        miReproductor.agregarVideo("Harmonica Andromeda", "KSHMR", 70.0);
        miReproductor.agregarVideo("Without Me", "Halsey", 30.0);
        System.out.println("\n CONTENIDO ACTUAL DEL REPRODUCTOR:");
        miReproductor.mostrarCanciones();
        miReproductor.mostrarVideos();
        miReproductor.mostrarCapacidad();
        System.out.println("\n PROBANDO SOBRECARGA DE BORRAR CANCIONES:");

        System.out.println("Borrar por nombre:");
        miReproductor.borrarCancion("Lost On You");

        System.out.println("\nBorrar por artista:");
        miReproductor.borrarCancion("Amy Winehouse", true);

        System.out.println("\nIntentar borrar canción que no existe:");
        miReproductor.borrarCancion("Canción Inexistente", 200.0);
        System.out.println("\n PROBANDO OPERADOR '+' PARA AGREGAR CANCIONES:");

        System.out.println("Agregar canción nueva:");
        miReproductor.agregarCancion("Blinding Lights", "The Weeknd", 180.0);

        System.out.println("\n Intentar agregar canción duplicada:");
        miReproductor.agregarCancion("Blinding Lights", "The Weeknd", 180.0);
        System.out.println("\n PROBANDO OPERADOR '-' PARA AGREGAR VIDEOS:");

        System.out.println(" Agregar video nuevo:");
        miReproductor.agregarVideo("Levitating", "Dua Lipa", 45.0);

        System.out.println("\nb) Intentar agregar video duplicado:");
        miReproductor.agregarVideo("Levitating", "Dua Lipa", 45.0);

    }
}
