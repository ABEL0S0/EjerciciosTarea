package interfacesMultiples;

public class VehiculoAereo implements Alas,Reactor{

    @Override
    public void encender() {
        System.out.println("Motor Encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor Apagado");
    }

    @Override
    public void soltarTrenAterrizaje() {
        System.out.println("Tren de Aterrizaje desplegado");
    }

    @Override
    public void subirTrenAterrizaje() {
        System.out.println("Tren de Aterrizaje retraido");
    }
    
}
