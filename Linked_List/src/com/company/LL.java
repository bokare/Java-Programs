package com.company;

public class LL {
    private Node head ;
    private Node tail ;
    private int size ;
    public LL(){
        this.size = 0 ;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head ;
        head = node ;

        if(tail==null){
            tail=head ;
        }
        size+= 1 ;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return ;
        }
        Node node = new Node(val);
        tail.next = node ;
        tail = node ;
        size+= 1 ;
    }

    public void insertAtIndex(int val,int index){
        if(index==0){
            insertFirst(val);
            return ;
        }
        if(index==size){
            insertLast(val);
            return ;
        }

        Node temp = head ;
        for(int i =1 ;i<index ;i++){
            temp = temp.next ;  //here temp = that index to which next we have to add node that ie position before given index
        }
        Node node = new Node(val,temp.next); //creating new node liking to its next node ie at index position
        temp.next= node ;
        size++ ;
    }

    public void insertAtIndex2(int val,int index){
        if(index==0){
            insertFirst(val);
            return ;
        }
        if(index==size){
            insertLast(val);
            return ;
        }

        Node temp = head ;
        for(int i =1 ;i<index ;i++){
            temp = temp.next ;  //here temp = that index to which next we have to add node that ie position before given index
        }
        Node node = new Node(val); //creating new node
        node.next = temp.next;  //liking to its next node ie at index position
        temp.next= node ;
        size++ ;
    }



    public void in(int in,int v ){      // index ,value 0
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



    public int DeleteFirst(){   // *** return type int
        int val = head.value ;
        head= head.next ;
        if(head==null){  // if original list having only one node , now its head will null so tail will null
            tail=null;
        }
        size--;
        return val ;
    }
    public int DeleteFirst2(){   // *** return type int
        int val = head.value ;
        head= head.next ;
        size--;
        return val ;
    }

    // remove duplicates
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

    // merge two sorted ll

    public static LL merrge (LL first, LL second){
        Node f = first.head ;
        Node s = second.head ;
        LL ans = new LL() ;

        while(f!=null && s!= null){
            if(f.value< s.value){
                ans.insertLast(f.value);
                f = f.next;
            } else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f= f.next ;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s= s.next ;
        }
        return ans ;
    }

    public static void main(String[] args) {
        LL first = new LL();  // first ll
        LL second = new LL();  // second ll

        first.insertLast(1);
        first.insertLast(4);
        first.insertLast(7);
        first.display();

        second.insertLast(2);
        second.insertLast(5);
        second.insertLast(8);
        second.insertLast(9);
        second.display();

        LL ans = LL.merrge(first,second);
        ans.display();
    }

    // code for is cycle is present or not
    // if given ll is cyclic then fast and slow will meet at some point

    public boolean iscyclic(Node head){
        Node fast = head ;
        Node slow = head ;
        while(fast!=null && slow!= null){
            fast= fast.next.next ;   //fast= 2x
            slow = slow.next ;       // slow = x
            if(fast==slow){
                return true;
            }
        }
        return false ;
    }

    //  calculate the length of cycle ;
    public int  lengthOfcyclic(Node head){
        Node fast = head ;
        Node slow = head ;
        while(fast!=null && slow!= slow){
            fast= fast.next.next ;   //fast= 2x
            slow = slow.next ;       // slow = x
            if(fast==slow){
                // calcuale the lenfth now
                Node temp = slow ;
                int length = 0;
                do{
                    temp = temp.next ;
                    length ++ ;
                }while(temp!=slow);

                return length;
            }
        }
        return 0 ;

    }

    // code for to find node at which cycle start
    // step 1 - find length of cycle
    // step 2 - move second pointer length times ahead
    // step3 - now move first pointer (start from head ) and second simu. they will meet at where cycle start
    public Node cycleStartAt(Node head){
        Node fast = head ;
        Node slow = head ;
        int length = 0;
        while(fast!=null && slow!= slow){
            fast= fast.next.next ;   //fast= 2x
            slow = slow.next ;       // slow = x

            if(fast==slow){
                // calcuale the lenfth now
                Node temp = slow ;
                do{
                    temp = temp.next ;
                    length ++ ;
                }while(temp!=slow);
            }
        }

        if(length==0){
            return null;
        }

        // find start node
        Node first = head ;
        Node second = head ;

        while(length>0){
            second = second.next;
            length--;
        }
        // now keep move both and they met  where cycle start
        while(first!=second){
            first = first.next ;
            second = second.next ;
        }
        return first ;

    }

    // ** given no is happy or not
    public boolean isHappy(int n){
        int slow = n ;
        int fast = n ;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        }while(slow!=fast);
        if(slow==1){
            return true ;
        }
        return false ;
    }

    private int findSquare(int number) {
        int ans = 0 ;
        while(number>0){
            int rem = number%10;
            ans = ans + (rem*rem);
            number = number/10;
        }
        return ans ;
    }

    public void mid(){
        Node mid = middle(head) ;
        System.out.println(mid.value);
    }

    //  middle of ll
    public Node middle(Node head){
        Node f = head ;
        Node s = head ;

        while(f!=null && f.next!= null){
            s=s.next ;
            f= f.next.next ;
        }
        return s ;
    }

    //

    // *** display the ll ***
    public void display(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

//  this block of code should always below the method
    class Node{
        private int value ;
        Node next ;

        public Node(int value) {
            this.value= value ;
        }

        public Node(int givenvalue,Node givennext) {
            this.value= givenvalue ;
            this.next= givennext ;
        }
    }

}
