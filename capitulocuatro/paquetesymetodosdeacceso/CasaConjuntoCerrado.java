package paquetesymetodosdeacceso;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea=2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Valor de la administracion = "+valorAdministracion);
        System.out.println("Piscina = "+tienePiscina);
        System.out.println("Campo deportivo = "+tieneCamposDeportivos); 
        System.out.println();   
    }

    
    

}
