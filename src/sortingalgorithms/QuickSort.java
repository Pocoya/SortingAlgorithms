package sortingalgorithms;
import java.util.*;

public class QuickSort {

    public static void sort(int[] list) {
        long t1 = System.nanoTime();
        quickSort(list, 0, list.length - 1);
        long t2 = System.nanoTime() - t1;
        System.out.println("Sorted using QuickSort: "+ Arrays.toString(list) + " \n" +
                            "Execution time: " + t2 + " ns");
    }

    private static void quickSort(int[] A, int low, int high) {
        if (low < high + 1) {
            int p = partition(A, low, high);
            quickSort(A, low, p - 1);
            quickSort(A, p+1, high);
        }
    }

    private static void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    // returns random pivot index between low and high inclusive.
    private static int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    // moves all n < pivot to left of pivot and all n > pivot
    // to right of pivot, then returns pivot index.
    private static int partition(int[] A, int low, int high) {
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border - 1);
        return border - 1;
    }
}
