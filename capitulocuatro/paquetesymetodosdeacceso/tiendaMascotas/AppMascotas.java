package paquetesymetodosdeacceso.tiendaMascotas;

import paquetesymetodosdeacceso.tiendaMascotas.GatoPeloCorto.Razapelocorto;
import paquetesymetodosdeacceso.tiendaMascotas.PerrosGrandes.Razagrandes;

public class AppMascotas {
    public static void main(String[] args) {
        
        PerrosGrandes perro = new PerrosGrandes("Moisa", 10, "Negro con amarillo", "40 kg", true, Razagrandes.PASTORALEMAN);
        perro.mostrar();
        System.out.println();
        GatoPeloCorto gato = new GatoPeloCorto("Fidel", 03, "Blanco y negro", 800, 900, Razapelocorto.BRITANICO);
        gato.mostrar();
    }
}

