package significadoDeLaRelacionDeAgregacion;

import java.util.Vector;

public class AppMuniDepa {
    public static void main(String[] args) {
        Municipio municipio1 = new Municipio("Manizales", 400000,17, 2200);
        Municipio municipio2 = new Municipio("La Dorada", 98000, 28,1000);
        Municipio municipio3 = new Municipio("Neira", 30000, 20,1969);

        Vector municipios = new Vector();
        municipios.add(municipio1);
        municipios.add(municipio2);
        municipios.add(municipio3);

        Departamento departamento = new Departamento("Caldas", municipios);
        System.out.println("El censo del Departamento de " +
        departamento.getNombre() + " es = " + departamento.
        calcularCensoPoblacionDepartamento());
        System.out.println("Municipios con población mayor a 50.000");
        departamento.buscarMunicipioConPoblacionMayor(50000);
        System.out.println("Busqueda del municipio de Manizales");
        departamento.buscarMunicipio("Manizales");
    }
}
