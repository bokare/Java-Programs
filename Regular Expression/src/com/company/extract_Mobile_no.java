package com.company;

//   extract mobile no containing in text file with normal text with it

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extract_Mobile_no {
    public static void main(String[] args) throws Exception {

        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}") ;
        PrintWriter pw = new PrintWriter("output.txt") ;
        BufferedReader br = new BufferedReader(new FileReader("in.txt")) ;
        String line = br.readLine() ;

        while(line!=null){
            Matcher m= p.matcher(line) ;
            while(m.find()){
                pw.println(m.group());
            }
            line = br.readLine() ;
        }
        pw.flush();
        br.close();
        pw.close();
    }
}
