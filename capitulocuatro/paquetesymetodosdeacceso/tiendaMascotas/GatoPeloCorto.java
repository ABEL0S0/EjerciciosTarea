package paquetesymetodosdeacceso.tiendaMascotas;

public class GatoPeloCorto extends Gatos{
    static enum Razapelocorto{AZULRUSO,BRITANICO,MANX,DEVONREX};
    protected Razapelocorto Razapelocorto;

    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, Razapelocorto Razapelocorto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.Razapelocorto = Razapelocorto;
    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println("Gatos pelo corto [Raza=" + Razapelocorto + "]");
    }
}