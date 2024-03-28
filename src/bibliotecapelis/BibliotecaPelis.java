package bibliotecapelis;

public class BibliotecaPelis {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(4);
        
        Pelicula peli1 = new Pelicula("La cosa", "John Carpenter", 105, 1982);
        Pelicula peli2 = new Pelicula("Psicosis", "Alfred Hitchcock", 109, 1960);
        Pelicula peli3 = new Pelicula("Hereditary", "Ari Aster", 126, 2018);
        Pelicula peli4 = new Pelicula("Amanecer de los muertos", "Zack Snyder", 100, 2004);
        
        biblioteca.agregarPelicula(peli1, 0);
        biblioteca.agregarPelicula(peli2, 1);
        biblioteca.agregarPelicula(peli3, 2);
        biblioteca.agregarPelicula(peli4, 3);
        
        biblioteca.mostrarPeliculas();
    }
    
}
