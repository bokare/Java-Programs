package com.company;
import java.util.Arrays ;

//when we don't know the size of arrays ;
public class variable_argument {
    public static void main(String[] args) {
        multiple(2, 3, 5, 6, 5, 6);//we can add any no of integeger in this arrays ;
        fun(12, 3, "vaibhav", "bokare", "a", "b");
    }

    static void multiple(int... v) {
        System.out.println(Arrays.toString(v));
        v[0] = 100;
        v[5] = 50;
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a, int b, String... s) {
        System.out.println(Arrays.toString(s));
        System.out.println(a + " " + b);
        System.out.println(s[0]);
        System.out.println(s[3]);
    }
}
