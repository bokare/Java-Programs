package com.company;

// Find minimum number of merge operations to make an array palindrome

public class Q21_MergeForPalindrome {
    public static void main(String[] args) {
        int[] arr = {11,14,15,99};
        System.out.println(Merge(arr));
    }

    static int Merge(int[] arr){
        int last = arr.length-1;
        int start = 0 ;
        int count = 0 ;

        for (int i=start; start<last;){

            if(arr[start]==arr[last]){
                start++;
                last--;
            }
            if(arr[start]<arr[last]){
                arr[start+1]=arr[start]+arr[start+1];
                start++;
                count++;
            }
            if(arr[start]>arr[last]){
                arr[last-1]=arr[last-1]+arr[last];
                last--;
                count++;
            }
        }
        return count ;
    }
}
