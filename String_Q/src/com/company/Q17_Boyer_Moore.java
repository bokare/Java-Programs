package com.company;
import java.util.HashSet;
// ******** IMP ********
// Rabin-Karp Algorithm
// Boyer Moore Algorithm
public class Q17_Boyer_Moore {
    public static void main(String[] args) {
        String txt = "AABAACAADAABAABA" ;
        String pat = "AABA";
//        String txt = "THIS IS A TEST TEXT" ;
//        String pat = "TEST" ;
//        int ind = txt.indexOf(pat,12);
       // System.out.println(ind);
        pattern(txt,pat);
    }
    static void pattern(String txt , String pat){
        int i=0 ;
        HashSet<Integer> set = new HashSet<>();
        while(i<txt.length()){
            int ind = txt.indexOf(pat,i++);
            if(ind!=-1){
                set.add(ind);
            }
        }
        System.out.println(set);
    }
}
