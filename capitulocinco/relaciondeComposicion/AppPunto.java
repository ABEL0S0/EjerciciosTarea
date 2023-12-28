package relaciondeComposicion;

import java.util.Vector;

public class AppPunto {
    public static void main(String args[]) {
        Circulo circulo1 = new Circulo(2,3,5);
        circulo1.imprimir();
        System.out.println();
        Recta recta = new Recta(10, 5, 20, 10);
        recta.imprimir();
        System.out.println();
        Punto poli1 = new Punto(3, 4);
        Punto poli2 = new Punto(4, 5);
        Punto poli3 = new Punto(4, 6);
        Vector<Punto> poligon = new Vector<>();
        poligon.add(poli1);
        poligon.add(poli2);
        poligon.add(poli3);

        Poligono triangulo = new Poligono("Triangulo", poligon);
        triangulo.imprimir(poligon);
    }
}
