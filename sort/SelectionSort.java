package sort;

import static util.ArrayUtils.swap;

public class SelectionSort implements Sortable {

    @Override
    public void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] > array[j + 1]) {
                    swap(array, i, j + 1);
                }
            }
        }
    }
}
