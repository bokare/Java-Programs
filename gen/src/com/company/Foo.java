package com.company;

class Foo {
 static String text = "Foo";
}

class Bar extends Foo {
  void printText() {
    System.out.println(Foo.text);
  }
}

class Test {
  public static void main(String[] args) {
    System.out.println(Bar.text);
    String name ="vvivbhvav" ;
    String sur = "bokare";
    System.out.println(name.concat(sur));
    System.out.println(name.lastIndexOf('v',2));   // check from last and only check from given index to 0 th index
    System.out.println(name.startsWith("vv"));
    System.out.println(name.contains("iv"));


  }

}