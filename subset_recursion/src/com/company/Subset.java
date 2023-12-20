package com.company;
import java.util.ArrayList;

// ***** IMP *****
public class Subset {
    public static void main(String[] args) {
        sub_seq("", "abc");
        System.out.println(sub_seq2("", "abc"));
        System.out.println(sub_seq5("", "abc"));
//        alphabatically("","abc");
//        System.out.println(list);
    }

    static void sub_seq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub_seq(p + ch, up.substring(1));
        sub_seq(p, up.substring(1));
    }

    // *** returning arraylist without passing list in argument  // compare with permutation question
    // best way

    static ArrayList<String> sub_seq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sub_seq2(p + ch, up.substring(1));
        ArrayList<String> right = sub_seq2(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> list = new ArrayList<>();

    static void alphabatically(String p, String up) {
        if (up.isEmpty()) {
            list.add(p);
            return ;
        }
        char ch = up.charAt(0);
        alphabatically(p + ch, up.substring(1));
        alphabatically(p, up.substring(1));

    }

    static ArrayList<String> sub_seq5(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> lis = new ArrayList<>();
            lis.add(p);
            return lis;
        }

        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        list.addAll(sub_seq2(p + ch, up.substring(1)));
        list.addAll(sub_seq2(p, up.substring(1)));


        return list;
    }
}
