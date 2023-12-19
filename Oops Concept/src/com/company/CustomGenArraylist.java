package com.company;
import java.util.Arrays;
// <generic> this is called generic in java

// we can add restriction here with T
// ex <T extends Number> then T can be only int, float, double but not String
public class CustomGenArraylist<T> {
    private Object[] data ;
    private static int DEFAULT_SIZE = 10 ;
    private int size = 0 ;  // also work as an index value

    public CustomGenArraylist(){
        //this.data = new T[DEFAULT_SIZE] ;
        this.data = new Object[DEFAULT_SIZE] ;
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num ;
    }
    private void resize(){
        Object[] temp = new Object [data.length*2] ;
        //copy the current item in the new Arraylist
        for(int i=0 ; i<data.length;i++){
            temp[i]=data[i] ;
        }
        data = temp ;
    }
    private boolean isFull(){
        return size == data.length ;
    }

    public T remove(){
        T removed = (T)(data[size--]);
        return removed ;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size ;
    }

    public void set(int index , T value){
        data[index]= value ;
    }
    @Override
    public String toString(){
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}' ;
    }


    public static void main(String[] args) {
        CustomGenArraylist<String> list = new CustomGenArraylist() ;
        list.add("vai");
        list.add("vaibhav");
        list.add("bokare");
//        list.add(5) ;    //       give error
        System.out.println(list);

    }
}
