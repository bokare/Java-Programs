package com.company;

public class remove_substring {
    public static void main(String[] args) {
        System.out.println(skipapple("fjaapplehj"));
        System.out.println(skipapp("fjaapplehj"));
    }

    static String skipapple(String up) {
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }else{
            return up.charAt(0)+ skipapple(up.substring(1)) ;
        }
    }

    //skip only app if apple is present
    static String skipapp(String up) {
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipapp(up.substring(3));
        }else{
            return up.charAt(0)+ skipapp(up.substring(1)) ;
        }
    }

}
