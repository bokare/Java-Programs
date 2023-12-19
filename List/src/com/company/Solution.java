package com.company;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in) ;
    int N = sc.nextInt() ;
    int M = sc.nextInt() ;
    int[] arr = new int[N] ;
    //sc.nextLine() ;
    for(int i=0 ;i<N;i++){
        arr[i] = sc.nextInt() ;
    }
    //System.out.println(Arrays.toString(arr)) ;
    //System.out.println(answer(arr,M)) ;
        answer2(arr,3);
    
    }
    static int answer(int[] arr, int m){
        int max = 0 ;
        for(int i=0;i<=arr.length-m;i++){
            HashSet<Integer> set = new HashSet<>() ;
            for(int j=i;j<i+m;j++){
                set.add(arr[j]) ;
            }
            if(set.size()>max){
                max = set.size() ;
            }
        }
        return max ;
    }
    static void answer2(int[] arr,int m){
        Deque<Integer> queue = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>() ;
        int max = 0;
        for(int i=0 ;i<arr.length;i++){
            queue.add(arr[i]);
            set.add(arr[i]) ;
            if(i<m-1){
                continue ;
            }
            if(set.size()>max){
                max = set.size() ;
            }
            int temp  = queue.pop() ;
            if(!queue.contains(temp)){
                set.remove(temp) ;
            }
        }
        System.out.println(max+"    ");
    }

}