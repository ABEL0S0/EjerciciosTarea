package interfaces;

public class Ornitorrinco extends Mamiferos implements Oviparos{
    
    @Override
    public void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías.");
    }

    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos.");
    }
}
