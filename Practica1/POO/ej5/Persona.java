public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;
    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    public void mostrarDatos() {
        System.out.println("=== DATOS DE LA PERSONA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + paterno);
        System.out.println("Apellido Materno: " + materno);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Cédula de Identidad: " + ci);
        System.out.println("Mayor de edad: " + (mayorDeEdad() ? "Sí" : "No"));
    }
    public boolean mayorDeEdad() {
        return edad >= 18;
    } 
    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad >= 0 && nuevaEdad <= 150) {
            this.edad = nuevaEdad;
            System.out.println("Edad actualizada a: " + nuevaEdad + " años");
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 100 años");
        }
    }
    public boolean mismoPaterno(Persona otraPersona) {
        return this.paterno.equalsIgnoreCase(otraPersona.paterno);

    }
    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

}