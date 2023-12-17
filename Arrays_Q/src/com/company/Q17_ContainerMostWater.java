package com.company;

public class Q17_ContainerMostWater {
    public static void main(String[] args) {
       int[] arr = {1,8,6,2,5,4,8,3,7};
       // int[] arr = {3,9,3,4,7,2,12};

        System.out.println(Water(arr));
        //Water(arr);

    }
    static int Water(int[] arr){
        int last = arr.length-1;
        int start = 0 ;
        int water = 0 ;
        int maxWater ;
        int minHeight;

            for (int i=start; i<last;){

               int currentleftHeight= arr[i];
               int currentrightHeight= arr[last];

               if(currentleftHeight >currentrightHeight ){
                   minHeight= currentrightHeight;
                   --last;
               }
               else{
                   minHeight= currentleftHeight;
                   i++;
               }
               //int sum= sums(arr,start,last);
               maxWater= minHeight*(last-i+1);
               if(maxWater>water){
                   water=maxWater;
               }
            }
            return water ;

    }

//    static int sums(int[] arr,int start,int end){
//        int sum = 0;
//        for(int i= start+1; i<end;i++){
//            int min= Math.min(arr[start],arr[end]);
//            if(arr[i]>min) {
//                sum = sum + arr[i]-(arr[i]-min);
//            }else{
//                sum= sum+arr[i];
//            }
//        }
//        return sum ;
//    }



}
