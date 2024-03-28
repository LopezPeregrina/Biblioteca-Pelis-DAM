package bibliotecapelis;

public class Biblioteca {
    
    private Pelicula[] peliculas;

    public Biblioteca(int tamanio) {
        peliculas = new Pelicula[tamanio];
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
}
