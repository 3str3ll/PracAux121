package Practica1.POLIMORFISMO.ej3;

public class Main {
    public static void main(String[] args) {
        // a)
        System.out.println("1. MATRIZ IDENTIDAD (constructor predeterminado):");
        Matriz identidad = new Matriz();
        identidad.mostrar();
        // b)
        System.out.println("2. MATRIZ PERSONALIZADA:");
        float[][] datos1 = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                datos1[i][j] = i * 10 + j + 1;
            }
        }
        Matriz matrizA = new Matriz(datos1);
        matrizA.mostrar();
        //
        System.out.println("3. SEGUNDA MATRIZ PERSONALIZADA:");
        float[][] datos2 = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                datos2[i][j] = (i + 1) * 2 + (j + 1);
            }
        }
        Matriz matrizB = new Matriz(datos2);
        matrizB.mostrar();
        // c)
        System.out.println("4. SUMA DE MATRICES (A + B):");
        Matriz suma = matrizA.sumar(matrizB);
        suma.mostrar();
        System.out.println("   Detalle de suma (primeros 4 elementos):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("   A[%d][%d]=%.1f + B[%d][%d]=%.1f = %.1f\n",
                        i, j, matrizA.get(i, j), i, j, matrizB.get(i, j), suma.get(i, j));
            }
        }
        System.out.println();
        // c)
        System.out.println("5. RESTA DE MATRICES (A - B):");
        Matriz resta = matrizA.restar(matrizB);
        resta.mostrar();
        System.out.println("   Detalle de resta (primeros 4 elementos):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("   A[%d][%d]=%.1f - B[%d][%d]=%.1f = %.1f\n",
                        i, j, matrizA.get(i, j), i, j, matrizB.get(i, j), resta.get(i, j));
            }
        }
        System.out.println();
        // d)
        System.out.println("6. PRUEBA DE IGUALDAD:");
        System.out.println("   ¿Matriz A es igual a Matriz B? " + matrizA.igual(matrizB));
        System.out.println("   Creando copia de Matriz A...");
        Matriz matrizC = new Matriz(datos1);
        System.out.println("   ¿Matriz A es igual a Matriz C (copia)? " + matrizA.igual(matrizC));
        System.out.println("   ¿Matriz identidad es igual a Matriz A? " + identidad.igual(matrizA));
        System.out.println();
        System.out.println("7. OPERACIONES CON MATRIZ IDENTIDAD:");
        System.out.println("   Suma: Identidad + A");
        Matriz sumaConIdentidad = identidad.sumar(matrizA);
        sumaConIdentidad.mostrarSubmatriz4x4();
        System.out.println("   Resta: A - Identidad");
        Matriz restaConIdentidad = matrizA.restar(identidad);
        restaConIdentidad.mostrarSubmatriz4x4();
        System.out.println("8. CASOS ESPECIALES:");
        System.out.println("   ¿Identidad + Identidad = 2*Identidad?");
        Matriz dobleIdentidad = identidad.sumar(identidad);
        float[][] datosDobleIdentidad = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                datosDobleIdentidad[i][j] = (i == j) ? 2.0f : 0.0f;
            }
        }
        Matriz matrizDobleIdentidad = new Matriz(datosDobleIdentidad);
        System.out.println("   Resultado: " + dobleIdentidad.igual(matrizDobleIdentidad));

    }
}
