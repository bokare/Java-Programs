package com.company;

public class Q6_mobile_numeric_keypad {
    public static void main(String[] args) {
        String Input = "GEEKSFORGEEKS" ;
        String[] str = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
        };

        String ans = "4333355777733366677743333557777" ;
        String myans = sequence(Input,str) ;
        if(myans.equals(ans)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    static String sequence(String in,String[] arr){
        String output = new String() ;
        for(int i=0 ; i<in.length() ; i++){
            if(in.charAt(i)==' '){
                output = output+0;
            }else{
                int position = in.charAt(i) - 'A' ;
                output = output + arr[position] ;
            }
        }
        return output ;
    }
}
