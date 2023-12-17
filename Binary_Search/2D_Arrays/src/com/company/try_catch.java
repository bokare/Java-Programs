package com.company;

public class try_catch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,5} ;
        try{
            System.out.println(arr[5]);
        }catch(Exception exception){
            System.out.println("cant print ");
        }finally {
            System.out.println("thnkyou ! finally executed ");
        }


        try{
            System.out.println(arr[1]);
            System.exit(0);
        }catch(Exception exception){
            System.out.println("cant print ");
        }finally {
            System.out.println("thnkyou ! finally will not execute ");
        }
    }
}
