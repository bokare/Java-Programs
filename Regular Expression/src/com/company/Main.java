package com.company;
import java.util.regex.* ;
public class Main {
    public static void main(String[] args) {

        Pattern p = Pattern.compile(".az.") ;
        Matcher m = p.matcher("az") ;
//        System.out.println(m.matches());    // false


//        System.out.println(Pattern.matches("[abc]","az"));     //   false  // only matches , when whole input String matches
//        System.out.println(Pattern.matches("[abc]","aa"));  //  false
//        System.out.println(Pattern.matches("[abc]","xysa"));  //  false
//        System.out.println(Pattern.matches("[abc]","a"));    //  true
//        System.out.println(Pattern.matches("[ax]*","aa"));    // true


        //      quantifiers

//        System.out.println(Pattern.matches("[abc]?",""));  //   true
//        System.out.println(Pattern.matches("[abc]?","abc"));  // false
//        System.out.println(Pattern.matches("[abc]+","aabbcc"));  // *** true
//        System.out.println(Pattern.matches("[abc]","abc"));  // *** false


        Pattern pr = Pattern.compile("[abc]jf") ;
        Matcher mr = pr.matcher("bcjfaikbjfvnoke") ;
        System.out.println(mr.find());       // true
        System.out.println(mr.start()+"  "+mr.group());
        System.out.println(mr.find(8));

        System.out.println(mr.appendTail(new StringBuilder("OK")));
        System.out.println(mr);  //  java.util.regex.Matcher[pattern=[abc]jf region=0,12 lastmatch=]
        System.out.println(mr.find());
        System.out.println(mr.end());
        System.out.println(mr.group());
        System.out.println(mr.start());
        System.out.println(mr.start());
        System.out.println(mr.groupCount());
//        System.out.println(mr.replaceAll("OK"));    // replace in input string
        System.out.println(mr.find());
        System.out.println(mr.start());
        System.out.println(mr.group());
        System.out.println(mr.find());















    }
}
