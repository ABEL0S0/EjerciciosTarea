package paquetesymetodosdeacceso.tiendaMascotas;

public class PerrosMedianos extends Perros{
    enum Razamedianos{COLLIE,DALMATA,BULLDOG,GALGO,SABUESO};
    protected Razamedianos Razamedianos;

    public PerrosMedianos(String nombre, int edad, String color, String peso, boolean muerde, Razamedianos Razamedianos) {
        super(nombre, edad, color, peso, muerde);
        this.Razamedianos = Razamedianos;
    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println("PerrosMedianos [Raza=" + Razamedianos + "]");
    }
}
