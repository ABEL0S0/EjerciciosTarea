package paquetesymetodosdeacceso;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    
    public ApartamentoFamiliar(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int valorAdministracion) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Valor de la administracion = $" + valorAdministracion);
        System.out.println();        
    }

}
