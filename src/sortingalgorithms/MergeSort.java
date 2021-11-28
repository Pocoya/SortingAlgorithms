package sortingalgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] list){
        long t1 = System.nanoTime();
        int[] tempList = new int[list.length];
        mergeSort(list, tempList, 0, list.length - 1);
        long t2 = System.nanoTime() - t1;
        System.out.println("Sorted using MergeSort: "+ Arrays.toString(list) + " \n" +
                            "Execution time: " + t2 + " ns");
    }
    private static void mergeSort(int[] list, int[] tempList, int first, int last){
        if(first < last){
            int mid = first + (last - first) / 2;
            mergeSort(list, tempList, first, mid);
            mergeSort(list, tempList, mid + 1, last);
            merge(list, tempList, first, mid + 1, last);
        }
    }
    private static void merge(int[] list, int[] tempList, int first, int mid, int last){
        int leftEnd = (first + last) / 2;
        int rightStart = leftEnd + 1;
        int size = last - first + 1;

        int left = first;
        int right = rightStart;
        int index = first;

        while(left <= leftEnd && right <= last){
            if(list[left] < list[right]){
                tempList[index] = list[left];
                left++;
            } else {
                tempList[index] = list[right];
                right++;
            }
            index++;
        }
        System.arraycopy(list, left, tempList, index, leftEnd - left + 1);
        System.arraycopy(list, right, tempList, index, last - right + 1);
        System.arraycopy(tempList, first, list, first, size);
    }
}
