package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "abcas" ;
        String s2 = "bcaa" ;
        if(isAnagram(s1,s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        System.out.println(5>2?"y":"n");

    }
    static boolean isAnagram(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false ;
        }
        s1 = s1.toLowerCase() ;
        s2 = s2.toLowerCase() ;
        int[] arr1 = new int[26] ;
        int[] arr2 = new int[26] ;
        for(int i=0 ;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false ;
            }
        }
        return true ;
    }
}
