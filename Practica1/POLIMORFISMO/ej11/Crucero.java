package Practica1.POLIMORFISMO.ej11;

public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private Pasajero[][] pasajeros; // [3][100] según el diagrama

    // Constantes
    private static final int FILAS = 3;
    private static final int COLUMNAS = 100;

    // Constructor
    public Crucero(String nombre, String paisOrigen, String paisDestino) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.nroPasajeros = 0;
        this.pasajeros = new Pasajero[FILAS][COLUMNAS];
    }

    // b) Sobrecarga del operador ++ (simulada) - para leer/entrada
    public void incrementar() {
        System.out.println("Leyendo datos del crucero: " + this.nombre);
        System.out.println("  Origen: " + paisOrigen + " -> Destino: " + paisDestino);
        System.out.println("  Pasajeros registrados: " + nroPasajeros);
    }

    // b) Sobrecarga del operador -- (simulada) - para mostrar/salida
    public void decrementar() {
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│                   DATOS DEL CRUCERO                 │");
        System.out.println("├─────────────────────────────────────────────────────┤");
        System.out.printf("│ Nombre: %-42s │\n", nombre);
        System.out.printf("│ Origen: %-42s │\n", paisOrigen);
        System.out.printf("│ Destino: %-41s │\n", paisDestino);
        System.out.printf("│ Pasajeros: %-38d │\n", nroPasajeros);
        System.out.println("└─────────────────────────────────────────────────────┘");
    }

    // c) Sobrecarga del operador == (simulada) - muestra suma total del costo de pasajes
    public void igual() {
        double total = calcularTotalPasajes();
        System.out.println("=== SUMA TOTAL DE PASAJES ===");
        System.out.println("Crucero: " + nombre);
        System.out.printf("Total recaudado: $%.2f\n", total);
        System.out.println("=============================");
    }

    // d) Sobrecarga del operador "+" (simulada) - compara cantidad de pasajeros entre dos cruceros
    public void sumar(Crucero otro) {
        System.out.println("=== COMPARACIÓN DE PASAJEROS ===");
        System.out.println("Crucero 1: " + this.nombre + " - " + this.nroPasajeros + " pasajeros");
        System.out.println("Crucero 2: " + otro.nombre + " - " + otro.nroPasajeros + " pasajeros");

        if (this.nroPasajeros == otro.nroPasajeros) {
            System.out.println("✅ Ambos cruceros tienen la MISMA cantidad de pasajeros");
        } else {
            System.out.println("❌ Los cruceros tienen DIFERENTE cantidad de pasajeros");
            System.out.println("Diferencia: " + Math.abs(this.nroPasajeros - otro.nroPasajeros) + " pasajeros");
        }
        System.out.println("================================");
    }

    // e) Sobrecarga del operador "-" (simulada) - muestra cantidad de hombres y mujeres
    public void restar() {
        int hombres = 0;
        int mujeres = 0;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (pasajeros[i][j] != null) {
                    if ("Masculino".equalsIgnoreCase(pasajeros[i][j].getGenero()) ||
                            "Hombre".equalsIgnoreCase(pasajeros[i][j].getGenero()) ||
                            "M".equalsIgnoreCase(pasajeros[i][j].getGenero())) {
                        hombres++;
                    } else if ("Femenino".equalsIgnoreCase(pasajeros[i][j].getGenero()) ||
                            "Mujer".equalsIgnoreCase(pasajeros[i][j].getGenero()) ||
                            "F".equalsIgnoreCase(pasajeros[i][j].getGenero())) {
                        mujeres++;
                    }
                }
            }
        }

        System.out.println("=== DISTRIBUCIÓN POR GÉNERO ===");
        System.out.println("Crucero: " + nombre);
        System.out.println("Hombres: " + hombres);
        System.out.println("Mujeres: " + mujeres);
        System.out.println("Total: " + (hombres + mujeres));
        System.out.println("===============================");
    }

    // Método para agregar pasajeros
    public boolean agregarPasajero(Pasajero pasajero) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (pasajeros[i][j] == null) {
                    pasajeros[i][j] = pasajero;
                    nroPasajeros++;
                    return true;
                }
            }
        }
        return false;
    }

    // Método para calcular el total de pasajes
    public double calcularTotalPasajes() {
        double total = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (pasajeros[i][j] != null) {
                    total += pasajeros[i][j].getCostoPasaje();
                }
            }
        }
        return total;
    }

    // Método para mostrar todos los pasajeros
    public void mostrarPasajeros() {
        System.out.println("=== LISTA DE PASAJEROS DEL CRUCERO " + nombre.toUpperCase() + " ===");
        int contador = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (pasajeros[i][j] != null) {
                    contador++;
                    System.out.printf("%2d. %-20s | Hab.%3d | $%7.2f | %s\n",
                            contador,
                            pasajeros[i][j].getNombre(),
                            pasajeros[i][j].getNroHabitacion(),
                            pasajeros[i][j].getCostoPasaje(),
                            pasajeros[i][j].getGenero());
                }
            }
        }
        if (contador == 0) {
            System.out.println("No hay pasajeros registrados.");
        }
        System.out.println("==========================================================");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }
}

