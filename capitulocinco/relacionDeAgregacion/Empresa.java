package relacionDeAgregacion;

import java.util.Vector;

public class Empresa {
    private String nombre;
    private int NIT;
    private String telefono;
    private String direccion;
    private Vector ordenes;

    public Empresa(String nombre, int nIT, String telefono, String direccion ) {
        this.nombre = nombre;
        NIT = nIT;
        this.telefono = telefono;
        this.direccion = direccion;
        ordenes = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int nIT) {
        NIT = nIT;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void aniadirOrden(Orden orden){
        ordenes.add(orden);
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre +", NIT=" + NIT + ", telefono=" + telefono + ", direccion=" + direccion
                + ", ordenes=" + ordenes + "]";
    }
}
