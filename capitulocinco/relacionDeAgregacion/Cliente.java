package relacionDeAgregacion;

import java.util.Vector;

public class Cliente {
    private String nombre;
    private String apellido;
    private int numeroDocumento;
    private String telefono;
    private String direccion;
    private Vector ordenes;

    public Cliente(String nombre, String apellido, int numeroDocumento, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
        return "Cliente Particular [nombre=" + nombre +", numero documento=" + numeroDocumento + ", telefono=" + telefono + ", direccion=" + direccion
                + ", ordenes=" + ordenes + "]";
    }

}
