package composicionConPartesMultiples;
import java.util.Vector;

public class Biblioteca {
    protected String nombre;
    Vector coleccionLibros;
    Vector coleccionRevistas;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.coleccionLibros = new Vector<>();
        this.coleccionRevistas = new Vector<>();
    }

    public void aniadirLibro(Libro libro){
        coleccionLibros.add(libro);
    }

     public void aniadirRevistas(Revista revista){
        coleccionRevistas.add(revista);
    }

    public void listarLibrosyRevistas(){
        for(int i=0;i<coleccionLibros.size();i++){
            Libro libro = (Libro) coleccionLibros.elementAt(i);
            libro.imprimir();
        }

        for(int i=0;i<coleccionRevistas.size();i++){
            Revista revista = (Revista) coleccionRevistas.elementAt(i);
            revista.imprimir();
        }
    }
}
