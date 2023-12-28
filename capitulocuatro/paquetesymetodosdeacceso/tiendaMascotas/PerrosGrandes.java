package paquetesymetodosdeacceso.tiendaMascotas;

public class PerrosGrandes extends Perros{
    protected enum Razagrandes{PASTORALEMAN,DOBERMAN,ROTWEILLER};

    protected Razagrandes Razagrandes;

    public PerrosGrandes(String nombre, int edad, String color, String peso, boolean muerde, Razagrandes Razagrandes) {
        super(nombre, edad, color, peso, muerde);
        this.Razagrandes = Razagrandes;
    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println("PerrosGrandes [Raza=" + Razagrandes + "]");
    }
    
}
