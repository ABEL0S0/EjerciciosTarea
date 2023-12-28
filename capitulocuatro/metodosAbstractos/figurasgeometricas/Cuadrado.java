package metodosAbstractos.figurasgeometricas;

public class Cuadrado extends FiguraGeometrica{
    public int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double areaFigura() {
        return lado*lado;
    }

    @Override
    public double perimetroFigura() {
        return (4*lado);
    }

}
