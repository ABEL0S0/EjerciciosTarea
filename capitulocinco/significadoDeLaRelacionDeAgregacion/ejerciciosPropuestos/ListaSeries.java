package significadoDeLaRelacionDeAgregacion.ejerciciosPropuestos;

import java.util.Vector;

public class ListaSeries {
    public Vector<Series> serie;

    public ListaSeries() {
        serie = new Vector<Series>();
    }

    public void agregarSeries(Series series){
        serie.add(series);
    }

    public void eliminarSeries(Series series){
        serie.remove(series);
        while (serie.remove(series)) {}

        System.out.println("Lista Actualizada: ");
        for (int k = 0; k < serie.size(); k++) {
            Series series1 = (Series) serie.elementAt(k);
            System.out.println(series1);
        }
    }

    public void buscarSerieTitulo(String titulo){
        boolean serieEncontrada = false;
        System.out.println("Series encontradas por titulo: "+titulo);
        for (int k = 0; k<serie.size(); k++){
            Series series1 = (Series) serie.elementAt(k);
            if(titulo.equals(series1.getTitulo())){
                System.out.println(series1);
                serieEncontrada = true;
                break;
            }
        }
        if (!serieEncontrada){
            System.out.println("Serie no encontrada");
        }
    }

    public void buscarSerieGenero(String genero){
        boolean serieEncontrada = false;
        System.out.println("Series encontradas por genero: "+genero);
        for (int k = 0; k<serie.size(); k++){
            Series series1 = (Series) serie.elementAt(k);
            if(genero.equals(series1.getGenero())){
                System.out.println(series1);
                serieEncontrada = true;
            }
        }
        if (!serieEncontrada){
            System.out.println("Serie no encontrada");
        }
    }

    public void buscarSeriePais(String pais){
        boolean serieEncontrada = false;
        System.out.println("Series encontradas por pais: "+pais);
        for (int k = 0; k<serie.size(); k++){
            Series series1 = (Series) serie.elementAt(k);
            if(pais.equals(series1.getPais())){
                System.out.println(series1);
                serieEncontrada = true;
            }
        }
        if (!serieEncontrada){
            System.out.println("Serie no encontrada");
        }
    }

    @Override
    public String toString() {
        return "ListaSeries: \n" + serie.toString();
    }

}
