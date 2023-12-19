package com.company;
//  ***  IMP  ***
public class BackTracking {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        } ;
        path("",maze, 2,2) ;
        //path2("",maze, 2,2) ;
    }
    static void  path( String p ,boolean[][] maze,int r,int c){
        if(r==0 && c==0 ){
            System.out.println("path is -" + p);
            return ;
        }
        if(maze[r][c]==false){   // visited here so just return
            return ;
        }
        maze[r][c] = false ;  // once visited this path it makes false

        if(r>0){
            path(p+'D',maze,r-1 ,c) ;
        }
        if(c>0){
            path(p+'R',maze,r,c-1) ;
        }
        if(c<maze[0].length-1){
            path(p+'L',maze,r,c+1) ;
        }
        if(r< maze.length-1){
            path(p+'u',maze,r+1,c) ;
        }

        //this line where the fun over
        // so now before the function get removed also remove the changes make by that recursion call ;
        maze[r][c] = true ;   // backtracking
    }

    static void  path2( String p ,boolean[][] maze,int r,int c){
        if(r==0 && c==0 ){
            System.out.println("path is -" + p);
            return ;
        }
        if(maze[r][c]==false){   // visited here so just return
            return ;
        }
        maze[r][c] = false ;  // once visited this path it makes false

        if(r>0){
            path2(p+'D',maze,r-1 ,c) ;
        }
        if(c>0){
            path2(p+'R',maze,r,c-1) ;
        }
        if(c<2){
            path2(p+'L',maze,r,c+1) ;
        }
        if(r< 2){
            path2(p+'u',maze,r+1,c) ;
        }

        //this line where the fun over
        // so now before the function get removed also remove the changes make by that recursion call ;
        maze[r][c] = true ;
    }
}
