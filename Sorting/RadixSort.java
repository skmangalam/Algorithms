package Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void radixSort(int[] array, int n){
        int m = getMax(array);
        //System.out.println(m);
        for(int exp=1; m/exp>0; exp=exp*10)
            countSort(array, n, exp);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max)
                max = array[i];
        }
        return max;
    }
    public static void countSort(int[] array, int n, int exp){
        int[] output = new int[n];
        int[] count = new int[10];

        for(int i=0; i<n; i++){
            count[(array[i]/exp)%10]++;
        }

        for(int i=1; i<10; i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i=0; i<array.length; i++){
            output[count[(array[i]/exp)%10]-1] = array[i];
            count[(array[i]/exp)%10]--;
        }

        for(int i=0; i<n; i++)
            array[i] = output[i];
    }
}
