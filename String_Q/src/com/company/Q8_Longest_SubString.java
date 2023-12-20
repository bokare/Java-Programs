package com.company;
import java.util.HashSet;
// Longest Substring Without Repeating Characters
// ***** IMP *****
public class Q8_Longest_SubString {
    public static void main(String[] args) {
        //String in = "abcde" ;
        String in = "bbbbabbbabcde" ;
        System.out.println(Longest(in));

    }
    static int Longest(String in){
        int max = 0 ;
        for(int i=0; i<in.length(); i++){
      //we can reduce the time for loop by doing : if max==in.length return max ; it will not run for i=1,2,3,,
            for(int j=i;j<in.length();j++){
                if(NoRepet(in,i,j)){
                    max= Math.max(max,j-i+1) ;  // it will check for "range" in bet i and j is there is any repet or not
                }
            }
        }
        return max ;
    }

    // it will check is there any repeat char in given range
    static boolean NoRepet(String in, int start, int end) {
        HashSet<Character> set = new HashSet<>() ;
        for(int i=start ;i<=end ;i++){
            if(set.contains(in.charAt(i))){   // it check is current char is already present in set or not
                return false;                 // if yes then it return false ;
            }
            set.add(in.charAt(i)) ;    // if not already present it will add now
        }
        // if all char are added it means no duplicates is there
        return true ;
    }
}
