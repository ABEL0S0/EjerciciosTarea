package polimorfismo;

public class AppProfesor {
    public static void main(String[] args) {
        //Prueba1
        Profesor profesor = new ProfesorTitular();
        profesor.imprimir();

        //Ejercicio Propuesto
        Profesor profesor1 = new ProfesorTitular();
        Profesor profesor2 = (Profesor) profesor1;
        profesor2.imprimir();

    }
}
