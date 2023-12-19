package com.company;
import java.util.Scanner ;

public class switch_statement {
    public static void main(String[] args) {

        // int rto_num = input ;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a rto no and get a city name");
            int input = sc.nextInt();
            if(input==0){
                break ;
            }
            switch (input) {
                case 1:
                    System.out.println("mumbai (middle)");
                    break;
                case 2:
                    System.out.println("mumbai (west)");
                   // break;
                case 3:
                    System.out.println("mumbai (east)");
                    break;
                case 4:
                    System.out.println("thane");
                    break;
                case 5:
                    System.out.println("kalyan");
                    break;
                case 6:
                    System.out.println("raigad");
                    break;
                case 7:
                    System.out.println("sidhudurgh");
                    break;
                case 8:
                    System.out.println("ratnagiri");
                    break;

                case 9:
                    System.out.println("kolhapur");
                    break;

                case 10:
                    System.out.println("sangli");
                    break;
                case 11:
                    System.out.println("satara");
                    break;

                case 12:
                    System.out.println("pune");
                    break;
                case 13:
                    System.out.println("solapur");
                    break;

                case 14:
                    System.out.println("pimpri-chichwad");
                    break;

                case 15:
                    System.out.println("nashik");
                    break;

                case 16:
                    System.out.println("ahamadpur");
                    break;

                case 17:
                    System.out.println("shrirampur");
                    break;


                case 18:
                    System.out.println("dhule");
                    break;

                case 19:
                    System.out.println("jalgaon");
                    break;
                case 20:
                    System.out.println("aurangabad");
                    break;
                default:
                    System.out.println("invalid input");

            }
        }
    }
}
