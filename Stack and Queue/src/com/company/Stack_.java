package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stack_ {

    public static void main(String[] args) {
	// *** DEFINING THE STACK ***
        Stack<Integer> stackex = new Stack<>();
        System.out.println(stackex.push(25));
        stackex.push(1);
        stackex.push(2);
        stackex.push(3);
        stackex.push(4);
        System.out.println(stackex.push(50));
        System.out.println(stackex.pop());
        System.out.println(stackex.pop());
        stackex.pop();
        System.out.println(stackex.pop());
        System.out.println(stackex);

        Stack<String> s = new Stack<>();
        s.push("vaibhav")  ;
        s.push("bokare") ;
        s.push("patil") ;
        System.out.println(s);  //  [vaibhav, bokare, patil]
        System.out.println(s.isEmpty());
        System.out.println(s.contains("vaibhav"));  //  *****
        System.out.println(s.search("vaibhav"));   //  ********   IMP  ********
        s.add(0,"add") ;

        s.add(1,"s");
        System.out.println(s);
        System.out.println(s.search("s"));  // 4

        // s.clear();    //  *************
        System.out.println(s);

        // *******
        String[] arr = {"vaibhav", "bhaiya"} ;
        s.addAll(List.of(arr)) ;
        System.out.println(s);
        System.out.println(s.containsAll(List.of(arr)));

        //  element of set into arr
        String[] ar = new String[s.size()] ;
        s.copyInto(ar );
        System.out.println(Arrays.toString(ar));

        System.out.println(s);
        System.out.println(s.elementAt(0)); //  return the bottom element
        System.out.println(s.firstElement());
        System.out.println(s.get(0));  // same as elementAt() ;
        System.out.println(s.indexOf("s"));  // 1
        System.out.println(s.search("s")); //  5

       // String[] myarr = (String[]) (s.toArray() );

        String str = s.toString() ;
        String d =String.valueOf(s) ;
        System.out.println(str);    // [add, s, vaibhav, bokare, patil, vaibhav, bhaiya]
        System.out.println(d);      // [add, s, vaibhav, bokare, patil, vaibhav, bhaiya]
        System.out.println(d.charAt(0));  //[

    }
}
