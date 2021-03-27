package sort;

import static util.ArrayUtils.swap;

public class QuickSort implements Sortable {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {
        var i = start;
        var j = end;
        var pivot = array[(i + j) / 2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }

            if (j > start) {
                quickSort(array, start, j);
            }

            if (i < end) {
                quickSort(array, i, end);
            }
        }
    }

}
