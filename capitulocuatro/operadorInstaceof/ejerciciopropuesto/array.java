package operadorInstaceof.ejerciciopropuesto;

public class array {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        float[] arrayFloat = new float[5];
        Integer[] arrayObjetosInt = new Integer[5];
        System.out.println(arrayInt instanceof Object);
        System.out.println(arrayInt instanceof int[]);
        System.out.println(arrayFloat instanceof Object);
        System.out.println(arrayFloat instanceof float[]);
        System.out.println(arrayObjetosInt instanceof Object);
        System.out.println(arrayObjetosInt instanceof Object[]);
        System.out.println(arrayObjetosInt instanceof Integer[]);
    }
}
