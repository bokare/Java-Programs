package com.company;
import java.util.Arrays;

public class StringBuilderSb {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
            // System.out.print(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString());
        String name = "vaibhav";
        System.out.println(name.toCharArray());  // vaibhav
        System.out.println(Arrays.toString(name.toCharArray()));  // [v, a, i, b, h, a, v]
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        System.out.println(("  va i  ").strip());
        System.out.println(("  va i  ").trim());
        System.out.println(("  vai  ").indexOf('v'));
        System.out.println(("  vai  ").trim().indexOf('a'));
        System.out.println(("  vai  ").strip().indexOf('a'));

    }
}