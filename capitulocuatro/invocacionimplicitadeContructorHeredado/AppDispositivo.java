package invocacionimplicitadeContructorHeredado;

public class AppDispositivo {
    public static void main(String[] args) {
        Tableta tablet = new Tableta("Dell");
        System.out.println(tablet.marca);
    }
}