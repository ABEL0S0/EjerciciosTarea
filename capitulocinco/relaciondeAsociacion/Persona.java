package relaciondeAsociacion;
import java.util.Vector;

public class Persona {
    String nombre, apellido, fechaNac, cedula;
    Vector<Vehiculo> personas;

    public Persona(String nombre, String apellido, String fechaNac, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.cedula = cedula;
        this.personas = new Vector<>();
    }

    public void asignarVehiculo(Vehiculo vehiculo){
        personas.add(vehiculo);
    }
    public void quitarVehiculo(Vehiculo vehiculo){
        personas.remove(vehiculo);
    }

    public int calcularPeajePersona(){
        int totalPeaje = 0;
        for (Vehiculo vehiculo: personas){
            if (vehiculo instanceof Carro){
                totalPeaje= Carro.getValorPeaje();
            }
            else if (vehiculo instanceof Camion){
                totalPeaje= Camion.getValorPeajeEje();
            }
            else if (vehiculo instanceof Moto){
                totalPeaje= Moto.getValorPeaje();
            }
        }
        return totalPeaje;
    }
}
