package Practica1.POO.ej15;

public class Carta {
    private String codigo;
    private String descripcion;
    private String remitente;
    private String destinatario;
    public Carta(String codigo, String descripcion, String remitente, String destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Remitente: " + remitente);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Descripción: " + (descripcion.length() > 50 ? descripcion.substring(0, 50) + "..." : descripcion));
    }

    public boolean contienePalabra(String palabra) {
        return descripcion.toLowerCase().contains(palabra.toLowerCase());
    }
}
