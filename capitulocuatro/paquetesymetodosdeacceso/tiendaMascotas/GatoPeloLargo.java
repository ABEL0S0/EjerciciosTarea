package paquetesymetodosdeacceso.tiendaMascotas;

public class GatoPeloLargo extends Gatos{
    enum Razapelolargo{ANGORA,HIMALAYO,BALINES,SOMALI};
    protected Razapelolargo Razapelolargo;

    public GatoPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, Razapelolargo Razapelolargo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.Razapelolargo = Razapelolargo;
    }

    @Override
    public void mostrar() {
  
        super.mostrar();
        System.out.println("Gatos pelo largo [Raza=" + Razapelolargo + "]");
    }
}