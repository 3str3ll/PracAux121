package Practica1.POLIMORFISMO.ej5;

public class Celular {
    private String nroTel;
    private String dueño;
    private double espacio; 
    private int ram; 
    private int nroApp;
    public Celular() {
        this.nroTel = "Sin número";
        this.dueño = "Sin dueño";
        this.espacio = 0;
        this.ram = 0;
        this.nroApp = 0;
    }
    public Celular(String nroTel, String dueño, double espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueño = dueño;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }
    public void incrementarApps() {
        this.nroApp += 10;
        System.out.println(" Se incrementaron las apps en 10");
    }
    public void decrementarEspacio() {
        if (this.espacio >= 5) {
            this.espacio -= 5;
            System.out.println("Se disminuyó el espacio en 5 GB");
        } else {
            System.out.println(" No hay suficiente espacio para disminuir");
        }
    }
    public String getNroTel() {
        return nroTel;
    }

    public void setNroTel(String nroTel) {
        this.nroTel = nroTel;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public double getEspacio() {
        return espacio;
    }

    public void setEspacio(double espacio) {
        this.espacio = espacio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getNroApp() {
        return nroApp;
    }

    public void setNroApp(int nroApp) {
        this.nroApp = nroApp;
    }
    @Override
    public String toString() {
        return String.format("Celular [Tel: %s, Dueño: %s, Espacio: %.1fGB, RAM: %dGB, Apps: %d]",
                nroTel, dueño, espacio, ram, nroApp);
    }
    public void mostrarDatos() {
        System.out.printf (" Teléfono: %-16s \n", nroTel);
        System.out.printf (" Dueño: %-19s \n", dueño);
        System.out.printf (" Espacio: %-17.1f \n", espacio);
        System.out.printf (" RAM: %-20d \n", ram);
        System.out.printf (" Aplicaciones: %-13d \n", nroApp);
    }
}
