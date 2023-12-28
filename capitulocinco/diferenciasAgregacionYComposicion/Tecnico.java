package diferenciasAgregacionYComposicion;

public class Tecnico extends Persona{
    public int aniosExperiencia;
    public boolean esNacional;
    public Tecnico(String nombre, String apellidos, int edad, int aniosExperiencia, boolean esNacional) {
        super(nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.esNacional = esNacional;
    }

    @Override
    public String toString() {
        return "Nombre= "+nombre+", Apellidos= "+apellidos+", Edad= "+edad +
        ", aniosExperiencia= " + aniosExperiencia + ", esNacional= " + esNacional;
    }

    
}
