package paquetesymetodosdeacceso;

public class Inmueble {
    protected int idInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmueble(int idInmobiliario, int area, String direccion) {
        this.idInmobiliario = idInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularPrecioVenta(double valorArea){
        this.precioVenta = area * valorArea;
        return this.precioVenta;
    }
    
    public void mostrar(){
        System.out.println("Id Inmobiliario = " + idInmobiliario);
        System.out.println("Area = " + area);
        System.out.println("Direccion = " + direccion);
        System.out.println("Precio Venta = $" + precioVenta);
    }
    
}
