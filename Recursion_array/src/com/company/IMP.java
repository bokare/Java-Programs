
// ******* VVVVIMP ********

package com.company;
import java.util.ArrayList;

//  returning list without passing in argument
//  returning target element
public class IMP {
    public static void main(String[] args) {
        int[] arr ={4,2,3,4,5,4,2,4} ;
        System.out.println(findAll(arr ,4 ,0));
        System.out.println(findAll2(arr,4,0,new ArrayList<>()));
    }
    static ArrayList<Integer> findAll(int[]arr , int target, int i){
        ArrayList<Integer> list = new ArrayList<>() ;
        if(i==arr.length){
            return list ;
        }
        if(arr[i]==target){
            list.add(i);
        }

       // return findAll(arr , target,i+1) ;
        ArrayList<Integer> andFromBelowCall = findAll(arr , target,i+1) ;
        list.addAll(andFromBelowCall) ;
        return list ;
    }

    //  RETURNING ARRAYLIST PASSING IN ARGUMENT

    static ArrayList<Integer> findAll2(int[]arr , int target, int i ,ArrayList<Integer>list){
        if(i==arr.length){
            return list ;
        }
        if(arr[i]==target){
            list.add(i);
        }

        return findAll2(arr , target,i+1,list) ;

    }
}
