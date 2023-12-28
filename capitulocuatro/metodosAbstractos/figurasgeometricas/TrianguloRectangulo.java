package metodosAbstractos.figurasgeometricas;

public class TrianguloRectangulo extends Triangulo{

    public TrianguloRectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double areaFigura() {
        return super.areaFigura();
    }

    @Override
    public double perimetroFigura() {
        return (base+altura+(Math.pow(base*base+altura*altura, 1/2)));
    }
    
}
