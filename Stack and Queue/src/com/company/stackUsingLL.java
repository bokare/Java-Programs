package com.company;

public class stackUsingLL {

    // creating constructor
    static class Node{
        int data ;
        Node next ;
        public Node(int data ){
            this.data = data ;
            next = null ;
        }
    }

    // class stack
    static class stack{
        public static Node head ;
        public static boolean isempty(){
            return head==null ;
        }
        // push in ll
        public static void push(int data){
            Node newnode = new Node(data) ;
            if(isempty()){
                head = newnode ;
                return ;
            }
            newnode.next = head ;
            head = newnode ;

        }
        // pop from ll
        public static int pop(){
            if(isempty()){
                return -1 ;
            }
            int top = head.data;
            head= head.next ;
            return top ;
        }
        //  peak
        public static int peek(){
            if (isempty()) {
                return -1 ;
            }
            int top = head.data;
            return top ;
        }
    }


    public static void main(String[] args) {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        //System.out.println(s);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
