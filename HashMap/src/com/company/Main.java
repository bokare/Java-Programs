package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static <set> void main(String[] args) {
	// HashMap are used to store key = value pair
    //   key is always unique

        // create hashmap
        HashMap<String,Integer> map = new HashMap<>() ;

        // insetion
        map.put("india" , 120) ;
        map.put("us",30);
        map.put("china",150);

        //print hashmap
       // System.out.println(map);      //{china=150, india=120, us=30}
        map.put("us",50);    // will update value
        System.out.println(map);    // {china=150, india=120, us=50}

        // Search
        System.out.println(map.containsKey("us"));    // true
        //System.out.println(map.containsKey("paris"));    // false

        // delete
        map.remove("china") ;

        // get value
        // if key exist
        System.out.println(map.get("us"));  // 50

        // if key doesn't exist
        System.out.println(map.get("paris"));   // null

        //  ITERATIONS
        // defining/creating iterators
        for(Map.Entry<String,Integer> all : map.entrySet()){
            System.out.print(all.getKey() + " -> ");
            System.out.print(all.getValue());
            System.out.println();
        }

        // another method of print through key set
        Set<String> allkeys = map.keySet() ; // allkeys is a set and all keys are stored in it
        for(String key : allkeys){
            System.out.println(key + " = " + map.get(key));

        }
        System.out.println(map.values());
    }
}
