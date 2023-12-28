package herencia.libreria;

public class LibroDeTexto extends Libro{
    protected String curso;

    public LibroDeTexto(String titulo, String autor, float precio, String curso) {
        super(titulo, autor, precio);
        this.curso=curso;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Libro de Texto [titulo =" + titulo + ", auto r=" + autor 
        + ", precio =" + precio +", curso = "+ curso +"]");
    }
    
}
