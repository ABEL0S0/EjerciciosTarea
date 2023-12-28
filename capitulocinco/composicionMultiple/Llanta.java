package composicionMultiple;

public class Llanta {
    public String marca;
    public int diametroRin;
    public int altura;
    public int anchura;
    
    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public void imprimir(){
        System.out.println("Marca: "+ marca);
        System.out.println("Diametro del rin: "+diametroRin);
        System.out.println("Altura: "+ altura);
        System.out.println("Anchura: "+anchura);
    }
}