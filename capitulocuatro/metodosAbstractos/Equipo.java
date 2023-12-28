package metodosAbstractos;

import java.util.*;

public class Equipo {
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector listaCiclista;

    public Equipo(String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
        totalTiempo=0;
        listaCiclista = new Vector();
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

    void aniadirCiclista(Ciclista ciclista) {
        listaCiclista.add(ciclista);
    }

    void listarEquipo() {
        for (int i = 0; i < listaCiclista.size(); i++) {
            Ciclista c = (Ciclista) listaCiclista.elementAt(i);
            System.out.println(c.getNombre());
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclista.size(); i++) { 
            Ciclista c = (Ciclista) listaCiclista.elementAt(i); 
            if (c.getNombre().equals(nombreCiclista)) {
            System.out.println(c.getNombre());
            }
        }
    }

    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclista.size(); i++) { 
            Ciclista c = (Ciclista) listaCiclista.elementAt(i); 
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
        }

}
