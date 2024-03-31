package bibliotecapelis;

import java.util.Scanner;

public class BibliotecaPelis {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(4);  
        
        Pelicula peli1 = new Pelicula.Builder("Psicosis")
                .director("Alfred Hitchcock")
                .duracion(109)
                .anio(1960)
                .build();
        
                Pelicula peli2 = new Pelicula.Builder("La cosa")
                .director("John Carpenter")
                .duracion(105)
                .anio(1982)
                .build();
        
        Pelicula peli3 = new Pelicula.Builder("Amanecer de los muertos")
                .director("Zack Snyder")
                .duracion(100)
                .anio(2004)
                .build();
        
        Pelicula peli4 = new Pelicula.Builder("Hereditary")
                .director("Ari Aster")
                .duracion(126)
                .anio(1018)
                .build();
        
        biblioteca.agregarPelicula(peli1, 0);
        biblioteca.agregarPelicula(peli2, 1);
        biblioteca.agregarPelicula(peli3, 2);
        biblioteca.agregarPelicula(peli4, 3);
        
        biblioteca.mostrarPeliculas();
        
        Scanner scanner = new Scanner(System.in);

System.out.print("Introduzca el título: ");
        String busqueda = scanner.nextLine();
        boolean disponible = biblioteca.buscarPelicula(busqueda);
        if (disponible) {
            System.out.println("La película " + busqueda + " está presente en la biblioteca.");
        } else {
            System.out.println("La película " + busqueda + " NO está presente en la biblioteca.");
        }
    }
    
}
