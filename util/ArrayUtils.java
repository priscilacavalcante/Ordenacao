package util;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static void swap(int[] array, int p1, int p2) {
        int aux = array[p1];
        array[p1] = array[p2];
        array[p2] = aux;
    }

}