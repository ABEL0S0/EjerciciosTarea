package herenciaDeInterfaces;

public class AppMatch {
    public static void main(String args[]) {
        System.out.println("Futboll: ");
        PartidoFutbollLigaEspaniola partido = new PartidoFutbollLigaEspaniola();
        System.out.println("Duración del partido = " + PartidoFutbollLigaEspaniola.duracionPartido);
        partido.setEquipoLocal("Real Madrid");
        partido.setEquipoVisitante("Barcelona");
        partido.setGolesEquipoLocal(3);
        partido.setGolesEquipoVisitante(3);
        partido.imprimirMarcador();

        System.out.println("\nBaloncesto: ");
        PartidoBaloncestoLigaColombiana partido2 = new PartidoBaloncestoLigaColombiana();
        System.out.println("Duración del partido = " + PartidoBaloncestoLigaColombiana.duracionPartido);
        partido2.setEquipoLocal("Brentford");
        partido2.setEquipoVisitante("Wolverhampton");
        partido2.setCestasEquipoLocal(20);
        partido2.setCestasEquipoVisitante(16);
        partido2.imprimirMarcador();
        }
}
