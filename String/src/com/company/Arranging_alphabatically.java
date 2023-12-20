package com.company;

import java.util.ArrayList;

public class Arranging_alphabatically {
    public static void main(String[] args) {
        String s = "vaibhav" ;
        int k = 3 ;
        subset("",s,k);
        System.out.println(list);
        bubble2(list);
        System.out.println(list);
        //System.out.println(list.get(0)+"\n  "+list.get(list.size()-1));

    }

    static ArrayList<String> list = new ArrayList<>() ;
    static void subset(String p , String up,int k){
        if(up.isEmpty()){
            if(p.length()==k){
                list.add(p) ;
            }
            //list.add(p) ;
            return ;
        }
        char ch = up.charAt(0) ;
        subset(p+ch,up.substring(1),k); ;
        subset(p,up.substring(1),k) ;

    }
    static void bubble(ArrayList<String> list){
        for(int i=0 ; i<list.size()-1 ;i++){
            for(int j=i+1 ;j>0;j--){
                if(needSwap(list.get(j-1),list.get(j))){
                    swap(list,j-1,j) ;
                }else{
                    break ;
                }
            }
        }
    }
    static boolean needSwap(String s1 , String s2){
        int index = 0 ;
        while(index<s1.length() && index<s2.length()) {
            if (s1.charAt(index) > s2.charAt(index)) {
                return true;
            } else if(s1.charAt(index) < s2.charAt(index)){
                return false ;
            }
            index++ ;
        }
        if(index==s2.length()){
            return true ;
        }
        return false ;
    }
    static void swap(ArrayList<String> list ,int i, int j){
        String temp = list.get(i) ;
        list.set(i,list.get(j)) ;
        list.set(j,temp);
    }
    static void bubble2(ArrayList<String> list){
        for(int i=0 ; i<list.size()-1 ;i++){
            for(int j=i+1 ;j>0;j--){
                if(list.get(j).compareTo(list.get(j-1))<0){
                    swap(list,j-1,j) ;
                }else{
                    break ;
                }
            }
        }
    }

}
