package sort;

public class CountingSort implements Sortable {

    @Override
    public void sort(int[] array) {
        var size = array.length;
        var largest = array[0];

        for (int i = 0; i < size; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        countingSort(array, size, largest);
    }

    private void countingSort (int[] array, int size, int largest) {
        var largestSize = largest + 1;
        var count = new int[largestSize];
        var order = new int[size];

        // Zerando as posições do contador
        for (int i = 0; i < largestSize; i++) {
            count[i] = 0;
        }

        // Contagem do valor em cada posição array[i] = i++ e armazena no vetor do contador
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Pega o anterior e soma com o que valor dele
        for (int i = 1; i < largestSize; i++) {
            count[i] += count[i - 1];
        }

        // Ordenando o vetor
        for (int i = size - 1; i >= 0; i--) {
            order[count[array[i]] - 1] = array [i];
            count[array[i]]--;
        }

        // Copiando para o vetor original
        for (int i = 0; i < size; i++) {
            array[i] = order[i];
        }
    } 
}