package metodosAbstractos;

public abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempoAcumulado=0;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    abstract String imprimirTipo();
    protected int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getPosiciónGeneral(int posiciónGeneral) {
        return posiciónGeneral;
    }

    protected void setPosiciónGeneral(int posiciónGeneral) {
        posiciónGeneral = posiciónGeneral;
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimir() {
        System.out.println("Identificador = " + id);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }

}
