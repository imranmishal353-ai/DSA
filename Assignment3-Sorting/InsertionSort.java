import java.util.Random;

public class InsertionSort {

    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
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
        insertionSort(arr);
        long end = System.nanoTime();

        long nano = end - start;
        System.out.println("********** Insertion Sort Completed! **********");
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