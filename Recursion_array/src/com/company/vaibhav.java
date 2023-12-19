package com.company;

public class vaibhav {
    public static void main(String[] args) {
        int age = 50 ;
        String name = "vaibhav" ;
        boolean ismarried = true ;
        //fun1(name)
        int m = 1 ;
        for(int i=2; i<1000;i++){
            if(prime(i)){
                System.out.print(m + " = ");
                System.out.println(i);
                m++ ;
            }
        }
    }
    static void fun1(String name){
        System.out.println("hi my name is " + name);
    }

    static boolean prime(int n){
        for(int  c=2 ; c<n; c++){
            if(n%c==0){
                return false ;
            }
        }
        return true ;
    }
}
