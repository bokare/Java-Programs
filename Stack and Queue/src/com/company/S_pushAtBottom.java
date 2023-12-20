package com.company;
import java.util.Stack;

public class S_pushAtBottom {
    //  ****  IMP   ****  recursion ex

    public static void push(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        push(data , s);
        // here stack is empty amd new element is added now add pre element
        s.push(top) ;

    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        push(4,s);

        //  push at bottom using inbuilt method
        s.add(0,5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
