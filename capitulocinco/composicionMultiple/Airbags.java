package composicionMultiple;

public class Airbags {
    public double temInflar;
    public String material;
    public Airbags(double temInflar, String material) {
        this.temInflar = temInflar;
        this.material = material;
    }

    public void imprimir(){
        System.out.println("Material de airbags " + material + " Tiempo de inflado: " + temInflar+" segundos");
    }
}
