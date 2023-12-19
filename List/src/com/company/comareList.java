package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class comareList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int T = sc.nextInt() ;

        List<List> list = new ArrayList() ;
        for(int i=0; i<T;i++){
            List li = new ArrayList(){{
                add(sc.nextInt()) ;
                add(sc.next()) ;
                add(sc.nextFloat()) ;
            }} ;
            list.add(li) ;
        }
        bubble(list);
       // System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i).get(1)) ;
        }

    }
    static void bubble(List<List> list){
        for(int i =0 ;i<list.size()-1;i++){
            for(int j=i+1 ;j>0 ;j--){
                if(needswap(list,j,j-1)){
                    Collections.swap(list,j-1,j);
                }
                else{
                    break ;
                }
            }
        }
    }
    static boolean needswap(List<List>list,int i, int j){
        String s = (String)list.get(i).get(1) ;
        if((Float)list.get(i).get(2)<(Float)list.get(j).get(2)){
            return true ;
        }
        else if((Float)list.get(i).get(2)>(Float)list.get(j).get(2)){
            return false ;
        }
        else if(s.compareTo((String)list.get(j).get(1))<0){
            return true ;
        }
        else{
            return (int)list.get(i).get(0)<(int)list.get(j).get(0) ;
        }

    }


}
