package interfacesMultiples;

public abstract class Vehiculo {
    protected int VelocidadActual;
    protected int VelocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        VelocidadActual = velocidadActual;
        VelocidadMaxima = velocidadMaxima;
    }

    public void imprimir() {
        System.out.println("Velocidad actual = " + VelocidadActual);
        System.out.println("Velocidad máxima = " + VelocidadActual);
    }
   
    public abstract void acelerar(int Velocidad);
    public abstract void frena(int Velocidad);
}
