package diferenciasAgregacionYComposicion;

public class Jugador extends Persona{
    public boolean esTitular;

    public Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad);
        this.esTitular = esTitular;
    }

    
}
