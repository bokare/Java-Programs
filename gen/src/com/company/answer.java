package com.company;

class Circle{
    float r ;
    public Circle(float r){
        this.r = r;
    }
    public int getArea(){
        return (int)Math.ceil(3.14159265 * this.r * this.r);
    }
}
class Rectangle{
    float w ;
    float h ;
    public Rectangle(float w,float h){
        this.w = w;
        this.h = h ;
    }
    public int getArea(){
        return (int)Math.ceil(this.w * this.h);
    }
}
class Square{
    float w ;
    public Square(float w){
        this.w = w;
    }
    public int getArea(){
        return (int)Math.ceil(this.w * this.w);
    }
}



public class answer {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0f);
        System.out.println(c1.getArea());


        Rectangle r = new Rectangle(5f,3.1f);
        System.out.println(r.getArea());
        System.out.println(brakePalindrome("bab"));
    }


    public static String brakePalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>'a'){
                for(int j='a' ; j<str.charAt(i);j++){
                    String newstr = str.substring(0,i) + (char)j + str.substring(i+1) ;
                    if(!isPalin(newstr)){
                        return newstr;
                    }
                }
            }
        }
        return "IMPOSSIBLE" ;

    }
    public static boolean isPalin(String str) {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }





}
