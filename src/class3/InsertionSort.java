package class3;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 4, 6, 1, 3};
        for (int val : array) {
            System.out.print(val + " ");
        }
        insertionSort(array);
        System.out.println("");
        Arrays.stream(array).forEach((value -> {
            System.out.print(value + " ");
        }));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int base = i - 1;
            while (base >= 0 && array[base] > key) {
                array[base + 1] = array[base];
                base--;
            }
            array[base + 1] = key;
        }
    }

}
