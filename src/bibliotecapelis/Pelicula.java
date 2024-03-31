package bibliotecapelis;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    private int anio;

    private Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public static class Builder {
        private String titulo;
        private String director = "";
        private int duracion = 0;
        private int anio = 0;
        
        public Builder(String titulo) {
            this.titulo = titulo;
        }
        
        public Builder director(String director) {
            this.director = director;
            return this;
        }
        
        public Builder duracion(int duracion) {
            this.duracion = duracion;
            return this;
        }
        
        public Builder anio(int anio) {
            this.anio = anio;
            return this;
        }
        
        public Pelicula build() {
            Pelicula pelicula = new Pelicula(titulo);
            pelicula.director = this.director;
            pelicula.duracion = this.duracion;
            pelicula.anio = this.anio;
            return pelicula;
        }
    }

    public void mostrarPelicula() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Año: " + anio);
    }
}
