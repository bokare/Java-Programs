package com.company;

import java.util.Date;

public class date {
    public static void main(String[] args) {
        String[] firstMultipleInput = {"2","8","2004"};
       // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);
        Date dates = new Date(year-1900,month-1,day) ;
        Date dates2 = new Date() ;
        System.out.println(dates.getDay());
        ;

        System.out.println(month*2);
        //String res = findDay(month, day, year);
        System.out.println();
    }


}
