package bibliotecapelis;

public class Biblioteca {
    
    private static Biblioteca instance;
    private Pelicula[] peliculas;

    private Biblioteca(int tamanio) {
        peliculas = new Pelicula[tamanio];
    }
    
    public static Biblioteca getInstance(int tamanio) {
        if (instance == null) {
            instance = new Biblioteca(tamanio);
        }
        return instance;
    }

    public void agregarPelicula(Pelicula pelicula, int indice) {
        if (indice >= 0 && indice < peliculas.length) {
            peliculas[indice] = pelicula;
        } else {
            System.out.println("Índice incorrecto, no se pudo agregar");
        }
    }

    public void mostrarPeliculas() {
        System.out.println("Peliculas en la biblioteca:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) {
                pelicula.mostrarPelicula();
                System.out.println("-------------------------");
            }
        }
    }
    
    public boolean buscarPelicula(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null && pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }
}
