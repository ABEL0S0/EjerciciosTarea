package interfacesMultiples;

public class Terrestre extends Vehiculo implements Motor{
    public Terrestre (int VelocidadActual, int VelocidadMaxima) {
        super(VelocidadActual, VelocidadMaxima);
    }

    @Override
    public void acelerar(int Velocidad) {
        int vel = VelocidadActual + Velocidad;
        if (vel > VelocidadMaxima) { 
        System.out.println("Supera la velocidad maxima permitida");
        } else { 
            VelocidadActual = vel;
        }
    }

    @Override
    public void frena(int Velocidad) {
        int vel = VelocidadActual - Velocidad;
        if (vel < 0) { 
            System.out.println("La velocidad no puede ser negativa");
        } else { 
            VelocidadActual = vel;
        }
    }

    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return (fuerza*radio);
    }
}
