package paquetesymetodosdeacceso.tiendaMascotas;

public class GatoSinPelo extends Gatos{
    enum Razasinpelo{ESFINGE,ELFO,DONSKOY};
    protected Razasinpelo Razasinpelo;

    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, Razasinpelo raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.Razasinpelo = raza;
    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println("Gatos sin pelos [Raza=" + Razasinpelo + "]");
    }
}
