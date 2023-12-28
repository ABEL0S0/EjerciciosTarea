package metodosAbstractos.figurasgeometricas;

public class Circulo extends FiguraGeometrica{
    public int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double areaFigura() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double perimetroFigura() {
        return 2*Math.PI*radio;
    }

}
