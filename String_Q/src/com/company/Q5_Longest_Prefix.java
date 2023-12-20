package com.company;

public class Q5_Longest_Prefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"} ;
        //String[] str = {"dog","racecar","car"} ;
        System.out.println(common(str,0,str[0]));
    }

    static String common(String[]str,int t, String comm){
        String co = new String() ;
        if(t==str.length){
            return comm ;
        }
        String a = str[t];

        for(int i = 0 ; i<comm.length();i++){
            if(i==a.length()){
                break;
            }
            char a1 = a.charAt(i);
            char b2 = comm.charAt(i) ;
            if(a1==b2){
                co=co+a1 ;
            }
        }
        return common(str,t+1,co);
    }

}
