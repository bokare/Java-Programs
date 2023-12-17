package com.company;
import java.util.Scanner;
public class js {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String make = sc.nextLine() ;
        String model = sc.nextLine() ;
        int year = sc.nextInt() ;
        double pre   = sc.nextDouble() ;
        int age = sc.nextInt() ;
        int ticket = sc.nextInt() ;
        carInsurence c  = new carInsurence(make,model,year,pre) ;
        c.printDetails();
        System.out.println("New Premium: "+c.calculatePremium(age,ticket));
    }
}
class carInsurence {
    private String make ;
    private String model ;
    private int  year ;
    private double Premium  ;
    carInsurence(String make,String model,int  year,double Premium){
        this.make = make ;
        this.model = model ;
        this.year = year ;
        this.Premium = Premium ;
    }
    public double calculatePremium(int age , int ticket){
        if(age<25){
            this.Premium += 1000 ;
        }
        this.Premium+= ticket*500 ;
        return this.Premium ;
    }
    public void printDetails(){
        System.out.println("Make: "+this.make);
        System.out.println("Model1: "+this.model);
        System.out.println("Year: "+this.year);
        System.out.println("Premium: "+this.Premium);
    }
}

