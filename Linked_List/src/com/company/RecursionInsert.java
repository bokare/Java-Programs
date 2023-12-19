package com.company;

public class RecursionInsert {
    private Node head;
    private Node tail;
    private int size;
    public RecursionInsert() {
        this.size = 0;
    }

    public void in(int in,int v ){
        insert( in, v,1, head);
    }
    public void insert(int index, int val, int s, Node temp){

        if(index==0){
            Node node = new Node(val);
            node.next=head;
            head=node ;
            size++;
            return;
        }
        if(s==index){
            Node node = new Node(val,temp.next);
            temp.next=node ;
            size++;
            return ;
        }
        insert(index , val ,s+1,temp.next);
    }

    // *** remove duplicates
    public void duplicates(){
        Node node = head  ;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node= node.next;
            }
        }
        tail=node ;
        tail.next=null;
    }

    public static void main(String[] args) {
        LL list = new LL() ;
        RecursionInsert li = new RecursionInsert() ;
        list.insertFirst(100) ;
        list.insertFirst(20) ;
        list.insertFirst(20) ;
        list.display() ;
        list.in(2,100);
        list.display() ;
        list.in(0,20);
        li.duplicates();
        list.display() ;
    }


    class Node {
        private int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }
}

