package com.company;
import java.util.* ;

//    The Java.util.List is a child interface of Collection. It is an ordered collection of objects in which duplicate values
//    can be stored. Since List preserves the insertion order, it allows positional access and insertion of elements.
//    List Interface is implemented by ArrayList, LinkedList, Vector and Stack classes.
//    List method are access as ArrayList() like add() , remove() ;

public class Main {
    public static void main(String[] args) {
       //  List is an interface, and the instances of List can be created in the following ways:

        List a = new ArrayList();
        List b = new LinkedList();
        List c = new Vector();
        List d = new Stack();


        // if created list in above way can store int , String ,or  any object
        a.add(5) ;
        a.add("m") ;
        System.out.println(a);  // [5, m]

        // Below are the following ways to initialize a list:
//        Since list is an interface, one can’t directly instantiate it. However, one can create objects of those classes
//        which have implemented this interface and instantiate them.
//        Few classes which have implemented the List interface are Stack, ArrayList, LinkedList, Vector etc.


        List<Integer> list=new ArrayList<>();
        List<Integer> llist=new LinkedList<Integer>();
        List<Integer> stacklist=new Stack<Integer>();

        list.add(2) ;
        llist.add(5) ;
        stacklist.add(8) ;
        stacklist.add(8) ;
        System.out.println(list);             //   [2]
        System.out.println(llist);           //    [5]
        System.out.println(stacklist);      // [8, 8]

        // *****  IMP   ******
        //  we can add element to list while initializing it using
        //  Double Brace Initialization can also be used to do the above work.
        List<Integer> list2=new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }};
        System.out.println(list2);  //  [1, 2, 3]

//        Creating *** "IMMUTABLE" **** List
//        Arrays.asList()
//        creates an immutable list from an array. Hence, it can be used to instantiate a list with an array.

        List<Integer> list3=Arrays.asList(1, 2, 3);
        // list3.add(2) ;               // give error at runtime
        System.out.println(list3);      //  [1, 2, 3]

        Integer[] arr = {2,5} ;   // requires class Integer cannot work if int
        List<Integer> list4 = Arrays.asList(arr) ;
        System.out.println(list4);

//       ****   Creating Mutable List   ****

        List<Integer> list5=new ArrayList<>(Arrays.asList(1, 2, 3));
        list5.add(5) ;
        System.out.println(list5);  // [1, 2, 3, 5]

        //  Using Collections class methods .addAll(list,int a,int b)

        List<Integer> list6 = new ArrayList<Integer>();
        Collections.addAll(list6, 1, 2, 3, 4);
        int[] ar = {0,20} ;
        //  Collections.addAll(list6,ar);  // give error
        System.out.println(list5);
        System.out.println(list6);  //   [1, 2, 3, 5]
        list6.addAll(list5) ;       //  [1, 2, 3, 4]
        System.out.println(list6);  // [1, 2, 3, 4, 1, 2, 3, 5]

        list.remove(0);
    }
}
