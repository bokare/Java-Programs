package com.company;

public class Path_With_Obstacle{

    public static void main(String[] args) {
        path2("",3,3) ;
    }
    static void  path2( String p ,int r,int c){
//        if(r==2 && c==2 ){
//            return ;
//        }
        if(r==1 && c==1 ){
            System.out.println("path is - " + p);
            return ;
        }


        if(r>1){
            if(r!=2||c!=2) {
                path2(p +'D', r - 1, c);
            }
            else if(r==2 && c==2){
                return ;
            }
        }
        if(c>1){
            if(r!=2||c!=2) {
                path2(p +'R', r, c - 1);
            }
            else if(r==2 && c==2){
                return ;
            }
        }

    }
}
