package com.company;
import java.util.Stack;

public class S_reverse_Stack {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottom(data , s);
        // here stack is empty amd new element is added now add pre element
        s.push(top) ;
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top,s);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
