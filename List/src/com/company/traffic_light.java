package com.company;
import java.util.* ;
import java.util.Scanner;

public class traffic_light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int road =1 ;
        System.out.println("length upto last vehicle in meter for road 1 ");
        while(sc.hasNext()){        //  *****
            double length = Math.ceil(sc.nextDouble()) ;  // in meter
            double time =  (length*0.01) ;  // for 100 m = 1 minute
            System.out.println("time for road "+ road +" = "+time+ "  minute");
            road++;
            if(road==5){
                road=1 ;
            }
            System.out.println("length upto last vehicle in meter for road "+ road);
        }
    }
}
