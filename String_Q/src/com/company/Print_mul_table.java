package com.company;

public class Print_mul_table {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        add(arr);
    }
    static void add(int...v) {
        int j = 2;
        while (j <= v.length) {

            int i = 0;
            int count = 0;
            while (i < j) {

                if (i == j - 1) {
                    count = count + v[i];
                    System.out.print(v[i] + "=" + count);
                    break;

                } else {
                    System.out.print(v[i] + "+");
                    count = count + v[i];
                    i++;
                }

            }
            System.out.println();
            j++;
        }

    }
}
