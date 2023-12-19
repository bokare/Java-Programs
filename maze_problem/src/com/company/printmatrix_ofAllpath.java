package com.company;
import java.util.Arrays;

public class printmatrix_ofAllpath {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        } ;
        //path("",maze, 2,2,) ;
        int[][] path =new int[3][3] ;
        path2("",maze, 0,0,path,1) ;
    }


    static void  path2( String p ,boolean[][] maze,int r,int c,int[][]path,int step){
        if(r==2 && c==2 ){
            path[r][c]=step ; //for last target position [2][2]
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("path is -" + p);
            System.out.println();
            return ;
        }
        if(maze[r][c]==false){   // visited here so just return
            return ;
        }
        maze[r][c] = false ;  // once visited this path it makes false
        path[r][c]=step ;

        if(r<2){
            path2(p+'D',maze,r+1 ,c,path,step+1) ;
        }
        if(c<2){
            path2(p+'R',maze,r,c+1,path,step+1) ;
        }
        if(c>0){
            path2(p+'L',maze,r,c-1,path,step+1) ;
        }
        if(r> 0){
            path2(p+'u',maze,r-1,c,path,step+1) ;
        }

        //this line where the fun over
        // so now before the function get removed also remove the changes make by that recursion call ;
        maze[r][c] = true ;
        path[r][c]=0 ;
    }
}
