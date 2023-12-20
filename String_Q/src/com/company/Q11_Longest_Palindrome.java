package com.company;
//  ***
public class Q11_Longest_Palindrome {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor" ;
        System.out.println(palindrome(s));

    }
    static String palindrome(String str){
        int start = 0;
        int end = 0;
        for(int i=0 ;i<str.length();i++){
            int len1 = expandAroundCentre(str,i,i);
            int len2 = expandAroundCentre(str,i,i+1);
            int length = Math.max(len1,len2) ;
            if(length>end-start+1){   // end-start+1 is the length of previous palindrome
                // if current length is max then start and end of ans will changes
                start = i-(length-1)/2 ;
                end = i+length/2 ;
            }
        }
        return str.substring(start,end+1);
    }

    static int expandAroundCentre(String str, int first, int last){

        while(first>=0 && last<str.length() && str.charAt(first)==str.charAt(last)){
                first--;
                last++;
        }
        return last-first-1 ;
    }
}
