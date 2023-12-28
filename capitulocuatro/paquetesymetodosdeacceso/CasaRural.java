package paquetesymetodosdeacceso;

public class CasaRural extends Casa{
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altura;

    public CasaRural(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos, int distanciaCabera, int altura) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altura = altura;
    }

    @Override
    public void mostrar() {
  
        super.mostrar();
        System.out.println("Distancia la cabecera municipal = " + numeroHabitaciones);
        System.out.println("Altura sobre el nivel del mar = " + altura + "m");
        System.out.println();
    }
    
}
