package sort;

public class MergeSort implements Sortable {

    @Override
    public void sort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        mergeSort(array, start, end);
    }

    private void mergeSort(int[] array, int start, int end) {
        if(end > start) {
            int medium = (end + start) / 2;
            mergeSort(array, start, medium);
            mergeSort(array, medium + 1, end);
            merge(array, start, medium, end);
        }
    }

    private void merge(int[] array, int start, int medium, int end) {
        int[] arrayB = new int[array.length];

        for (int num = start; num <= end; num++) {
            arrayB[num] = array[num];
        }

        int i = start;
        int j = medium + 1;

        for (int x = i; x <= end; x++) {
            if (i > medium) {
                array[x] = arrayB[j++];
            } else if (j > end) {
                array[x] = arrayB[i++];
            } else if (arrayB[i] < arrayB[j]) {
                array[x] = arrayB[i++];
            } else {
                array[x] = arrayB[j++];
            }
        }   
    }
}
