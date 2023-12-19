package com.company;



public class Main {
    public static void main(String[] args) {
        LL list = new LL() ;
        list.insertFirst(100) ;
        list.insertFirst(55) ;
        list.insertFirst(20) ;
        list.display() ;

        list.in(2,100);
        list.display() ;
        list.in(0,20);
        list.in(1,20);
        list.display() ;
        list.duplicates();
        list.display() ;
        list.mid();

//        System.out.println();
//        list.insertLast(22) ;
//        list.insertLast(18) ;
//        list.display() ;
//        list.insertAtIndex(100,2);
//        list.display() ;
//        System.out.println(list.DeleteFirst2());
//        list.display() ;


        // *** DOUBLY LINKED LIST
       // DLL li = new DLL() ;
//        li.insertFirst(45) ;
//
//        li.insertFirst(10) ;
//        li.insertFirst(55) ;
//        li.insertLast(25);
//
//        li.display();
//        li.insert(10,18);
//        li.display();



//        CLL lists = new CLL() ;
//        lists.insertFirst(45) ;
//
//        lists.insertFirst(10) ;
//        lists.insertFirst(55) ;
//        lists.display();
//        lists.delete(10);
//        lists.display();


    }
}
