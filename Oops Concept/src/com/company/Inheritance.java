package com.company;
class shape{
    int h ;
    int w ;
    int l ;
    shape(){
        System.out.println("shape default constructor is called");
    }

    shape(int h ,int w, int l ){
        System.out.println("shape constructor is called");
        this.h= h ;
        this.w = w ;
        this.l = l ;
    }
    public void area(){
        System.out.println("display area");
    }
}

class box extends shape{
    int weight  ;

    box(int h ,int w, int l,int weight){
        super(h,w,l);  // super will call the parent's constructor
        this.weight = weight ;
    }

    public box() {

    }

//    box(int weight){
//        this.weight = weight ;
//    }
    public void area(){
        System.out.print("display area of box  = ");
        System.out.println(0.5*l*h);  // **** imp ****
    }
    public void area(int l, int h){
        System.out.print("display area of box passing parameter  = ");
        System.out.println(0.5*l*h);
    }

}


class boxprice extends box{
    int price ;
    boxprice(){
        //super();
        super();
        System.out.println("boxprice constructor is called ");
        this.price = -1 ;
    }
}

public class Inheritance {
    public static void main(String[] args){
        shape shape3 = new shape() ;
        shape shape1 = new shape(1,2,3) ;
        box box1 = new box(1,2,3,4);

        // parent class can be referred to child class
        shape shape2 = new box(5,6,7,9); //  ***  IMP  ***
        //System.out.println(shape2.weight);  // but cannot access member of child ( here weight )

        // child class cannot referred to parent class
        //box box2 = new shape(1,3,2,5);  // cant possible

        boxprice boxprice1 = new boxprice();
        System.out.println(boxprice1.price);
        boxprice1.w = 5 ;
        System.out.println(boxprice1.h);
        System.out.println(boxprice1.w);
        System.out.println(box1.l+" "+box1.h);
        box1.area() ;
        box1.area(5,6) ;
        System.out.println(box1.l);
    }
}

































