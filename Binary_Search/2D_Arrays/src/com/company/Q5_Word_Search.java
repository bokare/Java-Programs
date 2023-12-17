package com.company;

public class Q5_Word_Search {
//    public static void main(String[] args) {
//        String[][] board = {{"A","B","C","E"},
//                            {"S","F","C","S"},
//                            {"A","D","E","E"}};
//        String word = "ABCCED" ;
//    }
//    static boolean isFound(String[][] arr,String word){
//        //for(int k=0 ; k<word.length();k++){
//            //char ch = word.charAt(k) ;
//
//            int l,m ;
//            int k=0;
//            for (int i = 0; i < arr.length;i++) {
//                for (int j = 0; j < arr[i].length;j++) {
//                        //l=i ;m=j ;
//                        if(searchAround(i,j,arr,word,0)) {
//                            return true;
//                        }
//                }
//            }
//        //}
//    }
//    static boolean searchAround(int i,int j,String[][] arr,String word , int k){
//        if(k==word.length()){
//            return true ;
//        }
//        if(newarr[i][j+1]!=false){
//            if(arr[i][j+1].equals(word.charAt(k))){
//                return searchAround(i,j+1,arr,word,k+1);
//            }
//        }else if(newarr[i+1][j]!=false){
//            if(arr[i+1][j].equals(word.charAt(k))){
//                return searchAround(i+1,j,arr,word,k+1);
//            }
//        }else if(newarr[i][j-1]!=false){
//            if(arr[i][j-1].equals(word.charAt(k))){
//                return searchAround(i,j-1,arr,word,k+1);
//            }
//        }else if(newarr[i-1][j]!=false){
//            if(arr[i-1][j].equals(word.charAt(k))){
//                return searchAround(i-1,j,arr,word,k+1);
//            }
//        }
//        return false ;
//    }
}
