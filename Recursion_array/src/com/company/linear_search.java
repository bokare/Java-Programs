package com.company;
import java.util.ArrayList ;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {4,1, 2 ,4, 3,4, 4, 5, 6};
        System.out.println(linear(arr, 6, 0));
        System.out.println(linear_findindex(arr, 4, 0));
        System.out.println(linear_find_lastindex(arr, 4,arr.length-1));
        System.out.println(findall_index(arr,4 , 0 ,new ArrayList<>()));

        System.out.println(findall_index2(arr,4 , 0 ));
        System.out.println(li);

    }
//  return true or false ;
    static boolean linear(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || linear(arr, target, i + 1);
    }

//  return index
    static int linear_findindex(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if(arr[i] == target){
            return i ;
        }else{
            return linear_findindex(arr, target, i + 1);
        }
    }

//  return index but check from last ;
    static int linear_find_lastindex(int[] arr, int target, int i) {
        if (i == -1) {
            return -1;
        }
        if(arr[i] == target){
            return i ;
        }else{
            return linear_find_lastindex(arr, target, i - 1);
        }
    }

// returning Arraylist
    // ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findall_index(int[] arr, int target, int i , ArrayList<Integer> list) {
        if (i == arr.length) {
           return list;
        }
        if(arr[i] == target){
            list.add(i) ;
        }
        return findall_index(arr, target, i +1,list);
    }

    //returning a list without passing an arraylist in argument ;
    static ArrayList<Integer> li = new ArrayList<>();
    static ArrayList<Integer> findall_index2(int[] arr, int target, int i ) {
        if (i == arr.length) {
            return li;
        }
        if(arr[i] == target){
            li.add(i) ;
        }
        return findall_index2(arr, target, i +1);
    }

    // returning arraylist without passing in argumennt
    static ArrayList<Integer> findAll3(int[]arr , int target, int i){
        ArrayList<Integer> list = new ArrayList<>() ;
        if(i==arr.length){
            return list ;
        }
        if(arr[i]==target){
            list.add(i);
        }

        // return findAll(arr , target,i+1) ;
        ArrayList<Integer> andFromBelowCall = findAll3(arr , target,i+1) ;
        list.addAll(andFromBelowCall) ;
        return list ;
    }

}