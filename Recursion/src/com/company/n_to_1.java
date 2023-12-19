package com.company;

public class n_to_1 {
    public static void main(String[] args) {
            print(1);
            //  print(0) ;
        }
        static void print (int n){
            System.out.println(n);  //1,2,3,4,5
            if(n==5){
                return ;
            }
            print(n+1) ;
            System.out.println(n); //4,3,2,1
        }
//    static void print_revese (int n){
//        System.out.println(n);  //1,2,3,4,5
//        if(n==5){
//            return ;
//        }
//        print(n+1) ;
//        //System.out.println(n); //4,3,2,1
        //  }
    }



