package herenciaDeInterfaces;

public class PartidoBaloncestoLigaColombiana implements PartidoBaloncesto{
    public String equipoLocal;
    public String equipoVisitante;
    public int cestaEquiposLocal;
    public int cestaEquiposVisitante;

    @Override
    public void setEquipoLocal(String nombreEquipo){
        this.equipoLocal=nombreEquipo;
    }

    @Override
    public void setEquipoVisitante(String nombreEquipo){
        this.equipoVisitante=nombreEquipo;
    }

    @Override
    public void setCestasEquipoLocal(int marcador) {
        this.cestaEquiposLocal=marcador;
    }

    @Override
    public void setCestasEquipoVisitante(int marcador) {
        this.cestaEquiposVisitante=marcador;
    }


    void imprimirMarcador() {
        System.out.println("Equipo local = " + equipoLocal + " = " +
        cestaEquiposLocal + " - Equipo visitante = " + equipoVisitante +
        " = " + cestaEquiposVisitante);
    }
    
}
