package paquetesymetodosdeacceso;

public class Casa extends InmuebleVivienda{
    protected int numeroPisos;

    public Casa(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void mostrar() {
        
        super.mostrar();
        System.out.println("Numero de pisos = " + numeroPisos);
    }

    
}
