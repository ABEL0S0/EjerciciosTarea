package composicionMultiple;

public class Asiento {
    public String material;
    public Boolean tieneFunda;

    public Asiento(String material, Boolean tieneFunda) {
        this.material = material;
        this.tieneFunda = tieneFunda;
    }

    public void imprimir(){
        System.out.println("Material del asiento: " + material + " Tiene funda: " + tieneFunda);
    }
    
}
