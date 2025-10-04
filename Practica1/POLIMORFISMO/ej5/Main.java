package Practica1.POLIMORFISMO.ej5;

public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular("+51 987654321", "Juan Pérez", 128.0, 8, 25);
        Celular celular2 = new Celular("+51 912345678", "María García", 64.0, 6, 15);

        System.out.println("\n ANTES de aplicar operadores ");
        celular1.mostrarDatos();
        celular2.mostrarDatos();
        System.out.println("1. Aplicando ++ (incrementar apps) a Celular 1:");
        celular1.incrementarApps();
        System.out.println("\n2. Aplicando -- (decrementar espacio) a Celular 1:");
        celular1.decrementarEspacio();
        System.out.println("\n3. Aplicando ++ (incrementar apps) a Celular 2:");
        celular2.incrementarApps();
        System.out.println("\n4. Aplicando -- (decrementar espacio) a Celular 2:");
        celular2.decrementarEspacio();
        System.out.println("\n5. Aplicando operadores múltiples veces:");
        System.out.println("   - Celular 1: ++ y -- otra vez");
        celular1.incrementarApps();
        celular1.decrementarEspacio();
        System.out.println("\n   - Celular 2: ++ dos veces");
        celular2.incrementarApps();
        celular2.incrementarApps();
        System.out.println("\n DESPUÉS de aplicar operadores ");
        celular1.mostrarDatos();
        celular2.mostrarDatos();
        Celular celularOriginal1 = new Celular("+51 987654321", "Juan Pérez", 128.0, 8, 25);
        Celular celularOriginal2 = new Celular("+51 912345678", "María García", 64.0, 6, 15);System.out.println("COMPARACIÓN CELULAR 1:");
        System.out.println("Inicial:  " + celularOriginal1.toString());
        System.out.println("Final:    " + celular1.toString());
        System.out.printf ("Cambios:  +%d apps, -%.1fGB espacio\n",
                (celular1.getNroApp() - celularOriginal1.getNroApp()),
                (celularOriginal1.getEspacio() - celular1.getEspacio()));

        System.out.println("\nCOMPARACIÓN CELULAR 2:");
        System.out.println("Inicial:  " + celularOriginal2.toString());
        System.out.println("Final:    " + celular2.toString());
        System.out.printf ("Cambios:  +%d apps, -%.1fGB espacio\n",
                (celular2.getNroApp() - celularOriginal2.getNroApp()),
                (celularOriginal2.getEspacio() - celular2.getEspacio()));

        Celular celular3 = new Celular("+51 999888777", "Carlos López", 3.0, 4, 8);
        System.out.println("Celular con espacio limitado:");
        celular3.mostrarDatos();

        System.out.println("\nIntentando decrementar espacio (--):");
        celular3.decrementarEspacio(); 
        celular3.mostrarDatos();
    }
}
