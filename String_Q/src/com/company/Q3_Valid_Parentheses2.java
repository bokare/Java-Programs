package com.company;

import java.util.Stack;

// ***  !! correct program  ***
public class Q3_Valid_Parentheses2 {
    public static void main(String[] args) {
        String s = "({djf[k,0<>]]})";
        System.out.println(isvalid(s));
    }

    static boolean isvalid(String s){
        Stack<Character> open = new Stack<>();
        Stack<Character> close = new Stack<>();
        for(int i = 0 ; i<s.length() ;i++){

            char ch = s.charAt(i) ;
            if(ch=='<' || ch=='(' || ch=='[' || ch=='{'){
                open.push((char)(ch)) ;
            }
            else if(ch==')'){
                char chopen = open.pop() ;
                if(chopen+1!=ch){
                    return false ;
                }

            }else if(ch=='>' ||  ch==']' || ch=='}'){
                char chclose = open.pop() ;
                if(chclose+2!=ch){
                    return false ;
                }
            }
        }
        return open.isEmpty() && close.isEmpty() ;
    }
}
