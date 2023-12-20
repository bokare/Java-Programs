package com.company;

public class Q15_Wildcard_matching {
    public static void main(String[] args) {
        String wild = "ge?ks*" ;
        String pattern = "geeksforgeeks" ;
        //String wild = "ge*ks" ;
        //String pattern = "geeks" ;
        System.out.println(ismatch(wild ,pattern));
    }
    static boolean ismatch(String wild ,String pattern){
        for(int i=0 ;i<wild.length();){
            for(int j=0 ;j<=wild.length();){
                if(i==wild.length() && j ==pattern.length()){
                    return  true ;
                }
                if(i==wild.length()-1 && wild.charAt(i) == '*'){
                    return true ;
                }
                if(j==pattern.length() || i==wild.length()){
                    return false ;
                }
                if(wild.charAt(i)!=pattern.charAt(j)){
                    if(wild.charAt(i)=='*'){
                        char nextchar ;
                        if(i!=wild.length()-1){
                             nextchar =wild.charAt(i+1) ;
                        }else{
                            return true ;
                        }

                        while(nextchar!= pattern.charAt(j)) {
                            j++;
                        }
                        i++;
                    }else if(wild.charAt(i)=='?'){
//                        if(i==wild.length()-1 && j==pattern.length()-1){
//                            return true ;
//                        }
                        i++;j++;
                    }else{
                        return false ;
                    }
                }else{
                    i++;j++;
                }
            }
        }
        return false ;
    }
}
