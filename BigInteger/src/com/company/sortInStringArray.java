package com.company;

import java.util.Arrays;

public class sortInStringArray {
    public static void main(String[] args) {

        String[] arr = {"1","2","3","4","5"} ;
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(String[] s){
        for(int i=0 ;i<s.length;i++){
            for(int j=i;j>0;j--){
                if(Integer.parseInt(s[j])>(Integer.parseInt(s[j-1]))){
                    String temp = s[j];
                    s[j] = s[j-1] ;
                    s[j-1] = temp ;
                }else{
                    break ;
                }
            }
        }
    }

}
