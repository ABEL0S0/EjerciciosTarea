package clasesAbstractas.numeros;

public class AppNumerico {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(1,2);
        Fraccion f2 = new Fraccion(3,4);
        System.out.println("Fraccion 1 = " + f1.toString());
        System.out.println("Fraccion 2 = " + f2.toString());
        System.out.println("Suma = " + f1.sumar(f2).toString());
        System.out.println("Resta = " + f1.restar(f2).toString());
        System.out.println("Multiplicacion = " + f1.multiplicar(f2).toString());
        System.out.println("Division = " + f1.dividir(f2).toString());
    }
    
}