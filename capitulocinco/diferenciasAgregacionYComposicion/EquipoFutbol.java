package diferenciasAgregacionYComposicion;

import java.util.Arrays;
import java.util.Comparator;

public class EquipoFutbol {
    public String nombre;
    public String pais;
    public Tecnico tecnico;
    public Portero portero;
    public Defensa[] defensas;
    public Mediocampo[] mediocampos;
    public Delantero[] delanteros;

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public EquipoFutbol(String nombre, String ciudad, Tecnico tecnico, Portero portero,
    Defensa[] defensas, Mediocampo[] mediocampos, Delantero[] delanteros){
        this(nombre, ciudad);
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    public void imprimir(){
        System.out.println("Nombre del equipo: "+nombre);
        System.out.println("Pais: "+pais);
        System.out.println("Portero: "+portero);
        System.out.println("Defensas: ");
        for(int i=0; i<defensas.length;i++){
            System.out.println(defensas[i]);
        }
        System.out.println("MedioCampo: ");
        for(int j=0; j<mediocampos.length;j++){
            System.out.println(mediocampos[j]);
        }
        System.out.println("Delanteros: ");
        for(int k=0; k<delanteros.length;k++){
            System.out.println(delanteros[k]);
        }
    }

    private int puntos;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesAnotados;
    private int golesRecibidos;
    private int diferenciaGoles;

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }

    public void registrarPartido(int golesAnotados, int golesRecibidos){
        if(golesAnotados > golesRecibidos){
            puntos+= 3;
            partidosGanados++;
        } else if (golesAnotados == golesRecibidos) {
            puntos += 1;
            partidosEmpatados++;
        } else {
            partidosPerdidos++;
        }
        this.golesAnotados += golesAnotados;
        this.golesRecibidos += golesRecibidos;
        this.diferenciaGoles = this.golesAnotados - this.golesRecibidos;
    }

    public void resultadosFinales(){
        if (partidosPerdidos > 0){
            System.out.println("Perdió");
            System.out.println();
        }
        else if(partidosEmpatados > 0){
            System.out.println("Empató");
            System.out.println();
        } else{
            System.out.println("Ganó");
            System.out.println();
        }
    }

    public static EquipoFutbol crearEquipo (String nombre, String pais){
        return new EquipoFutbol(nombre,pais);
    }

    public static void simularPartido(EquipoFutbol equipo1, EquipoFutbol equipo2, int golesEquipo1, int golesEquipo2){
        equipo1.registrarPartido(golesEquipo1, golesEquipo2);
        equipo2.registrarPartido(golesEquipo2, golesEquipo1);
    }

    public static void tablaPosiciones(EquipoFutbol[] equipoFutbols){
        Arrays.sort(equipoFutbols, Comparator.comparingInt(EquipoFutbol::getPuntos).reversed());
        System.out.println("Tabla de posiciones");
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Equipo", "Puntos", "PG", "PE", "PP", "GF", "GC", "Dif. Goles");

        for (EquipoFutbol equipoFutbol : equipoFutbols){
            System.out.printf("%-20s%-10d%-10d%-10d%-10d%-10d%-10d%-10d%n", equipoFutbol.getNombre(), equipoFutbol.getPuntos(),
                    equipoFutbol.getPartidosGanados(), equipoFutbol.getPartidosEmpatados(), equipoFutbol.getPartidosPerdidos(),
                    equipoFutbol.getGolesAnotados(), equipoFutbol.getGolesRecibidos(), equipoFutbol.getDiferenciaGoles());
            equipoFutbol.resultadosFinales();
        }
    }

}
