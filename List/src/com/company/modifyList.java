package com.company;
import java.util.* ;

public class modifyList {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in) ;
        int N = sc.nextInt() ;
        int[] li = new int[N] ;
        for(int i=0;i<N;i++){
            li[i] = sc.nextInt() ;
        }
        //String[] lists = sc.nextLine().trim().split(" ") ;
        List<Integer>L = new ArrayList<>() ;
        //System.out.println(L);;
        int Q = sc.nextInt() ;
        for(int i=0 ; i<Q; i++){
            if(sc.next()=="Insert"){
                int x  = sc.nextInt() ;
                int y = sc.nextInt() ;
                L.add(x,y); ;
            }
            else if(sc.next()=="Delete"){
                int x = sc.nextInt() ;
            }
        }
        for(int a: L){
            System.out.println(a);
        }
    }
}
