import java.util.Arrays;

import sort.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 6, 7, 3, 5, 1, 2, 8};

        var sortable = new MergeSort();
        sortable.sort(array);

        printArray(array);
    }

    public static int[] generate(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
          arr[i] = (int)(Math.random() * size);
        }
    
        return arr;
      }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}