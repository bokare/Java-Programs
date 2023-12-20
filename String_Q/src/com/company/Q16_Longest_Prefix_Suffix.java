package com.company;
//  ****
public class Q16_Longest_Prefix_Suffix{
    public static void main(String[] args) {
        String  s = "abab" ;
        System.out.println(longest(s));

    }
    static int longest(String s){
        int count = s.length()-1 ;
        int start =0;
        int end = s.length()-1 ;
        int first = s.length()-2;
        int last = 1 ;
        for(count = s.length()-1 ;count>=0  ;){
//            if(first==start&&last==end){
//                return count ;
//            }

            if(first==-1 && last==s.length()){
                return 0;
            }
            if(s.charAt(start)!=s.charAt(last) || s.charAt(first)!=s.charAt(end)){
                count-- ;
                first--;
                last++;
            }else{
                if(range(s,first,last)){
                    return count ;
                }else{
                    first--;
                    last++;
                    count--;
                }
            }
        }
        return count ;
    }
    static boolean range(String s,int first , int last) {
        int start = 0;
        while(start<=first && last<s.length()){
            if(s.charAt(start)!=s.charAt(last)){
                return false ;
            }
            last++;
            start++;
        }
        return true ;
    }
}
