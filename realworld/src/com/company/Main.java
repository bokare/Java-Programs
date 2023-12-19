package com.company;
import java.util.* ;

//  even = type ; odd = val
//  user @  ||  org #
public class Main {
    public static void main(String[] args) {
//        Object[] arr = "@!vaibhav!#!@!bokare!".trim().split("!") ;
//        System.out.println(arr.length);

        Object[] data = {"LT","Apple","infosys","google","BGI","shresh","harshal","santosh","akshay","vaibhav"} ;

        Scanner sc  = new Scanner(System.in) ;
        ArrayList<Object> obj = new ArrayList<>() {{
            while(true){
                String s = sc.nextLine();
                if(s.equals("-1")){
                    break ;
                }
                else{
                    add(s);
                }
            }
        }};
        System.out.println(obj.toString());

        ArrayList<Object> userId = new ArrayList<>() ;
        ArrayList<Object> orgId = new ArrayList<>() ;
        String out = output(obj,userId,orgId) ;
        System.out.println(out);

        System.out.println("userId  = "+userId);
        System.out.println("orgId  = "+orgId);

        System.out.println();
        System.out.println(reverse(out,userId,orgId,data));

    }
    static String output(ArrayList<Object> obj,ArrayList<Object> userId,ArrayList<Object> orgId){

        String s = "" ;
        for(int i=0;i< obj.size();){
            if(obj.get(i).equals("user")){
                userId.add(obj.get(i+1)) ;
                s+="@" ;
            }
            else if(obj.get(i).equals("org")){
                orgId.add(obj.get(i+1)) ;
                s+="#" ;
            }
            else if(obj.get(i).equals("string")){
                s+=obj.get(i+1);
            }
            s+="!" ;
            i+=2 ;
        }
        return s;
    }

    static String reverse(String s,ArrayList<Object> userId ,ArrayList<Object> orgId,Object[] data){
        int j=0 ; int k=0 ;
        String[] arr = s.trim().split("!") ;
        String a = "" ;
        for(int i=0; i<arr.length;i++){
            if(arr[i].equals("@")){
                arr[i] = "{"+"userId: "+userId.get(j++)+"}" ;
              //  System.out.print(arr[i]+" ");
                a = a+"@"+data[Integer.parseInt((String) userId.get(j-1))]+" " ;

            }
            else if(arr[i].equals("#")){
                arr[i] = "{"+"orgId: "+orgId.get(k++)+"}" ;
               // System.out.print(arr[i]+" ");
                a = a+"@"+data[Integer.parseInt((String) userId.get(k-1))]+" " ;
            }
            else{
                //System.out.print(arr[i]+" ");
                a = a+arr[i]+" " ;
            }
        }
        return a ;
      }
}
