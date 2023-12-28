package metodosAbstractos.figurasgeometricas;

public class AppFigura {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrado(5);
        System.out.println("Area: "+cuadrado.areaFigura());
        System.out.println("Perimetro: "+cuadrado.perimetroFigura());

        FiguraGeometrica circulo = new Circulo(4);
        System.out.println("Area: "+circulo.areaFigura());
        System.out.println("Perimetro: "+circulo.perimetroFigura());

        FiguraGeometrica rectangulo = new Rectangulo(4,6);
        System.out.println("Area: "+rectangulo.areaFigura());
        System.out.println("Perimetro: "+rectangulo.perimetroFigura());
        
        FiguraGeometrica triangulo = new Triangulo(5,7);
        System.out.println("Area: "+triangulo.areaFigura());
        System.out.println("Perimetro: "+triangulo.perimetroFigura());

        FiguraGeometrica triangulore = new TrianguloRectangulo(4,8);
        System.out.println("Area: "+triangulore.areaFigura());
        System.out.println("Perimetro: "+triangulore.perimetroFigura());
    }
}
