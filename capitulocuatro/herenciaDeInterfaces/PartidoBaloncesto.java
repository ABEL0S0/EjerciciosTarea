package herenciaDeInterfaces;

public interface PartidoBaloncesto extends MatchDeportivo{
    public static final int duracionPartido = 40;

    public void setCestasEquipoLocal(int marcador);
    public void setCestasEquipoVisitante(int marcador);
}
