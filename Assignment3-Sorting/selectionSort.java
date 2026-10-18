import java.util.Random;

public class selectionSort {

    static void SelectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
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
        SelectionSort(arr);
        long end = System.nanoTime();

        long nano = end - start;
        System.out.println("********** Selection Sort Completed! **********");
        System.out.println("Total Elements: " + size);
        System.out.println("Execution time in NanoSeconds: " + nano);
        System.out.println("Execution time in MilliSeconds: " + nano / 1_000_000.0);

        System.out.println("******** First 20 elements of Sorted Array ********");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}