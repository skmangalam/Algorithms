package Searching;

import java.util.Arrays;

public class BinarySearch_Recursive {
    public static void main(String[] args) {

        int[] arr = {1,5,10,2,7};
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, 0 ,4,7));

     }
    public static int binarySearch(int[] arr, int l, int r, int key){
        if(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                return binarySearch(arr, l, l+mid-1,key);
            else return binarySearch(arr, mid+1, r,key);
        }
        return -1;
    }
}
