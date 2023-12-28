package diferenciasAgregacionYComposicion;

public class Delantero extends Jugador{
    public int golesAnotados;

    public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    public String toString() {
        return "Nombre= " + nombre + ", Apellidos= " + apellidos + 
        ", Edad= " + edad + ", Goles anotados= " + golesAnotados;
    }
}
