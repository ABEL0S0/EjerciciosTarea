package diferenciasAgregacionYComposicion;

public class Mediocampo extends Jugador{
    public int numeroAsistencias;

    public Mediocampo(String nombre, String apellidos, int edad, boolean esTitular, int numeroAsistencias) {
        super(nombre, apellidos, edad, esTitular);
        this.numeroAsistencias = numeroAsistencias;
    }
    
    public String toString() {
        return "Nombre= " + nombre + ", Apellidos= " + apellidos + 
        ", Edad= " + edad + ", Asistencias= " + numeroAsistencias;
    }
}
