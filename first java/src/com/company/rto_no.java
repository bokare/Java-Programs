package com.company;
import java.util.Scanner ;

public class rto_no {

    public static void main(String[] args) {
        String[] arr = {"mumbai(middle)", "mumbai(west)", "mumbai(east)", "thane", "kalyan", "raigadh", "sundhudurda", "ratnagiri",
                "kolhapur", "sangli", "satara", "pune", "solapur", "pimpri-chichwad", "nashik", "ahmadnagar", "shrirampur",
                "dhule", "jalgaon", "aurangabad", "jalna", "parbhani", "beed", "latur", "usmanabad", "nanded", "amaravati", "bhuldhana", "yatmal", "akola",
                "nagpur", "verdha", "gadchiroli", "chandrapur", "gondia", "bhandara", "vashim", "hingoli", "nandurba", "nagpur (gramin)", "malegaon",
                "baramati", "vashi", "amambajogai", "akluj", "panvel", "malvani", "vasai-virar", "nagpur(east)", "karad", "nashik(gramin)"};
        System.out.println("to stop enter zero !");
        rto(arr);
    }


    static void rto(String[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a rto no and know which city belong from that no : ");
        int rto = sc.nextInt();
        if(rto==0){
            return ;
        }

        if (rto < 52) {
            System.out.print("MH-" + rto + " = ");
            System.out.println(arr[rto - 1]);
        } else {
            System.out.println("invalid input , 26" +
                    "please try a number between 0 to 52");
        }

        rto(arr);

        //REMAINING WORK TO DO
        //HOW TO STOP THE LOOP OR END THE LOOP1

    }
}