import java.util.Arrays;

import sort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        var sortable = new BubbleSort();
        sortable.sort(array);

        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}