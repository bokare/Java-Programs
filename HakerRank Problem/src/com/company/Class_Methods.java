package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

//  ******
class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }

}


public class Class_Methods {
    public static void main(String[] args){
        Student student = new Student();
        Method[] methods = student.getClass().getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method a : methods){
            methodList.add(a.getName());  // *
        }
        Collections.sort(methodList);    //  *****
        for(String name: methodList){
            System.out.println(name);
        }
    }

}