package com.company;

class bank {
    int Account;
    int cust;

    bank() {
        System.out.println("bank");
    }

}


class hdfc extends bank{
    int bal ;

    hdfc(){
        System.out.println("hdfc");
    }

}

public class constructor_chaning {


    public static void main(String[] args) {
        hdfc a = new hdfc();
    }

}





