package Practica1.POLIMORFISMO.ej15;


import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int cantidadOrdenadores;
    private List<String> codigosSeriales;
    private List<Ordenador> ordenadores;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantidadOrdenadores = 0;
        this.codigosSeriales = new ArrayList<>();
        this.ordenadores = new ArrayList<>();
    }
    public boolean agregarOrdenador(Ordenador ordenador) {
        if (cantidadOrdenadores < capacidad) {
            if (!codigosSeriales.contains(ordenador.getCodigoSerial())) {
                ordenadores.add(ordenador);
                codigosSeriales.add(ordenador.getCodigoSerial());
                ordenador.setLaboratorioAsignado(this.nombre);
                cantidadOrdenadores++;
                return true;
            }
        }
        return false;
    }
    public boolean removerOrdenador(String codigoSerial) {
        if (codigosSeriales.contains(codigoSerial)) {
            int index = codigosSeriales.indexOf(codigoSerial);
            codigosSeriales.remove(index);
            Ordenador removido = ordenadores.remove(index);
            removido.setLaboratorioAsignado("Sin asignar");
            cantidadOrdenadores--;
            return true;
        }
        return false;
    }
    public void informacion() {
        System.out.printf (" Laboratorio: %-45s \n", nombre);
        System.out.printf (" Capacidad: %-46d \n", capacidad);
        System.out.printf (" Ordenadores: %-43d \n", cantidadOrdenadores);


        if (ordenadores.isEmpty()) {
            System.out.println("No hay ordenadores en este laboratorio                   ");
        } else {
            for (int i = 0; i < ordenadores.size(); i++) {
                System.out.printf("%2d. %-55s \n", i + 1, ordenadores.get(i).toString());
            }
        }
    }
    public void informacion(boolean estado) {
        String estadoStr = estado ? "ACTIVOS" : "INACTIVOS";
        System.out.printf ("  ORDENADORES %-10s - %-20s     \n", estadoStr, nombre);

        List<Ordenador> filtrados = new ArrayList<>();
        for (Ordenador ordenador : ordenadores) {
            if (ordenador.isEstado() == estado) {
                filtrados.add(ordenador);
            }
        }

        if (filtrados.isEmpty()) {
            System.out.printf("No hay ordenadores %-36s \n", estadoStr.toLowerCase());
        } else {
            for (int i = 0; i < filtrados.size(); i++) {
                System.out.printf("%2d. %-55s \n", i + 1, filtrados.get(i).toString());
            }
        }
    }
    public void informacion(int ramMinima) {
        System.out.printf ("   ORDENADORES CON +%dGB RAM - %-20s   \n", ramMinima, nombre);


        List<Ordenador> filtrados = new ArrayList<>();
        for (Ordenador ordenador : ordenadores) {
            if (ordenador.getMemoriaRAM() > ramMinima) {
                filtrados.add(ordenador);
            }
        }

        if (filtrados.isEmpty()) {
            System.out.printf(" No hay ordenadores con más de %dGB RAM %18s \n", ramMinima, "");
        } else {
            for (int i = 0; i < filtrados.size(); i++) {
                System.out.printf(" %2d. %-55s \n", i + 1, filtrados.get(i).toString());
            }
        }
    }
    public Ordenador getOrdenador(String codigoSerial) {
        for (Ordenador ordenador : ordenadores) {
            if (ordenador.getCodigoSerial().equals(codigoSerial)) {
                return ordenador;
            }
        }
        return null;
    }
    public List<Ordenador> getOrdenadores() {
        return new ArrayList<>(ordenadores);
    }
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public int getCantidadOrdenadores() {
        return cantidadOrdenadores;
    }
    public List<String> getCodigosSeriales() {
        return new ArrayList<>(codigosSeriales);
    }
    public boolean tieneEspacio() {
        return cantidadOrdenadores < capacidad;
    }
}
