package com.company;

// QUEUE IS NOT A CLASS BUT IT IS A INTERFACE

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
    public static void main(String[] args) {
        // DEFINING QUEUE
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();


        queue.add(5);
        queue.add(25);
        System.out.println(queue.add(50));//true
        System.out.println(queue);
        queue.remove();
        System.out.println(queue.remove());


        // *** DEQUE - DOUBLY QUEUE
        // CREATING OBJECT
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(25);  // 10,25,50,55
        deque.add(50);
        deque.addFirst(10);
        deque.addLast(55);
        System.out.println(deque.remove()); //10
        System.out.println(deque.removeFirst());  //25
        System.out.println(deque.removeLast()); //

        System.out.println(queue.peek());

    }
}
