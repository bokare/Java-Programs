package com.company;

public class Q4_Remove_Consecutive {
    public static void main(String[] args) {
        String s = "aabaa" ;
        System.out.println(Remove(s));
    }

    static String Remove(String s){
        String news = new String() ;
        for(int i=0;i<s.length();){
            if(i==s.length()-1){
                news= news+s.charAt(i);
                break ;
            }
            if(s.charAt(i)==s.charAt(i+1)){
                i++;
            }else{
                news= news+s.charAt(i) ;
                i++;
            }
        }
        return news ;
    }

}
