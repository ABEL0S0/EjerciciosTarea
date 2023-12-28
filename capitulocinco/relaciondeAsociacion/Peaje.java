package relaciondeAsociacion;
import java.util.*;

public class Peaje {
    public String nombre;
    public String departamento;
    public Vector vehiculos;
    public int totalPeaje = 0;
    public static int totalCamiones = 0;
    public static int totalMotos = 0;   
    public static int totalCarros = 0;

    public Peaje(String nombre, String departamento){
        this.nombre=nombre;
        this.departamento=departamento;
        vehiculos = new Vector();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void aniadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public int calcularPeaje(Vehiculo vehiculo){
        if (vehiculo instanceof Carro) { 
            totalCarros++; 
            totalPeaje += Carro.valorPeaje; 
            return Carro.valorPeaje; 
        } else if (vehiculo instanceof Moto) { 
            totalMotos++;
            totalPeaje += Moto.valorPeaje;
            return Moto.valorPeaje; 
        } else if (vehiculo instanceof Camion) { 
            totalCamiones++; 
            Camion camion = (Camion) vehiculo; 
            
            totalPeaje += camion.numeroEjes * camion.valorPeajeEje;
            
            return camion.numeroEjes * camion.valorPeajeEje;
        } else return -1; 
    }

    public void imprimir() {
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicacion = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehiculos = totalCarros + totalMotos +totalCamiones;
        System.out.println("Total de vehiculos = " + totalVehiculos);
        System.out.println("Dinero total = $" + totalPeaje);
    }
}
