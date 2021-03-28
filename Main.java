import sort.*;
import util.MeasureUtils;

public class Main {
    public static void main(String[] args) {
        int[] sizes = { 2_000, 4_000, 8_000, 16_000, 32_000, 64_000, 128_000 };
        
        Sortable[] sortables = {
            new BubbleSort(),
            new CountingSort(),
            new HeapSort(),
            new InserctionSort(),
            new MergeSort(),
            new QuickSort(),
            new SelectionSort(),
            new ShellSort() 
        };

        var measureUtils = new MeasureUtils();

        for (var size : sizes) {
            var array = generateDesc(size);
            System.out.println("\nTamanho do vetor: " + size);

            for (var s : sortables) {
                System.out.println(s.getClass().getSimpleName());

                measureUtils.start();
                s.sort(array);
                measureUtils.end();
                measureUtils.print();
            }
            System.out.println("\n");
        }
    }

    public static int[] gererateRandom(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }

        return arr;
    }

    public static int[] generateAsc(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public static int[] generateDesc(int size) {
        int[] arr = new int[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            arr[j] = i;
            j++;
        }

        return arr;
    }

}