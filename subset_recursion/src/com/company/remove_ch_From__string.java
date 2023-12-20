package com.company;

public class remove_ch_From__string {
    public static void main(String[] args) {
      //  skip("","abccadhgraa");
        System.out.println(skip2("abaacda")) ;
    }

    static void skip(String p, String up) {  //VIMP RECURSION USING VOID RETURN TYPE
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1)) ;
        }
    }

    //retuning String
    static String skip2(String up) {
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
          return skip2(up.substring(1));
        }else{
         return ch+ skip2(up.substring(1)) ;
        }
    }

}
