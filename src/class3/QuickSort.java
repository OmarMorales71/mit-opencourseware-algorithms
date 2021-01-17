package class3;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{2,1,4,13,14,12,3,16,5,2,-10};
        for (int val : array) {
            System.out.print(val + " ");
        }
        //array = myMergeSort(array);

        quickSort(array, 0, array.length-1);
        System.out.println("");
        Arrays.stream(array).forEach((value -> {
            System.out.print(value + " ");
        }));
    }

    private static void quickSort(int[] array, int leftPointer, int rightPointer) {
        if(leftPointer>=rightPointer)
            return;

        int pivotIndex = partition(array, leftPointer, rightPointer);
        quickSort(array,leftPointer, pivotIndex-1);
        quickSort(array, pivotIndex+1, rightPointer);

    }

    private static int partition(int[] array, int leftPointer, int rightPointer) {
        int pivot = array[rightPointer];
        int i=leftPointer-1;

        for(int j = leftPointer; j<rightPointer;j++){
            if(array[j]<pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, rightPointer);
        return i+1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }


}
