package clasesAbstractas.numeros;

public abstract class Numerico {
    public abstract String toString();
    public abstract boolean equals (Object ob);
    public abstract Numerico sumar(Numerico numero);
    public abstract Numerico restar(Numerico numero);
    public abstract Numerico multiplicar(Numerico numero);
    public abstract Numerico dividir(Numerico numero);
}
