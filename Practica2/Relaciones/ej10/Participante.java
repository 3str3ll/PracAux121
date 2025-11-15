package Practica2.Relaciones.ej10;

public class Participante extends PersonaEvento {
    private String codigo;
    private String tipoInscripcion; 
    private boolean pagoConfirmado;
    
    public Participante(String nombre, String apellido, String ci, int edad,
                       String email, String telefono, String codigo, 
                       String tipoInscripcion, boolean pagoConfirmado) {
        super(nombre, apellido, ci, edad, email, telefono);
        this.codigo = codigo;
        this.tipoInscripcion = tipoInscripcion;
        this.pagoConfirmado = pagoConfirmado;
    }
    public String getCodigo() { return codigo; }
    public String getTipoInscripcion() { return tipoInscripcion; }
    public boolean isPagoConfirmado() { return pagoConfirmado; }
    
    public String toString() {
        return super.toString() + " - " + codigo + " [" + tipoInscripcion + 
               "] - Pago: " + (pagoConfirmado ? "Confirmado" : "Pendiente");
    }
}
