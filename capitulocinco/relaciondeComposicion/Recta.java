package relaciondeComposicion;
import java.lang.Math;

public class Recta {
    public Punto pinicio;
    public Punto pfinal;
    public double x1;
    public double x2;
    public double y1;
    public double y2;
    
    public Recta(int x1, int y1, int x2,int y2){
        pinicio = new Punto(x1,y1);
        pfinal = new Punto(x2,y2);
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public double calcularPendiente(){
        return (double) (this.y2-this.y1)/(this.x2-this.x1);
    }

    public double calcularLongitud() {
        return (double) Math.sqrt(Math.pow(this.x2-this.x1, 2)+Math.pow(this.y2-this.y1, 2));
    }

    public void imprimir(){
        System.out.println("Recta"+"\nEl punto inicial es: "+"("+this.x1+", "+this.y1+")"+
        "El punto final es: "+"("+this.x2+", "+this.y2+")"+"\n"+
        "La pendiente de la recta es: "+calcularPendiente()+
        "\nLa longitud de la recta es: "+calcularLongitud());
    }
}
