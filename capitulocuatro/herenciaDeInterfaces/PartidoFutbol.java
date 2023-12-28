package herenciaDeInterfaces;

public interface PartidoFutbol extends MatchDeportivo{
    public static final int duracionPartido = 90;
    public void setGolesEquipoLocal(int marcador);
    public void setGolesEquipoVisitante(int marcador);
}
