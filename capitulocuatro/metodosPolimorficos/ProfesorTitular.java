package metodosPolimorficos;

public class ProfesorTitular extends Profesor{
    int anios =0;
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    protected void imprimirAnios() {
        System.out.println("Años = " + anios);
    }
}
