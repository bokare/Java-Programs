package com.company;

public class CLL {
    private Node head ;
    private Node tail;

    public CLL(){
       this.head=null;
       this.tail=null;
    }

    // INSERT FIRST
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head=node ;
            tail=node ;
            return ;
        }
        tail.next=node;
        node.next=head;
        head=node;

    }

    // DISPLAY
    public void display(){
        Node temp = head ;
        if(head!=null){
            do{
                System.out.print(temp.val+" -> ");
                temp= temp.next;
            }while(temp!=head);
        }
        System.out.println("HEAD");
    }

    // DELETION
    public void delete(int val){
        Node temp = head ;
        if(temp==null){
            return;
        }

        if(temp.val==val){
            head=temp.next ;
            tail.next=head ;
            return ;
        }
        do{
            Node n= temp.next;
            if(n.val==val){
                temp.next=n.next;
                break ;
            }
            temp=temp.next;
        }while(temp!=head);
    }


    private class Node{
        int val ;
        Node next ;

        public Node(int val ){
            this.val = val;
        }
    }
}
