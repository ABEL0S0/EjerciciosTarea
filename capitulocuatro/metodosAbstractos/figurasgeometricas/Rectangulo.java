package metodosAbstractos.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica{
    public int base;
    public int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double areaFigura() {
        return base*altura;
    }

    @Override
    public double perimetroFigura() {
        return (2*base)+(2*altura);
    }

    
}
