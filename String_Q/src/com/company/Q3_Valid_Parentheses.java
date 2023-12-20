package com.company;
import java.util.*;

// ***** IMP *****

public class Q3_Valid_Parentheses {
    public static void main(String[] args) {
       // String s = "()[]{()}";
        String s = "(";
//        String s = "((((2)),5)z[1,2,3]2<>{}" ;
        System.out.println(isValid(s));

    }



//"3s N2me Vai4hav M1"
//        "M1 N2me 3s Vai4hav"



    static Boolean isValid(String s){
        Stack<Character> open = new Stack<>();
        Stack<Character> close = new Stack<>();
        for(int i = 0 ; i<s.length() ;i++){
            char ch = s.charAt(i) ;
            if(ch=='<' || ch=='(' || ch=='[' || ch=='{'){
                open.push((char)(ch)) ;
            }else if(ch=='>' || ch==')' || ch==']' || ch=='}'){
                close.push((char)(ch));
            }
        }

        while(!open.isEmpty() && !close.isEmpty()){
            char op = open.pop();
            char cl = close.pop();
            if(op=='('){
                if(cl==')'){
                    continue;
                }else{
                    System.out.println(op);
                    return false ;
                }
            }else{
                if(cl==op+2){
                    continue;
                }else{
                    System.out.println((char)(op));
                    return false ;
                }
            }
        }
        return true ;
    }
}
