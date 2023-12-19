package com.company;


class B{
    static String name ;
    B(String name ){
        this.name = name ;
    }
}
//  class B is independent class , it is not depend on any object


public class static_inner_outer {

    // NESTED CLASS
     static class C{            //  it is inner class of outer class so object of outer class is needed to use it
        String name ;           //  so to make object indepedent we make it static
        C(String name ){
            this.name = name ;
        }
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }

        @Override
        public String toString() {
            return   Integer.toHexString(hashCode()) + " this is my created toString method";
        }

    }

    class D{                            //  class D is not static and it is depend on outer class (static_inner_outer)
        String name ;                   //  so to use it object of outer class is needed
        D(String name ){                //   other wise give error
            this.name = name ;
        }
        public void d_fun(){
            System.out.println("class D ");
        }

    }
    public static void main(String[] args) {

        B a = new B("vaibhav") ;
        B b = new B("bokare") ;

        //  in this case output will same for both cases as name is static and class B is separate class
        System.out.println(a.name);  // bokare
        System.out.println(b.name);  // bokare


        //  NESTED CLASS




        C c = new C("vaibhav") ;
        C d = new C("bokare") ;
        System.out.println(c.name);
        System.out.println(d.name);
        System.out.println(c);


//        D e = new D("vaibhav") ;      //  class D is not static, and it  depends on outer class (static_inner_outer)
//        D f = new D("bokare") ;        //  so to use it object of outer class is needed  otherwise, give error

        static_inner_outer.D z = new static_inner_outer().new D("vai") ;
        System.out.println(z.name);
        z.d_fun();


     }
}
