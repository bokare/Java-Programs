package com.company;

public class Q17 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        //int[] arr = {3,9,3,4,7,2,12};
        //int[] arr= {1,1};
        System.out.println(Water(arr));
        //Water(arr);
    }

    static int Water(int[] arr){
        int last = arr.length-1;
        int start = 0 ;
        int water = 0 ;
        int maxWater ;
        int minHeight;

        for (int i=start; start<last;){


            int currentleftHeight= arr[start];
            int currentrightHeight= arr[last];

            if(currentleftHeight >currentrightHeight ){
                minHeight= currentrightHeight;
                //--last;
            }
            else{
                minHeight= currentleftHeight;
                //i++;
            }

            maxWater= minHeight*(last-start);
            if(maxWater>water){
                water=maxWater;
            }

            if(currentleftHeight >currentrightHeight ){
                --last;
            }
            else{
                start++;
            }
        }
        return water ;

    }
}
