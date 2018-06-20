package Sorting;

import java.util.Arrays;

// at the end of each iteration, the maximum element goes to the end.
// we keep comparing each element to the next one.
// and keep swapping if next element is smaller than the current one.

// time complexity : O(n*n)
// space complexity: O(1)

// if there is no swapping done in any pass, we don't need to iterate further.
// that is why flag has been used.

public class BubbleSort {
    public static void bubbleSort(int[] a, int n){

        for(int i=0; i<n; i++){
            int flag=0;
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }


    }

    public static void main(String[] args) {
        int[] array={20,15,90,120,10};
        bubbleSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
