package paquetesymetodosdeacceso.tiendaMascotas;

public class Gatos extends Mascota{
    protected double alturaSalto;
    protected double longitudSalto;

    public Gatos(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public void Sonido(){
        System.out.println("Los gatos maullan y ronronean");
    }

    @Override
    public void mostrar() {        
        super.mostrar();
        System.out.println("Gatos [alturaSalto=" + alturaSalto + "cm, longitudSalto=" + longitudSalto + "cm]");
    }
}
