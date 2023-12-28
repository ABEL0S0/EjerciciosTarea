package herenciaDeInterfaces;

public class PartidoFutbollLigaEspaniola implements PartidoFutbol{
    public String equipoLocal;
    public String equipoVisitante;
    public int golesEquiposLocal;
    public int golesEquiposVisitante;

    @Override
    public void setEquipoLocal(String nombreEquipo){
        this.equipoLocal=nombreEquipo;
    }

    @Override
    public void setEquipoVisitante(String nombreEquipo){
        this.equipoVisitante=nombreEquipo;
    }

    @Override
    public void setGolesEquipoLocal(int marcador){
        this.golesEquiposLocal= marcador;
    }

    @Override
    public void setGolesEquipoVisitante(int marcador){
        this.golesEquiposVisitante= marcador;
    }

    void imprimirMarcador() {
        System.out.println("Equipo local = " + equipoLocal + " = " +
        golesEquiposLocal + " - Equipo visitante = " + equipoVisitante +
        " = " + golesEquiposVisitante);
    }
}
