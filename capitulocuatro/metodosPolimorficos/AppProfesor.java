package metodosPolimorficos;

import java.util.Vector;

public class AppProfesor {
    Vector profesores;

    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        profesor1.imprimir();

        ProfesorTitular profesor2 = new ProfesorTitular();
        profesor2.imprimirAnios();
        System.out.println();
        
        //Ejercicio propuesto
        AppProfesor prueba = new AppProfesor();
        prueba.profesores = new Vector();
        Profesor profesor3 = new Profesor();
        ProfesorTitular profesor4 = new ProfesorTitular();
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);
        for(int i = 0; i < prueba.profesores.size(); i++) {
            Profesor p = (Profesor) prueba.profesores.elementAt(i);
            p.imprimir();
        }
    }
}
