package significadoDeLaRelacionDeAgregacion.ejerciciosPropuestos;

public class Series {
    public String titulo;
    public String genero;
    public String pais;
    public int anioCreacion;
    public Series(String titulo, String genero, String pais, int anioCreacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.pais = pais;
        this.anioCreacion = anioCreacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getAnioCreacion() {
        return anioCreacion;
    }
    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    @Override
    public String toString() {
        return "titulo =" + titulo + ", genero =" + genero + ", pais =" + pais + ", anioCreacion =" + anioCreacion+"\n";
    }

    
}
