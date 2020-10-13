package co.edu.uac.munirN.libros.Model;

public class Libro {
   public String autor, libro, edicicion;



    public Libro(String libro, String autor, String edicicion) {
        this.autor = autor;
        this.libro = libro;
        this.edicicion = edicicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getEdicicion() {
        return edicicion;
    }

    public void setEdicicion(String edicicion) {
        this.edicicion = edicicion;
    }
}
