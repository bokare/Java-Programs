package com.company;

import java.text.NumberFormat;  //  ****
import java.util.*;
import java.util.spi.CurrencyNameProvider;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double payment = input.nextDouble();
        //input.close();85458.254

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usPay = usFormat.format(payment);

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String indiaPay = indiaFormat.format(payment);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaPay = chinaFormat.format(payment);

        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String frPay = frFormat.format(payment);


        System.out.println("US: "+usPay);
        System.out.println("India: "+indiaPay);
        System.out.println("China: "+chinaPay);
        System.out.println("France: "+ frPay);



    }
}
