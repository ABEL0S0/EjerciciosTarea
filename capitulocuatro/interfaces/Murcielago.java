package interfaces;

public class Murcielago extends Mamiferos implements Volar{

    @Override
    public void volar() {
        System.out.println("El murcielago vuela. ");
    }

    @Override
    protected void amamantarCrias() {
        System.out.println("El murcielago amamanta a sus crías. ");
    }
    
}
