package relaciondeComposicion;

public class Circulo {
    public Punto centro;
    public int radio;

    public Circulo(int x, int y, int radio){
        centro = new Punto(x,y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void imprimir(){
        System.out.println("El centro del circulo es la coordenada (" +
        centro.getX() + "," + centro.getY() + ") y tiene un radio = " +
        radio);
    }
}
