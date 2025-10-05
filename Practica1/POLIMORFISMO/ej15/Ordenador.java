package Practica1.POLIMORFISMO.ej15;

public class Ordenador {
    private String codigoSerial;
    private int numero;
    private int memoriaRAM;
    private String procesador;
    private boolean estado;
    private String laboratorioAsignado;

    public Ordenador(String codigoSerial, int numero, int memoriaRAM, String procesador, boolean estado) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.estado = estado;
        this.laboratorioAsignado = "Sin asignar";
    }
    public String getCodigoSerial() {
        return codigoSerial;
    }
    public int getMemoriaRAM() {
        return memoriaRAM;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setLaboratorioAsignado(String laboratorioAsignado) {
        this.laboratorioAsignado = laboratorioAsignado;
    }
    @Override
    public String toString() {
        String estadoStr = estado ? " ACTIVO" : " INACTIVO";
        return String.format("Serial: %s  N°: %d  RAM: %dGB  CPU: %-12s  %s Lab: %s",
                codigoSerial, numero, memoriaRAM, procesador, estadoStr, laboratorioAsignado);
    }
}
