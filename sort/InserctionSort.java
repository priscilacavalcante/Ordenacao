package sort;

import static util.ArrayUtils.swap;

public class InserctionSort implements Sortable {

    @Override
    public void sort(int[] array) {
        
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }
    
}
