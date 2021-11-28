package sortingalgorithms;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 23, 234, 5334, 53432, 1, 0, 9};
        System.out.println("Choose an algorithm from 1 to 5:\n" +
                            "1. QuickSort \n" +
                            "2. SelectionSort \n" +
                            "3. MergeSort \n" +
                            "4. InsertionSort \n" +
                            "5. BubbleSort");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        try {
            switch (option) {
                case 1 -> QuickSort.sort(arr);
                case 2 -> SelectionSort.sort(arr);
                case 3 -> MergeSort.sort(arr);
                case 4 -> InsertionSort.sort(arr);
                case 5 -> BubbleSort.sort(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}