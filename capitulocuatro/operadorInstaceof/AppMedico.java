package operadorInstaceof;

import java.util.Vector;

public class AppMedico {
   public static void main(String[] args) {
        Vector listaMedicos = new Vector();
        Medico medico1 = new Medico();
        listaMedicos.add(medico1);
        Ortopedista ortopedista1 = new Ortopedista();
        listaMedicos.add(ortopedista1);
        Pediatra pediatra1 = new Pediatra();
        listaMedicos.add(pediatra1);
        for (int i = 0; i < listaMedicos.size(); i++) {

            Medico a = (Medico) listaMedicos.elementAt(i);
            if (a instanceof Ortopedista) {

                System.out.println("El objeto en el indice "+ i + " es de la clase Ortopedista");
                continue;
            }
            if (a instanceof Pediatra) {
                System.out.println("El objeto en el indice " + i + " es de la clase Pediatra");
                continue;
            }
            if (a instanceof Medico) {
                System.out.println("El objeto en el indice "+i + " es de la clase Médico");
                continue;
            }
        }
    }
}