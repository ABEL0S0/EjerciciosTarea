package paquetesymetodosdeacceso.tiendaMascotas;

public class Perros extends Mascota{


    protected String peso;
    protected boolean muerde;

    public Perros(String nombre, int edad, String color, String peso, boolean muerde) {
        super(nombre, edad, color);

        this.peso = peso;
        this.muerde = muerde;
    }

    public static void sonido(){
        System.out.println("Los perros ladran");
    }

    @Override
    public void mostrar() {
        System.out.println("Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]");
        System.out.println("Perro [peso=" + peso + ", muerde=" + muerde + "]");  
    }

}
