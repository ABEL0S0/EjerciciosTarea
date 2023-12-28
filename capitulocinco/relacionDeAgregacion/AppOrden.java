package relacionDeAgregacion;

public class AppOrden {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metalica", 1000);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro", 3000);
        Producto producto3 = new Producto(3, "Cinta pegante", "Cinta adhesiva de color transparente", 800);
        Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms", 600);

        Orden orden = new Orden(1);
        orden.aniadirItem(1, 5, producto1);
        orden.aniadirItem(2, 3, producto2);
        orden.aniadirItem(3, 2, producto3);
        orden.aniadirItem(4, 4, producto4);
        orden.calcularTotalOrden();
        System.out.println(orden);

        System.out.println();
        System.out.println();
        Producto producto5 = new Producto(5, "Esfero", "Esfero de tinta azul", 90);
        Orden orden2 = new Orden(2);
        orden2.aniadirItem(1, 6, producto5);

        Cliente cliente1 = new Cliente("Abel","Avila", 145234, "09854321", "Espejo y colon");
        cliente1.aniadirOrden(orden2);
        Empresa empresa = new Empresa("Pucese", 15632543, "095412157", "Tachina");
        empresa.aniadirOrden(orden);
        System.out.println(cliente1); 
        System.out.println();
        System.out.println(empresa);
    }
}
