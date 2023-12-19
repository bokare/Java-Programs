package com.company;
import java.util.HashSet;
import java.util.Iterator ;

public class Main {
    public static void main(String[] args) {
        // similar to ArrayList
        // it does not allow duplicates value
        // complexity all O(1)

        // creating
        HashSet<Integer> set = new HashSet<>() ;

        // insert element
        System.out.println(set); // []
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);  // does not allow duplicates ;
        // print all element of set
        System.out.println(set);   // print all element in form like array
        // size
        System.out.println(set.size());    // 3
        //Search - contains
        set.contains(1) ;
        System.out.println(set.contains(1)) ;   // true

        // iterators
        Iterator it = set.iterator() ;
        System.out.println(it.next());  // 1
        System.out.println(it.next());  // 2
        System.out.println(it.hasNext());   // true
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }j
//        System.out.println();

        // delete
        set.remove(3) ;
        System.out.println(set);
        System.out.println(it.hasNext());   //  ******* IMP ******  true
        System.out.println(it.next());   // **** ERROR *****

    }
}
