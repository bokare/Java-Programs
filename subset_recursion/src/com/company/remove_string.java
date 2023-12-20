package com.company;

public class remove_string {
    public static void main(String[] args) {
        System.out.println(skip_apple("badappleavdn")) ;
        System.out.println(skip_app("cappbhd"));
        System.out.println(skip_app("vappledekj"));
    }
    static String skip_apple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skip_apple(up.substring(5));
        }else{
            return up.charAt(0) + skip_apple(up.substring(1)) ;
        }

    }
    //skip app only if apple is not present in string
    static String skip_app(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skip_app(up.substring(3));
        }else{
            return up.charAt(0) + skip_app(up.substring(1)) ;
        }

    }
}
