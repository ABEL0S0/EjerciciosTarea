package paquetesymetodosdeacceso;

public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea=3000000;

    public CasaIndependiente(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
  
    }

    @Override
    public void mostrar() {
      
        super.mostrar();
        System.out.println();
    }

}
