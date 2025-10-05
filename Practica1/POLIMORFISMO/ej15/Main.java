package Practica1.POLIMORFISMO.ej15;

public class Main {
    public static void main(String[] args) {
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 10);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 8);
        Ordenador pc1 = new Ordenador("LASIN-PC001", 1, 16, "Intel i7", true);
        Ordenador pc2 = new Ordenador("LASIN-PC002", 2, 8, "Intel i5", true);
        Ordenador pc3 = new Ordenador("LASIN-PC003", 3, 32, "AMD Ryzen 7", false);
        Ordenador pc4 = new Ordenador("LASIN-PC004", 4, 4, "Intel i3", true);
        Ordenador pc5 = new Ordenador("LASIN-PC005", 5, 16, "Intel i7", true);
        Ordenador pc6 = new Ordenador("LASIN-PC006", 6, 8, "AMD Ryzen 5", false);
        lasin1.agregarOrdenador(pc1);
        lasin1.agregarOrdenador(pc2);
        lasin1.agregarOrdenador(pc3);
        lasin1.agregarOrdenador(pc4);

        lasin2.agregarOrdenador(pc5);
        lasin2.agregarOrdenador(pc6);

        System.out.println("INFORMACION COMPLETA:");
        lasin1.informacion();
        lasin2.informacion();

        System.out.println("\nORDENADORES ACTIVOS LASIN 1:");
        lasin1.informacion(true);

        System.out.println("\nORDENADORES CON MAS DE 8GB RAM LASIN 1:");
        lasin1.informacion(8);

        System.out.println("\nTRASLADANDO ORDENADORES");
        System.out.println("Antes: Lasin1=" + lasin1.getCantidadOrdenadores() +
                ", Lasin2=" + lasin2.getCantidadOrdenadores());

        // Trasladar un ordenador
        if (lasin1.getCantidadOrdenadores() > 0) {
            String primerSerial = lasin1.getCodigosSeriales().get(0);
            Ordenador aTrasladar = lasin1.getOrdenador(primerSerial);

            if (aTrasladar != null && lasin2.tieneEspacio()) {
                lasin1.removerOrdenador(primerSerial);
                lasin2.agregarOrdenador(aTrasladar);
            }
        }

        System.out.println("Despues: Lasin1=" + lasin1.getCantidadOrdenadores() +
                ", Lasin2=" + lasin2.getCantidadOrdenadores());
    }
}
