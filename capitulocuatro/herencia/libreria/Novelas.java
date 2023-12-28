package herencia.libreria;

public class Novelas extends Libro{
    protected String tipoNovela;

    public Novelas(String titulo, String autor, float precio, String tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Libro de Texto de la UNC [titulo =" + titulo + ", auto r=" + autor 
        + ", precio =" + precio +", tipo de novela = "+ tipoNovela +"]");
    }
}
