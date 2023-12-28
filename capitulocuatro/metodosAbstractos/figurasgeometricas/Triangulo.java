package metodosAbstractos.figurasgeometricas;

public class Triangulo extends FiguraGeometrica{
    public int base;
    public int altura;
    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double areaFigura() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetroFigura() {
        return base + base + base;
    }
 
}
