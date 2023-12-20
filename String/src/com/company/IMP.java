package com.company;
import java.io.UnsupportedEncodingException;
// https://www.geeksforgeeks.org/string-class-in-java/

public class IMP {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // 1
        byte[] b_arr = {71, 101, 101, 107, 115};
        String s_byte =new String(b_arr);   //Geeks
        s_byte =new String(b_arr,3,2);  //  ks

        // 2
        char [] arr = {'a','b','c','d'} ;
        String name = new String(arr,2,2) ; //  abcd
        name = String.valueOf(arr) ;    //  abcd


        // 3
        // int length(): Returns the number of characters in the String.
        "GeeksforGeeks".length();  // returns 13

        //4
        //  Char charAt(int i): Returns the character at ith index.
        "GeeksforGeeks".charAt(3); // returns  ‘k’

        //5
        // String substring (int i): Return the substring from the ith  index character to end.
        "GeeksforGeeks".substring(3); // returns “ksforGeeks”

        // 6
        // String substring (int i, int j): Returns the substring from i to j-1 index.
        "GeeksforGeeks".substring(2, 5); // returns “eks”

        // 7
       // String concat( String str): Concatenates specified string to the end of this string.
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String output = s1.concat(s2); // returns “GeeksforGeeks”

        // 8 ***
        // int indexOf (String s): Returns the index within the string of the first occurrence of the specified string.
        String s = "Learn Share Learn";
        int outputs = s.indexOf("Share"); // returns 6

        // 9
        // int indexOf (String s, int i): Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        // String s = ”Learn Share Learn”;
        // int output = s.indexOf("ea",3);// returns 13

        // 10 ****
        //Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string.
        s = "Learn Share Learn";
        int out = s.lastIndexOf("a"); // returns 14

        // 11
        // boolean equals( Object otherObj): Compares this string to the specified object.
        // Boolean out = “Geeks”.equals(“Geeks”); // returns true
        // Boolean out = “Geeks”.equals(“geeks”); // returns false

        // 12
        // boolean  equalsIgnoreCase (String anotherString): Compares string to another string, ignoring case considerations.
        // Boolean out= “Geeks”.equalsIgnoreCase(“Geeks”); // returns true
        // Boolean out = “Geeks”.equalsIgnoreCase(“geeks”); // returns true

        // *********  13 **********   IMP
        // int compareTo( String anotherString): Compares two string lexicographically.
        int outs = s1.compareTo(s2);  // where s1 and s2 are
        // strings to be compared

//        This returns difference s1-s2. If :
//        outs < 0  // s1 comes before s2
//        outs = 0  // s1 and s2 are equal.
//        outs > 0   // s1 comes after s2.


        // 14
//        int compareToIgnoreCase( String anotherString): Compares two string lexicographically, ignoring case considerations.
//        int out = s1.compareToIgnoreCase(s2);
//// where s1 and s2 are
//// strings to be compared
//
//        This returns difference s1-s2. If :
//        out < 0  // s1 comes before s2
//        out = 0   // s1 and s2 are equal.
//        out > 0   // s1 comes after s2.
//        Note- In this case, it will not consider case of a letter (it will ignore whether it is uppercase or lowercase).
//
//                String toLowerCase(): Converts all the characters in the String to lower case.
//        String word1 = “HeLLo”;
//        String word3 = word1.toLowerCase(); // returns “hello"
//        String toUpperCase(): Converts all the characters in the String to upper case.
//        String word1 = “HeLLo”;
//        String word2 = word1.toUpperCase(); // returns “HELLO”
//        String trim(): Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
//        String word1 = “ Learn
//        Share Learn “;
//        String word2 = word1.trim(); // returns “Learn Share Learn”
//        String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
//        String s1 = “feeksforfeeks“;
//        String s2 = “feeksforfeeks”.replace(‘f’ ,’g’); // returns “geeksgorgeeks”



    }
}
