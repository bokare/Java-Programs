package com.company;
import java.util.*;
 // ****** VVVVIMP *******

public class Q10_Group_Anagrams{
    public static void main(String[] args) {
        //String[] strs = {"eat","tea","tan","ate","nat","bat"} ;
        String[] strs = {} ;
        System.out.println(groupAnagrams(strs));

    }
    static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();        // ****
            Arrays.sort(ca);                    // all anagrams after sorting their char will be same
            String key = String.valueOf(ca);    //  ****    // so if it already present in hashset then
            if (!ans.containsKey(key)){         // just add the value of string in that key
                ans.put(key, new ArrayList());  // here value of key is array ie ans.get(key) is array
            }                                   // so add string to array as .add(string) ;
            ans.get(key).add(s);
        }
        return  new ArrayList(ans.values());
    }
}
