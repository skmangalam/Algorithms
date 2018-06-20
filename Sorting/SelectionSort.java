package Sorting;

import java.util.Arrays;

// in each pass, the smallest element is in the correct position.
// and with each pass, we are reducing the size of the array by one.
// T(n) = T(n-1) + O(n) = O(n*n)

// time complexity : O(n*n)
// space complexity : O(1)

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10,24,56,5,18};
        selectionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionSort(int[] array, int n){
        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(array[min]>array[j])
                    min = j;
            }
            int temp=array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
