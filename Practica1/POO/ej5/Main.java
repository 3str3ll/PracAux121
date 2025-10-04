public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", "Gómez", 25, "1234567");
        Persona persona2 = new Persona("María", "López", "García", 16, "7654321");
        Persona persona3 = new Persona("Carlos", "Pérez", "Martínez", 30, "9876543");

        System.out.println("GESTIÓN DE PERSONAS\n");
        System.out.println(" DATOS PERSONA 1 ");
        persona1.mostrarDatos();
        System.out.println("\n DATOS PERSONA 2 ");
        persona2.mostrarDatos();
        System.out.println("\nDATOS PERSONA 3");
        persona3.mostrarDatos();
        System.out.println("\nVERIFICACIÓN DE MAYORÍA DE EDAD ");
        System.out.println(persona1.getNombre() + " es mayor de edad: " + persona1.mayorDeEdad());
        System.out.println(persona2.getNombre() + " es mayor de edad: " + persona2.mayorDeEdad());
        System.out.println("\n--- MODIFICACIÓN DE EDAD ---");
        persona2.modificarEdad(18);
        persona2.mostrarDatos();
        persona2.modificarEdad(-5);
        System.out.println("\nCOMPARACIÓN DE APELLIDOS PATERNO ");
        System.out.println(persona1.getNombre() + " y " + persona2.getNombre() +
                " tienen el mismo paterno: " + persona1.mismoPaterno(persona2));

        System.out.println(persona1.getNombre() + " y " + persona3.getNombre() +
                " tienen el mismo paterno: " + persona1.mismoPaterno(persona3));
        System.out.println("\n COMPARACIÓN COMPLETA ");
        verificarMismoPaterno(persona1, persona2);
        verificarMismoPaterno(persona1, persona3);
        verificarMismoPaterno(persona2, persona3);
    }
    public static void verificarMismoPaterno(Persona p1, Persona p2) {
        if (p1.mismoPaterno(p2)) {
            System.out.println(p1.getNombre() + " " + p1.getPaterno() +
                    " y " + p2.getNombre() + " " + p2.getPaterno() +
                    " tienen el MISMO apellido paterno");
        } else {
            System.out.println(p1.getNombre() + " " + p1.getPaterno() +
                    " y " + p2.getNombre() + " " + p2.getPaterno() +
                    " tienen DIFERENTE apellido paterno");
        }
    }
}
