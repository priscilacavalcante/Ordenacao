import java.util.Arrays;

import sort.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        var sortable = new CountingSort();
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