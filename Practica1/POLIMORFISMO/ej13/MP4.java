package Practica1.POLIMORFISMO.ej13;

public class MP4 {
    private String marca;
    private double capacidadGB;
    private int cantCanciones;
    private String[][][] canciones;
    private int cantVideos;
    private String[][][] videos;
    private static final int NOMBRE = 0;
    private static final int ARTISTA = 1;
    private static final int PESO = 2;
    public MP4(String marca, double capacidadGB) {
        this.marca = marca;
        this.capacidadGB = capacidadGB;
        this.cantCanciones = 0;
        this.cantVideos = 0;
        this.canciones = new String[3][100][3];
        this.videos = new String[100][3][3];
    }
    public double calcularCapacidadUsada() {
        double totalUsado = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (canciones[i][j][NOMBRE] != null) {
                    double pesoKB = Double.parseDouble(canciones[i][j][PESO]);
                    totalUsado += pesoKB / (1024 * 1024); // KB a GB
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 3; j++) {
                if (videos[i][j][NOMBRE] != null) {
                    double pesoMB = Double.parseDouble(videos[i][j][PESO]);
                    totalUsado += pesoMB / 1024; // MB a GB
                }
            }
        }
        return totalUsado;
    }
    public double getCapacidadDisponible() {
        return capacidadGB - calcularCapacidadUsada();
    }
    public boolean borrarCancion(String nombre) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (canciones[i][j][NOMBRE] != null &&
                        canciones[i][j][NOMBRE].equalsIgnoreCase(nombre)) {
                    canciones[i][j][NOMBRE] = null;
                    canciones[i][j][ARTISTA] = null;
                    canciones[i][j][PESO] = null;
                    cantCanciones--;
                    System.out.println(" Canción '" + nombre + "' eliminada");
                    return true;
                }
            }
        }
        System.out.println(" Canción '" + nombre + "' no encontrada");
        return false;
    }
    public boolean borrarCancion(String artista, boolean porArtista) {
        int eliminadas = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (canciones[i][j][ARTISTA] != null &&
                        canciones[i][j][ARTISTA].equalsIgnoreCase(artista)) {
                    
                    canciones[i][j][NOMBRE] = null;
                    canciones[i][j][ARTISTA] = null;
                    canciones[i][j][PESO] = null;
                    eliminadas++;
                    cantCanciones--;
                }
            }
        }
        if (eliminadas > 0) {
            System.out.println(" " + eliminadas + " canciones del artista '" + artista + "' eliminadas");
            return true;
        }
        System.out.println(" No se encontraron canciones del artista '" + artista + "'");
        return false;
    }
    public boolean borrarCancion(String nombre, double peso) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (canciones[i][j][NOMBRE] != null &&
                        canciones[i][j][NOMBRE].equalsIgnoreCase(nombre) &&
                        canciones[i][j][PESO] != null &&
                        Double.parseDouble(canciones[i][j][PESO]) == peso) {
                    canciones[i][j][NOMBRE] = null;
                    canciones[i][j][ARTISTA] = null;
                    canciones[i][j][PESO] = null;
                    cantCanciones--;
                    System.out.println(" Canción '" + nombre + "' (" + peso + "KB) eliminada");
                    return true;
                }
            }
        }
        System.out.println("Canción '" + nombre + "' con peso " + peso + "KB no encontrada");
        return false;
    }
    public boolean agregarCancion(String nombre, String artista, double pesoKB) {
        if (existeCancion(nombre, artista)) {
            System.out.println(" La canción '" + nombre + "' de " + artista + " ya existe");
            return false;
        }
        double pesoGB = pesoKB / (1024 * 1024);
        if (pesoGB > getCapacidadDisponible()) {
            System.out.println(" No hay espacio suficiente para agregar la canción");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (canciones[i][j][NOMBRE] == null) {
                    canciones[i][j][NOMBRE] = nombre;
                    canciones[i][j][ARTISTA] = artista;
                    canciones[i][j][PESO] = String.valueOf(pesoKB);
                    cantCanciones++;
                    System.out.println(" Canción '" + nombre + "' agregada exitosamente");
                    return true;
                }
            }
        }

        System.out.println(" No hay espacio en el array de canciones");
        return false;
    }
    public boolean agregarVideo(String nombre, String artista, double pesoMB) {
        if (existeVideo(nombre, artista)) {
            System.out.println(" El video '" + nombre + "' de " + artista + " ya existe");
            return false;
        }
        double pesoGB = pesoMB / 1024;
        if (pesoGB > getCapacidadDisponible()) {
            System.out.println(" No hay espacio suficiente para agregar el video");
            return false;
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 3; j++) {
                if (videos[i][j][NOMBRE] == null) {
                    // Agregar el video
                    videos[i][j][NOMBRE] = nombre;
                    videos[i][j][ARTISTA] = artista;
                    videos[i][j][PESO] = String.valueOf(pesoMB);
                    cantVideos++;
                    System.out.println(" Video '" + nombre + "' agregado exitosamente");
                    return true;
                }
            }
        }

        System.out.println(" No hay espacio en el array de videos");
        return false;
    }
    private boolean existeCancion(String nombre, String artista) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (canciones[i][j][NOMBRE] != null &&
                        canciones[i][j][NOMBRE].equalsIgnoreCase(nombre) &&
                        canciones[i][j][ARTISTA] != null &&
                        canciones[i][j][ARTISTA].equalsIgnoreCase(artista)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean existeVideo(String nombre, String artista) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 3; j++) {
                if (videos[i][j][NOMBRE] != null &&
                        videos[i][j][NOMBRE].equalsIgnoreCase(nombre) &&
                        videos[i][j][ARTISTA] != null &&
                        videos[i][j][ARTISTA].equalsIgnoreCase(artista)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void mostrarCapacidad() {
        double usado = calcularCapacidadUsada();
        double disponible = getCapacidadDisponible();
        System.out.println(" INFORMACIÓN DE CAPACIDAD ");
        System.out.printf (" Marca: %-36s ║\n", marca);
        System.out.printf (" Capacidad Total: %-10.2f GB %15s \n", capacidadGB, "");
        System.out.printf (" Capacidad Usada: %-10.2f GB %15s \n", usado, "");
        System.out.printf (" Capacidad Disponible: %-6.2f GB %13s \n", disponible, "");
        System.out.printf (" Canciones: %-31d \n", cantCanciones);
        System.out.printf (" Videos: %-33d \n", cantVideos);

    }
    public void mostrarCanciones() {
        System.out.println("LISTA DE CANCIONES");

        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (canciones[i][j][NOMBRE] != null) {
                    contador++;
                    System.out.printf(" %2d. %-25s  %-20s  %6s KB \n",
                            contador,
                            canciones[i][j][NOMBRE],
                            canciones[i][j][ARTISTA],
                            canciones[i][j][PESO]);
                }
            }
        }

        if (contador == 0) {
            System.out.println("No hay canciones guardadas");
        }
    }
    public void mostrarVideos() {
        System.out.println("LISTA DE VIDEOS ");

        int contador = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 3; j++) {
                if (videos[i][j][NOMBRE] != null) {
                    contador++;
                    System.out.printf("%2d. %-25s  %-20s %6s MB \n",
                            contador,
                            videos[i][j][NOMBRE],
                            videos[i][j][ARTISTA],
                            videos[i][j][PESO]);
                }
            }
        }

        if (contador == 0) {
            System.out.println("  No hay videos guardados");
        }

    }

}
