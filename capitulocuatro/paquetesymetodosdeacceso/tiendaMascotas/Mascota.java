package paquetesymetodosdeacceso.tiendaMascotas;

public class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;
    
    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]"); 
    }

}
