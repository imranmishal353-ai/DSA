import java.util.Random;

public class BubbleSort {

    static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // already sorted, stop early
        }
    }

    public static void main(String[] args) {
        int size = 100000; // change this to test bigger/smaller arrays
        int[] arr = new int[size];
        Random rand = new Random(42); // same seed = same data in every file
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }

        long start = System.nanoTime();
        bubbleSort(arr);
        long end = System.nanoTime();

        long nano = end - start;
        System.out.println("********** Bubble Sort Completed! **********");
        System.out.println("Total Elements: " + size);
        System.out.println("Execution time in NanoSeconds: " + nano);
        System.out.println("Execution time in MilliSeconds: " + nano / 1_000_000.0);

        System.out.println("******** First 20 elements of Sorted Array ********");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}