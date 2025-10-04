package Practica1.POLIMORFISMO.ej3;

public class Matriz {
    private float[][] matriz;
    private static final int TAMANIO = 10;
    public Matriz() {
        matriz = new float[TAMANIO][TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (i == j) {
                    matriz[i][j] = 1.0f; 
                } else {
                    matriz[i][j] = 0.0f; 
                }
            }
        }
    }
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
    public Matriz sumar(Matriz otra) {
        float[][] resultado = new float[TAMANIO][TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    public Matriz restar(Matriz otra) {
        float[][] resultado = new float[TAMANIO][TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                resultado[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
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
    public float get(int fila, int columna) {
        if (fila < 0 || fila >= TAMANIO || columna < 0 || columna >= TAMANIO) {
            throw new IllegalArgumentException("Índices fuera de rango");
        }
        return matriz[fila][columna];
    }
    public void set(int fila, int columna, float valor) {
        if (fila < 0 || fila >= TAMANIO || columna < 0 || columna >= TAMANIO) {
            throw new IllegalArgumentException("Índices fuera de rango");
        }
        matriz[fila][columna] = valor;
    }
    public void mostrar() {
        System.out.println("Matriz " + TAMANIO + "x" + TAMANIO + ":");
        for (int i = 0; i < Math.min(4, TAMANIO); i++) { 
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
    public float[][] getMatriz() {
        return matriz;
    }

    public static int getTamanio() {
        return TAMANIO;
    }
}