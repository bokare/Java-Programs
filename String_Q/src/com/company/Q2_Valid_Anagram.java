package com.company;

public class Q2_Valid_Anagram {
    public static void main(String[] args) {
        //String first = "anagram" ;
        //String second = "nagaram" ;
        String first = "rataa";
        String second = "taraak";
        System.out.println(isValid(first,second));
    }

    static boolean isValid(String f,String s){
        if(f.length()!=s.length()){
            return false ;
        }
        for(int i = 0 ; i<f.length();i++){
            char chf = f.charAt(i) ;
            for(int j=0 ;j<=s.length();){
                if(j==s.length()){
                    System.out.println(i);
                    return false ;
                }
                char chs = s.charAt(j) ;
                if(chf!=chs){
                    j++;
                }else{
                    s=s.substring(0,j)+s.substring(j+1) ;
                    j=0;
                    break ;
                }
            }
        }
        return true ;

    }
}
