package diferenciasAgregacionYComposicion;

public class Portero extends Jugador{
    public int golesRecibidos;

    public Portero(String nombre, String apellidos, int edad, boolean esTitular, int golesRecibidos) {
        super(nombre, apellidos, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    public String toString() {
        return "Nombre= " + nombre + ", Apellidos= " + apellidos + 
        ", Edad= " + edad + ", Goles recibidos= " + golesRecibidos;
    }
}
