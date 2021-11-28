package sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] list){
        long t1 = System.nanoTime();
        for(int pos = 0; pos < list.length; pos++){
            int nextVal = list[pos];
            int nextPos = pos;

            while(nextPos > 0 && nextVal < list[nextPos - 1]){
                list[nextPos] = list[nextPos - 1];
                nextPos--;
            }
            list[nextPos] = nextVal;
        }
        long t2 = System.nanoTime() - t1;
        System.out.println("Sorted using InsertionSort: "+ Arrays.toString(list) + " \n" +
                            "Execution time: " + t2 + " ns");
    }

}

