package interfacesMultiples;

public class AppVehiculoaereo {
    public static void main(String[] args) {
        VehiculoAereo avion = new VehiculoAereo();
        avion.encender();
        avion.subirTrenAterrizaje();
        avion.soltarTrenAterrizaje();
        avion.apagar();
    }
}
