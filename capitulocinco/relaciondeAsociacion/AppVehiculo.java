package relaciondeAsociacion;

public class AppVehiculo {
    public static void main(String args[]) {
        Peaje peaje = new Peaje ("La Lizama", "Santander");
        Camion camion1 = new Camion("PKI-889", 2);
        peaje.aniadirVehiculo(camion1);
        peaje.calcularPeaje(camion1);
        Camion camion2 = new Camion("KLM-123", 3);
        peaje.aniadirVehiculo(camion2);
        peaje.calcularPeaje(camion2);
        Camion camion3 = new Camion("PQI-234", 4);
        peaje.aniadirVehiculo(camion3);
        peaje.calcularPeaje(camion3);
        Moto moto1 = new Moto("ABC-123");
        peaje.aniadirVehiculo(moto1);
        peaje.calcularPeaje(moto1);
        Moto moto2 = new Moto("XYZ-000");
        peaje.aniadirVehiculo(moto2);
        peaje.calcularPeaje(moto2);
        Carro carro1 = new Carro("WVC-389");
        peaje.aniadirVehiculo(carro1);
        peaje.calcularPeaje(carro1);
        Carro carro2 = new Carro("QWE-543");
        peaje.aniadirVehiculo(carro2);
        peaje.calcularPeaje(carro2);
        peaje.imprimir();

        System.out.println();
        Persona persona = new Persona("Devin", "Llerena", "05/4/2004", "0813234473");
        persona.asignarVehiculo(moto2);
        System.out.println("Total de peaje de: " + persona.nombre + " es de:" + persona.calcularPeajePersona());
    }
}
