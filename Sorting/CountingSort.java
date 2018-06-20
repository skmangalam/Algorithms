package Sorting;

import java.util.Arrays;

public class CountingSort {
    //counting sort can be applied only when the range of the numbers are known.
    //create an array and dedicate one cell for every number present in the range.

    //if there are n elements in the array and the range is in 1-k.
    //time complexity : O(n+k)
    //extra space required : O(k)


    public static void countingSort(int[] array, int n){

        int[] count = new int[n+1];
        int[] output = new int[array.length];

        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }

        System.out.println(Arrays.toString(count));

        for(int i=1; i<count.length; i++)
            count[i] = count[i]+count[i-1];

        System.out.println(Arrays.toString(count));

        for(int i=array.length-1; i>=0; i--){
            output[count[array[i]]-1] = array[i];
            count[array[i]]=count[array[i]]-1;
        }

        for(int i=0; i<array.length; i++)
            array[i] = output[i];
    }

    public static void main(String[] args) {
        int[] array = {5,5,3,2,1,10,10,6,4,4,8,2};
        countingSort(array, 10);
        System.out.println(Arrays.toString(array));
    }
}
