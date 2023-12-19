package com.company;

class Laptop {
    String model;
    int memory;

    //  1
    Laptop(String model, int memory){   // it will work correctly
        this.model = model ;
        this.memory = memory ;
    }

    //  IF THE PROPERTY NAME ( HERE MODEL AND MEMORY ) OF CLASS AND PARAMETER NAME IN CONSTRUCTOR OF CLASS  ARE EXACTLY SAME ( LIKE IN ABOVE EX )
    //  THEN " THIS " KEYWORDS IS MUST TO  USE OTHERWISE CHANGE WILL NOT HAPPEN ie ASSIGNING PROPERTY THROUGH CONSTRUCTOR IS NOT HAPPEN !


    // 2
//    Laptop(String givenmodel, int givenmemory){    // it will also work correctly
//        model = givenmodel ;
//        memory = givenmemory ;
//    }

    //  IF THE PROPERTY NAME ( HERE MODEL AND MEMORY ) OF CLASS AND PARAMETER NAME IN CONSTRUCTOR OF CLASS  ARE " NOT "
    //  EXACTLY SAME ( LIKE IN ABOVE EX ) THEN " THIS " KEYWORDS IS NOT COMPULSORY


    // 3
//    Laptop(String model, int memory){   // it will " not " work correctly
//        model = model ;
//        memory = memory ;
//    }

    // in above parameter name and property name are same and this keyword is not used,
    // so it will not make change in values of property of object ,  property of object will remain null or default value



    public void printInfo() {
        System.out.println(model);  //  System.out.println(this.name);
        System.out.println(memory);
    }
}
public class dot_this {
    public static void main(String[] args) {
        Laptop dell = new Laptop("dell",8) ;
        dell.printInfo();
    }
}
