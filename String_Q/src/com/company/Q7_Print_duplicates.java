package com.company;
// **** Imp ****

public class Q7_Print_duplicates {
    public static void main(String[] args) {
        //String str = "test string";
        String str = "geeksforgeeks" ;
        print(str) ;
    }

    static void print(String str){
        int[] arr = new int[26] ;
        for(int i=0 ; i<str.length();i++){
            if(str.charAt(i)==' '){
                i++;
            }
            arr[str.charAt(i)-'a']++;  // ********* IMP *************
        }

        for(int j=0 ;j<arr.length;j++){
            if(arr[j]>1){
                System.out.println((char)(j+'a')+" = "+ arr[j]);
            }
        }
    }

}
