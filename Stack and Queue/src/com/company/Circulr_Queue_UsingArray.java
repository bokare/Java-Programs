package com.company;

public class Circulr_Queue_UsingArray {
    static class Queue {
        static int arr[];
        static int n;
        static int rear = -1;
        static int front = -1 ;

        Queue(int n) {
            arr = new int[n];
            this.n = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }
        public static boolean isFull() {
            return (rear+1)%n==front;
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full can't add");
                return;
            }
            //1 st element add
            if(front==-1){
                front = 0 ;
            }
            rear = (rear+1)%n ;
            arr[rear] = data ;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            if(rear==front){  // for single element present == 0
                rear=front= -1 ;
            }else{
                front = (front+1)%n ;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        QueueUsingArray.Queue q = new QueueUsingArray.Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        q.add(6);
        q.add(7);
        q.add(8);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
