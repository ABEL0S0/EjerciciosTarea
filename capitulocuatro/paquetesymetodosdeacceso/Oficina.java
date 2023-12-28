package paquetesymetodosdeacceso;

public class Oficina extends Local{
    protected static double valorArea = 3500000;
    protected boolean Gobierno;

    public Oficina(int idInmobiliario, int area, String direccion, tipo tipoLocal, boolean gobierno) {
        super(idInmobiliario, area, direccion, tipoLocal);
        this.Gobierno = gobierno;
    }

    @Override
    public void mostrar() {
  
        super.mostrar();
        System.out.println("Oficina del gobierno = "+Gobierno);
        System.out.println();
    }
    
}
