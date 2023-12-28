package metodosAbstractos;

public class AppEquipo {
    public static void main(String args[]) {
        Equipo equipo1 = new Equipo("Sky","Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas",
        320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal",
        5, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981,
        "Jonathan Castroviejo", 120);
        equipo1.aniadirCiclista(velocista1);
        equipo1.aniadirCiclista(escalador1);
        equipo1.aniadirCiclista(contrarrelojista1);
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);
        equipo1.calcularTotalTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
        }
}