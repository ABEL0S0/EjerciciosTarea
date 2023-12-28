package herencia.libreria;

public class LibroDeTextoU extends LibroDeTexto{
    protected String facultad;

    public LibroDeTextoU(String titulo, String autor, float precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }
    
    @Override
    public void MostrarInfo() {
        System.out.println("Libro de Texto de la UNC [titulo =" + titulo + ", auto r=" + autor 
        + ", precio =" + precio +", curso = "+ curso +", facultad = "+ facultad +"]");
    }
    
}
