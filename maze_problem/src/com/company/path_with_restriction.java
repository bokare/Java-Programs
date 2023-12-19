package com.company;

public class path_with_restriction {
    public static void main(String[] args) {
        path("",3,3) ;
    }
    static void  path( String p ,int r,int c){
        if(r==1 && c==1 ){
            System.out.println("path is -" + p);
            return ;
        }
        if(r==2 && c==2){   //opstacle at 2,2
            return ;
        }
        if(r>1){
            path(p+'D',r-1 ,c) ;
        }
        if(c>1){
            path(p+'R',r,c-1) ;
        }
    }
}
