package sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] list){
        long t1 = System.nanoTime();
        int temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if(list[j] > list[j + 1]){
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        long t2 = System.nanoTime() - t1;
        System.out.println("Sorted using BubbleSort: "+ Arrays.toString(list) + " \n" +
                            "Execution time: " + t2 + " ns");
    }
}

