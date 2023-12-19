package com.company;
import java.util.ArrayList;

//  ******   IMP   ******
public class counting_path {
    public static void main(String[] args) {
       //System.out.println(path(3,3));
     //  path2("" ,3,3) ;
       System.out.println(path4("",3,3)) ;
    }
    static int path(int r,int c){
        if(r==1 || c==1 ){
            return 1 ;
        }
        int left = path(r-1 ,c);
        int right = path(r,c-1) ;
        return left + right ;
    }

    //pprinting path
    static void  path2( String p ,int r,int c){
        if(r==1 && c==1 ){
            System.out.println("path is -" + p);
            return ;
        }
        if(r>1){
            path2(p+'D',r-1 ,c) ;
        }
        if(c>1){
            path2(p+'R',r,c-1) ;
        }
    }

    //in form of ArrayList
    // *******  IMP  *******
    // *** one of the best way ,compare with subset , permutation question
    static ArrayList<String> path3(String p , int r, int c){
        if(r==1 && c==1 ){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return  list ;
        }
        ArrayList<String> list = new ArrayList<>() ;
        if(r>1 && c>1){
            list.addAll(path3(p+'d',r-1,c-1));  //diagonally
        }
        if(r>1){
            list.addAll(path3(p+'D',r-1 ,c)) ; //down
        }
        if(c>1){
            list.addAll(path3(p+'R',r,c-1)) ;  //right
        }
        return list ;
    }


    static ArrayList<String> path4(String p , int r, int c){
        if(r==1 && c==1 ){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return  list ;
        }
        ArrayList<String> list = new ArrayList<>() ;

        if(r>1){
            list.addAll(path4(p+'D',r-1 ,c)) ; //down
        }
        if(c>1){
            list.addAll(path4(p+'R',r,c-1)) ;  //right
        }
        return list ;
    }

    static ArrayList<String> path5(String p , int r, int c){
        if(r==1 && c==1 ){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return  list ;
        }
        ArrayList<String> list = new ArrayList<>() ;

        if(r>1){
            list.addAll(path5(p+'D',r-1 ,c)) ; //down
        }
        if(c>1){
            list.addAll(path5(p+'R',r,c-1)) ;  //right
        }
        return list ;
    }

}
