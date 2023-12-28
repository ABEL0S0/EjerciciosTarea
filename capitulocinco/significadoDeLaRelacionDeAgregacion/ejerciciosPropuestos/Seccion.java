package significadoDeLaRelacionDeAgregacion.ejerciciosPropuestos;
import java.util.Vector;

public class Seccion extends Evaluacion{
    public String titulo;
    public Vector<String> autor;
    public Vector<Subseccion> subsecciones;
    public Vector<Parrafo> parrafos;

    public Seccion() {
        this.autor = new Vector<>();
        this.subsecciones = new Vector<>();
        this.parrafos = new Vector<>();
    }

    public void agregarAutor(String nombreAutor) {
        autor.add(nombreAutor);
    }

    public void agregarSubseccion(Subseccion subseccion) {
        subsecciones.add(subseccion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Vector<String> getAutor() {
        return autor;
    }

    public void setAutor(Vector<String> autor) {
        this.autor = autor;
    }
    public Vector<Subseccion> getSubsecciones() {
        return subsecciones;
    }
    public boolean esSubseccion() {
        return false;
    }

    @Override
    public String toString() {
        return "Seccion{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                '}';
    }

    public Vector<Parrafo> getParrafos() {
        return parrafos;
    }
}