package composicionConPartesMultiples;

public class Revista extends Publicacion{
    protected String nombreRevista;
    protected String periodicidad;
    protected String pais;

    public Revista(String nombreRevista, int anioPublicacion, String editorial, String periodicidad, String pais) {
        super(anioPublicacion, editorial);
        this.nombreRevista = nombreRevista;
        this.periodicidad = periodicidad;
        this.pais = pais;
    }

    void imprimir() {
        System.out.println("Nombre revista: " + nombreRevista);
        System.out.println("Anio de publicacion" + anioPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("Pais perteneciente: " + pais);
        System.out.println();
    }

    
}
