import java.util.Random;

public class MergeSort {

    static void mergeSort(int[] a, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = a[left + i];
        for (int j = 0; j < n2; j++) R[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) a[k++] = L[i++];
            else a[k++] = R[j++];
        }
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }

    public static void main(String[] args) {
        int size = 100000; // change this to test bigger/smaller arrays
        int[] arr = new int[size];
        Random rand = new Random(42); // same seed = same data in every file
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }

        long start = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();

        long nano = end - start;
        System.out.println("********** Merge Sort Completed! **********");
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