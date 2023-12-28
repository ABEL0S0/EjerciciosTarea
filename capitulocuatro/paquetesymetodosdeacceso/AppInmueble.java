package paquetesymetodosdeacceso;

public class AppInmueble {
    public static void main(String[] args) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120,
            "Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        apto1.mostrar();;
        System.out.println("Datos apartamento");
        ApartamentoEstudio aptestudio1 = new ApartamentoEstudio(12354,50,
            "Avenida Caracas 30-15",1,1);
        aptestudio1.calcularPrecioVenta(ApartamentoEstudio.valorArea);
        aptestudio1.mostrar();
    }
}
