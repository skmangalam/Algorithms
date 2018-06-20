package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {10,5,20,15};
        int[] pos = insertionSort(arr, 4);
        System.out.println(Arrays.toString(pos));
    }

    public static int[] insertionSort(int[] arr, int n){
        int[] pos = new int[n];
        for(int j=0; j<n; j++){
            pos[j] = j+1;
        }
        for(int i=1; i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                pos[j+1]++;
                pos[j]--;
                j--;

            }
            arr[j+1] = key;

        }
        return pos;
    }
}
