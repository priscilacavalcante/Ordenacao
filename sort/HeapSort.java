package sort;

import static util.ArrayUtils.swap;

public class HeapSort implements Sortable {

    @Override
    public void sort(int[] array) {
      int n = array.length;
  
      for (int i = n / 2 - 1; i >= 0; i--)
        maxHeap(array, n, i);
      
      for (int i = n - 1; i > 0; i--) {
        swap(array, 0, i);
        maxHeap(array, i, 0);
      }
    }
  
    private void maxHeap(int[] heapSort, int n, int i) {
      var largest = i;
      var l = 2 * i + 1;
      var r = 2 * i + 2;
  
      if (l < n && heapSort[l] > heapSort[largest])
        largest = l;
  
      if (r < n && heapSort[r] > heapSort[largest])
        largest = r;
  
      if (largest != i) {
        swap(heapSort, i, largest);
        maxHeap(heapSort, n, largest);
      }
    }
  }
