package Practica2.Relaciones.ej8;
public  class Main {
    public static void main(String[] args) {
        System.out.println(" SISTEMA DE FRATERNIDADES UNIVERSITARIAS\n");
        Facultad fac1 = new Facultad("Ingeniería");
        Facultad fac2 = new Facultad("Medicina");
        Persona enc1 = new Persona("Carlos Méndez", "1234567", 22);
        Persona enc2 = new Persona("Ana Torres", "7654321", 23);
        Persona est1 = new Persona("Luis Rojas", "1111111", 20);
        Persona est2 = new Persona("Marta Cruz", "2222222", 21);
        Persona est3 = new Persona("José Lima", "3333333", 19);

        Fraternidad frat1 = new Fraternidad("Alpha", enc1, fac1);
        Fraternidad frat2 = new Fraternidad("Beta", enc2, fac2);
        
        frat1.agregarMiembro(est1);
        frat1.agregarMiembro(est2);
        frat2.agregarMiembro(est3);
        frat1.agregarMiembro(est1);
        
        frat1.mostrarMiembros();
        frat2.mostrarMiembros();
        System.out.println("\n--- Participantes menores de 21 años ---");
        for (Fraternidad frat : new Fraternidad[]{frat1, frat2}) {
            for (Persona miembro : frat.getMiembros()) {
                if (miembro.getEdad() < 21) {
                    System.out.println("- " + miembro.getNombre() + " (" + frat.getNombre() + ")");
                }
            }
        }
    }
}
