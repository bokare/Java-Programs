package com.company;

public class Queue_Using_LL {
    static class Node{
        int data ;
        Node next ;
        public Node(int data ){
            this.data = data ;
            next = null ;
        }
    }
    static class Queue {
        static Node head = null ;
        static Node tail = null ;


        public static boolean isEmpty() {
            return head==null && tail==null ;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data) ;
            //1 st element add
            if(tail==null){
              head = tail = newNode   ;
              return ;
            }
            tail.next = newNode ;
            tail = newNode ;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            Node temp = head ;
            if(head==tail){   // for single element
                tail = null ;
            }
            head = head.next ;
            return temp.data ;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);



        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
