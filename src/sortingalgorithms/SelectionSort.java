package sortingalgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] list){
        long t1 = System.nanoTime();
        for (int i = 0; i < list.length; i++) {
            int minValue = list[i];
            int minIndex = i;

            for (int j = i; j < list.length; j++) {
                if(list[j] < minValue){
                    minValue = list[j];
                    minIndex = j;
                }
            }
            if(minValue < list[i]){
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
        long t2 = System.nanoTime() - t1;
        System.out.println("Sorted using SelectionSort: "+ Arrays.toString(list) + " \n" +
                            "Execution time: " + t2 + " ns");
    }
}

