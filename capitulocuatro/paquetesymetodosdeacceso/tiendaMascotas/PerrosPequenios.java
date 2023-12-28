package paquetesymetodosdeacceso.tiendaMascotas;

public class PerrosPequenios extends Perros{
    enum Razapequenias{CANICHE,YORKSHIRE,TERRIER,SCHNAUZER,CHIHUAHUA};
    protected Razapequenias Razapequenias;

    public PerrosPequenios(String nombre, int edad, String color, String peso, boolean muerde, Razapequenias Razapequenias) {
        super(nombre, edad, color, peso, muerde);
        this.Razapequenias = Razapequenias;
    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println("Perros Pequenios [Raza=" + Razapequenias + "]");
    }
}
