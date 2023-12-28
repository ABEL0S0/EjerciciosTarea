package interfacesMultiples;

public class AppVehiculo {
    public static void main(String[] args) {
        Terrestre camioneta = new Terrestre(100, 250);
        System.out.println("Camioneta");
        camioneta.imprimir();
        camioneta.acelerar(50);
        System.out.println("Nueva velocidad actual = "+camioneta.VelocidadActual);

        Acuatico motoAcuatica = new Acuatico(50, 110);
        System.out.println("Moto Acuatica");
        motoAcuatica.imprimir();
        System.out.println("Revoluciones del motor = "+motoAcuatica.calcularRevolucionesMotor(1200, 2));
        motoAcuatica.recomendarVelocidad(20);
    }
}
