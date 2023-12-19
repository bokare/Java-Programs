package com.company;

public class DLL {
    public static void main(String[] args) {
        DLL li = new DLL() ;
        li.insertFirst(45) ;
        li.insertFirst(10) ;
        li.display();
    }
    private Node head ;

     //program for insert first
    public  void insertFirst(int val ){
        Node node = new Node(val);
        node.next= head;
        node.prev= null;
        if(head!=null){
            head.prev= node ;
        }
        head = node ;
    }

    // DISPLAY
    public void display(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp= temp.next ;
        }
        System.out.println("END");

    }

    //  INSERT LAST
    public void insertLast(int val){
        Node node = new Node(val) ;
        node.next= null ;
        Node last = head ;
        if(head==null){
            node.prev = null ;
            head=node ;
            return;
        }

        while(last.next!=null){
            last=last.next ;
        }
        last.next= node;
        node.prev=last ;

    }

    // INSERT AT A PARTICULAR INDEX or after given value
    public Node find(int val){
        Node temp = head ;
        while(temp!=null){
            if(temp.val==val){
                return temp ;
            }
            temp=temp.next ;
        }
        return null;
    }

    public void insert(int after,int val){
        Node p = find(after) ;
        if(p==null){
            System.out.println("this value does not exit");
            return ;
        }
        Node node = new Node (val);
        node.next=p.next;
        p.next = node ;
        node.prev= p ;
        if(node.next!=null){
            node.next.prev=node ;
        }
    }

    private class Node{
        int val ;
        Node next ;
        Node prev ;

        public Node (int val){
            this.val=val ;
        }

        public Node (int value,Node next ,Node prev){
            this.val=value ;
            this.next = next ;
            this.prev = prev ;
        }
    }
}
