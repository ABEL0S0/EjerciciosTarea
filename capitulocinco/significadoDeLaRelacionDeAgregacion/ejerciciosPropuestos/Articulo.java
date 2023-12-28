package significadoDeLaRelacionDeAgregacion.ejerciciosPropuestos;

import java.util.Vector;

public class Articulo {
    public Vector<Seccion> secciones;
    public String resumen, concepto;

    public void agregarResumen(Seccion resumen){
        secciones.add(resumen);
    }

    public Articulo() {
        this.secciones = new Vector<>();
    }

    public Vector<Seccion> getSecciones() {
        return secciones;
    }
    public void setComentado(String concepto) {
        this.concepto = concepto;
    }
    public String getConcepto() {
        return concepto;
    }


    public void agregarSeccion(Seccion seccion) {
        secciones.add(seccion);
    }

    public void setSecciones(Vector<Seccion> secciones) {
        this.secciones = secciones;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
