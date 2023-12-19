package com.company;
// lambda function is used when body of function is of one line

import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        for(int i=0; i<5;i++){
            list.add(i+1) ;
        }
        twice(list) ;
        //  using Lambda Function
        list.forEach(
                (element) -> System.out.println(element*2)
        );



    }

    // general function
    static void twice(ArrayList<Integer> nums){
        for(int i =0 ;i<nums.size();i++){
            System.out.println(nums.get(i)*2);
        }
    }
}
