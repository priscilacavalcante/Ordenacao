package sort;

public class ShellSort implements Sortable{

    @Override
    public void sort(int[] array) {
        int h = 1;
        int size = array.length - 1;
        int aux = 0;
        do {
            h = (h * 3) + 1;
        } while (h < size);

        do {
            h /= 3;
            
            for (int i = 0; i < size; i++) {
                aux = array[i];
                int j = i - h;
                
                while (j >= 0 && aux < array[j]) {
                    array[j + h] = array[j];
                    j -= h;
                }
                array[j + h] = aux;
            }
        } while (h > 1);   
    }
}
