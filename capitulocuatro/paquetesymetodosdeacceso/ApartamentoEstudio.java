package paquetesymetodosdeacceso;

public class ApartamentoEstudio extends Apartamento{
    protected static double valorArea =1500000;

    public ApartamentoEstudio(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(idInmobiliario, area, direccion, 1, 1);

    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println();
    }

}
