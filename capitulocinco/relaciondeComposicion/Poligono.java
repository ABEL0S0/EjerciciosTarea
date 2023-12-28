package relaciondeComposicion;

import java.util.Vector;

public class Poligono {
    public String nombre;
    public Vector<Punto> puntos;

    public Poligono(String nombre, Vector<Punto> puntos) {
        this.nombre = nombre;
        if(puntos.size()<3){
            System.out.println("Un polígono debe tener al menos 3 puntos.");
        }
        this.puntos = puntos;
    }

    public void imprimir(Vector<Punto> puntos){
        System.out.println("Nombre poligono: " + nombre);
        System.out.println("Puntos del "+nombre);
        for (int k = 0; k<puntos.size(); k++){
            Punto punto = puntos.get(k);
            System.out.println("Punto " + (k + 1 )+" = " + " (x: " + punto.x + ", y: " + punto.y+")");
        }
    }
}
