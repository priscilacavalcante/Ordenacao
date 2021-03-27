package util;

public class ArrayUtils {
    private ArrayUtils() {
    }

    /**
     * This function is used to swap values of an array.
     * @param array
     * @param p1 Position to be swapped with p2
     * @param p2 Position to be swapped with p1
     */
    public static void swap(int[] array, int p1, int p2) {
        int aux = array[p1];
        array[p1] = array[p2];
        array[p2] = aux;
    }

}