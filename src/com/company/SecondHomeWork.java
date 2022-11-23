package com.company;

public class SecondHomeWork {
    public static void main(String[] args) {

        //Task 1: Calculate a result
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l; //2 + 1.3 - 20 = -16.7
        System.out.println(result);

        //Task 2: calculates values for b and d
        int a = 5;
        int b = 8;

        int c = a-- - --a + ++a + a++ + a; // 5 - 3 + 4 + 4 + 5 = 15
        System.out.println(c);

        int d = ++b - b++ + ++b - --b; //9 - 9 + 11 - 10 = 1
        System.out.println(d);
    }
}
