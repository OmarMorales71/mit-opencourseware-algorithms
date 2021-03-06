package class3;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{-555555, 2, 4, 6, 1, 3,2,0,22,55,4,-11,-3,6,88,77,144,5,6,2,12,10,1,25,1255,1478,12,36,25,98,7,4,14,52,525,8,9898,98985522,45,4745,632,58,7,4,1,2,3,6,9,8,7,78};
        for (int val : array) {
            System.out.print(val + " ");
        }
        //array = myMergeSort(array);

        mergeSort(array, array.length);
        System.out.println("");
        Arrays.stream(array).forEach((value -> {
            System.out.print(value + " ");
        }));
    }

    public static int[] myMergeSort(int[] array){
        if(array.length==1){
            return array;
        }
        int mid = (array.length-1)/2;

        int[] left = myMergeSort(Arrays.copyOfRange(array,0, mid+1));
        int[] right = myMergeSort(Arrays.copyOfRange(array,mid+1, array.length));

        int l=0,r=0;
        for(int i=0;i<array.length;i++){
            if(l>=left.length){
                array[i]=right[r];
                r++;
            }else if(r>=right.length){
                array[i]=left[l];
                l++;
            }else if(left[l]<right[r]){
                array[i]=left[l];
                l++;
            }else{
                array[i]=right[r];
                r++;
            }
        }
    return array;
    }

    public static void mergeSort(int arr[], int n){

        if(n<2)
            return;

        int mid = n/2;
        int nLeft = mid;
        int nRight = n-mid;

        /*Temp arrays*/

        int[] L = new int[nLeft];
        int[] R = new int[nRight];

        for(int i = 0; i<mid; i++){
            L[i] = arr[i];
        }

        for(int i = mid; i<n;i++){
            R[i-mid] = arr[i];
        }

        mergeSort(L, nLeft);
        mergeSort(R, nRight);
        
        merge(arr, L,R);
    }

    private static void merge(int[] array, int[] l, int[] r) {

        int i=0, leftPointer=0, rightPointer=0;
        while(leftPointer<l.length && rightPointer<r.length){
            if(l[leftPointer]<r[rightPointer]){
                array[i]=l[leftPointer];
                leftPointer++;
            }else{
                array[i]=r[rightPointer];
                rightPointer++;
            }
            i++;
        }

        while(leftPointer<l.length){
            array[i]=l[leftPointer];
            leftPointer++;
            i++;
        }

        while(rightPointer<r.length){
            array[i]=r[rightPointer];
            rightPointer++;
            i++;
        }
    }
}
