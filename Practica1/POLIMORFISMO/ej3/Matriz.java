package Practica1.POLIMORFISMO.ej3;

public class Matriz {
    private float[][] matriz;
    private static final int TAMANIO = 10;

    // a) Constructor para matriz identidad (valores predeterminados)
    public Matriz() {
        matriz = new float[TAMANIO][TAMANIO];
        // Inicializar como matriz identidad
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (i == j) {
                    matriz[i][j] = 1.0f; // Diagonal principal = 1
                } else {
                    matriz[i][j] = 0.0f; // Resto = 0
                }
            }
        }
    }

    // b) Constructor para instanciar con matriz específica
    public Matriz(float[][] datos) {
        if (datos.length != TAMANIO || datos[0].length != TAMANIO) {
            throw new IllegalArgumentException("La matriz debe ser de tamaño " + TAMANIO + "x" + TAMANIO);
        }
        matriz = new float[TAMANIO][TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                matriz[i][j] = datos[i][j];
            }
        }
    }

    // c) Método para sumar matrices
    public Matriz sumar(Matriz otra) {
        float[][] resultado = new float[TAMANIO][TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    // c) Método para restar matrices
    public Matriz restar(Matriz otra) {
        float[][] resultado = new float[TAMANIO][TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                resultado[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    // d) Método para verificar si dos matrices son iguales
    public boolean igual(Matriz otra) {
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (Math.abs(this.matriz[i][j] - otra.matriz[i][j]) > 0.0001f) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para obtener el valor en una posición específica
    public float get(int fila, int columna) {
        if (fila < 0 || fila >= TAMANIO || columna < 0 || columna >= TAMANIO) {
            throw new IllegalArgumentException("Índices fuera de rango");
        }
        return matriz[fila][columna];
    }

    // Método para establecer valor en una posición específica
    public void set(int fila, int columna, float valor) {
        if (fila < 0 || fila >= TAMANIO || columna < 0 || columna >= TAMANIO) {
            throw new IllegalArgumentException("Índices fuera de rango");
        }
        matriz[fila][columna] = valor;
    }

    // Método para mostrar la matriz (solo primeras 4x4 para mejor visualización)
    public void mostrar() {
        System.out.println("Matriz " + TAMANIO + "x" + TAMANIO + ":");
        for (int i = 0; i < Math.min(4, TAMANIO); i++) { // Mostrar solo 4x4 para mejor visualización
            for (int j = 0; j < Math.min(4, TAMANIO); j++) {
                System.out.printf("%8.2f", matriz[i][j]);
            }
            if (TAMANIO > 4) {
                System.out.print("  ...");
            }
            System.out.println();
        }
        if (TAMANIO > 4) {
            System.out.println("    ...");
        }
        System.out.println();
    }

    // Método para mostrar matriz completa
    public void mostrarCompleta() {
        System.out.println("Matriz completa " + TAMANIO + "x" + TAMANIO + ":");
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                System.out.printf("%8.2f", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para obtener una submatriz 4x4 (para pruebas)
    public void mostrarSubmatriz4x4() {
        System.out.println("Submatriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%8.2f", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Getters
    public float[][] getMatriz() {
        return matriz;
    }

    public static int getTamanio() {
        return TAMANIO;
    }
}