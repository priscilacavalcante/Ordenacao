package sort;

import static util.ArrayUtils.swap;

public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] array) {
        boolean changed;
        int size = array.length;

        do {
            changed = false;
            
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    changed = true;
                }
            }
            size -= 1;
        } while (changed);
    }
}