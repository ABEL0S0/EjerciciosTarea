package relaciondeAsociacion;

public class Camion extends Vehiculo{
    public static int valorPeajeEje=5000;

    public int numeroEjes;

    public Camion(String placa, int numeroEjes){
        super(placa);
        this.numeroEjes=numeroEjes;
    }

    public static int getValorPeajeEje() {
        return valorPeajeEje;
    }

    public static void setValorPeajeEje(int valorPeajeEje) {
        Camion.valorPeajeEje = valorPeajeEje;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + numeroEjes);
        System.out.println("Valor del peaje = " + valorPeajeEje);
    }
}
