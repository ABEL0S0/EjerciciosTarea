package paquetesymetodosdeacceso;

public class Local extends Inmueble{
    enum tipo{INTERNO,CALLE};
    protected tipo tipoLocal;

    public Local(int idInmobiliario, int area, String direccion, tipo tipoLocal) {
        super(idInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public void mostrar() {
   
        super.mostrar();
        System.out.println("Tipo de local = "+tipoLocal);
    }
    
}
