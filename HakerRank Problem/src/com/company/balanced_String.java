package com.company;
import java.util.*;
import java.util.Stack;

public class balanced_String {

        public static void main(String []argh) {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input=sc.next();
                //Complete the code
                boolean printed = false ;
                Stack<Character> stack = new Stack<>() ;
                for(int i=0;i<input.length();i++){
                    char c = input.charAt(i);
                    if(c=='['|| c=='('|| c=='{'){
                        stack.push(c);
                    }
                    else if(c==']'|| c=='}'){
                        if(stack.isEmpty()){
                            System.out.println("false");
                            printed = true ;
                            break ;
                        }
                        if(c!=stack.pop()+2){
                            System.out.println("false");
                            printed = true ;
                            break ;
                        }
                    }
                    else if(c==')'){
                        if(stack.isEmpty()){
                            System.out.println("false");
                            printed = true ;
                            break ;
                        }
                        if(c!=stack.pop()+1){
                            System.out.println("false");
                            printed = true ;
                            break ;
                        }
                    }
                }
                if(!printed){
                    if(stack.isEmpty()){
                        System.out.println("true");
                    }else{
                        System.out.println("false");
                    }
                }

            }

        }
}

