package com.company;
// Given a string str of length N, you have to find number of palindromic subsequence
// (need not necessarily be distinct) which could be formed from the string str.
public class Q13_Count_Palindrome {
    public static void main(String[] args) {
        String Str = "aabacd" ;
        System.out.println(palindrome(Str));
    }
    static int palindrome(String str){
        int start = 0;
        int end = 0;
        int count = 0 ;
        for(int i=0 ;i<str.length();i++){
            count ++ ;
            int len1 = expandAroundCentre(str,i,i);
            int len2 = expandAroundCentre(str,i,i+1);
            int length = Math.max(len1,len2) ;
            if(length>1){   // need not necessarily be distinct
                count ++ ;
            }
        }
        return count;
    }

    static int expandAroundCentre(String str, int first, int last){
        while(first>=0 && last<str.length() && str.charAt(first)==str.charAt(last)){
            first--;
            last++;
        }
        return last-first-1 ;
    }
}
