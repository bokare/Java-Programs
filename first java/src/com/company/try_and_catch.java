package com.company;
import java.util.Arrays ;

public class try_and_catch {
    public static void main(String[] args) {
        int[] marks = {1,22,13,4,56};
        try{
            System.out.println(marks[6]);  // try will not execute so it will not exit
            System.exit(0);
        }catch(Exception exception){
            System.out.println(marks[1]);
        }finally {
            System.out.println("thankyou ! ");
        }
//        System.out.println(marks[3]);
//        Arrays.sort(marks);
//        System.out.println(marks[3]);

        try{
            System.out.println(marks[1]);  // try execute so it will exit no execute finally block
            System.exit(0);
        }catch(Exception exception){            // catch and finally not EXECUTED
            System.out.println(marks[0]);
        }finally {
            System.out.println("thankyou ! ");
        }

    }
}
