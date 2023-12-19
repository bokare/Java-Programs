package com.company;

public class pattern {
    public static void main(String[] args) {
//        star(4,0) ;
//        star_reverse(4,0) ;
        starr(4,4) ;
        starr_re(4,4);
        System.out.println("a".repeat(1));   // a
    }
    static void star(int row, int col){
        if(row==0){
            return ;
        }
        if(row>col){
            System.out.print("*");
            star(row,col+1) ;
        }else{
            System.out.println();
            star(row-1,0);
        }

    }
    static void star_reverse(int row, int col){
        if(row==0){
            return ;
        }
        if(row>col){
            star_reverse(row,col+1) ;
            System.out.print("*");
        }else{
            star_reverse(row-1,0);
            System.out.println();
        }
    }

    static void starr(int row , int col){
        for(int i=0; i<=row; i++){
            System.out.println("*".repeat(i));
        }
    }
    static void starr_re(int row , int col){
        for(int i=row; i>=0; i--){
            System.out.println("*".repeat(i));
        }
    }

}
