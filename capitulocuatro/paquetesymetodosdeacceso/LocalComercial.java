package paquetesymetodosdeacceso;

public class LocalComercial extends Local{
    protected static double valorArea=3000000;
    protected String centroComercial;

    public LocalComercial(int idInmobiliario, int area, String direccion, tipo tipoLocal, String centroComercial) {
        super(idInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println("Centro Comercial = "+centroComercial);
        System.out.println();
    }
       
}
