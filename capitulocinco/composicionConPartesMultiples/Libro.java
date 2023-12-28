package composicionConPartesMultiples;

public class Libro extends Publicacion{
    protected String titulo;
    protected String autor;
    protected String referenciaBibliografica;

    public Libro(String titulo, String autor, int anioPublicacion, String editorial, String referenciaBibliografica) {
        super(anioPublicacion,editorial);
        this.titulo=titulo;
        this.autor=autor;
        this.referenciaBibliografica = referenciaBibliografica;
    }

    void imprimir() {
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Anio de publicacion" + anioPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia bibliogracifa: " + referenciaBibliografica);
        System.out.println();
    }
}
