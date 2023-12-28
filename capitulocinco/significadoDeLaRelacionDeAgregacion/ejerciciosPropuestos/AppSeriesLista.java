package significadoDeLaRelacionDeAgregacion.ejerciciosPropuestos;

public class AppSeriesLista {
    public static void main(String[] args) {
        Series series1 = new Series("Sam y Cat", "Comedia", "EEUU", 2013);
        Series series2 = new Series("Victorious", "Comedia", "EEUU", 2010);
        Series series3 = new Series("iCarly", "Musical", "EEUU", 2007);
        Series series4 = new Series("Big Time Rush", "Musical", "EEUU", 2009);
        Series series5 = new Series("Drake y Josh", "Comedia", "EEUU", 2004);

        ListaSeries nuevalista = new ListaSeries();
        nuevalista.agregarSeries(series5);
        nuevalista.agregarSeries(series4);
        nuevalista.agregarSeries(series3);
        nuevalista.agregarSeries(series2);
        nuevalista.agregarSeries(series1);
        System.out.println(nuevalista);
        System.out.println();
        nuevalista.buscarSerieTitulo("Big Time Rush");
        System.out.println();
        nuevalista.buscarSerieGenero("Comedia");
        System.out.println();
        nuevalista.buscarSeriePais("EEUU");
        System.out.println();
        nuevalista.eliminarSeries(series1);
        System.out.println();
        nuevalista.eliminarSeries(series4);
        System.out.println();
    }
}
