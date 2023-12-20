package com.company;

public class reverse_statement {
    public static void main(String[] args) {
        String sc = " hi my name    is vaibhav      " ;
        //answer(sc) ;
        System.out.println(reverse(sc,0));

    }

    static String answer = "" ;
    static String reverse(String s , int start){
        if(start>=s.length()){
            return answer ;
        }
        int i=start ;
        while(i<s.length() && s.charAt(i)!=' ' ){
            i++ ;
        }
        answer = s.substring(start,i)+answer ;  // String[] newData = input.split("[ ,!?._'@]+");
        while(i<s.length() && s.charAt(i)==' '){
            answer = " "+answer;
            i++ ;
        }
        reverse(s,i) ;
        return  answer;
    }
}
