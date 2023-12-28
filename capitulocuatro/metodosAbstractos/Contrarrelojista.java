package metodosAbstractos;

public class Contrarrelojista extends Ciclista{
    private double velocidadMax;

    public Contrarrelojista(int id, String nombre, double velocidadMax) {
        super(id, nombre);
        this.velocidadMax = velocidadMax;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " +velocidadMax);
    }

    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }
}
