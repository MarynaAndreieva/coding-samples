package com.company.sixthHomeWorkNonAccessModifiers;


public class Calculations {

    static final double pi = 3.14;

    public static int productOfNumbers(int a, int b, int c) {
        int result1 = a * b * c;
        return result1;
    }

    public static void divisionOfNumbers(int d, int e) {
        int module = d / e;
        int remainder = d % e;
        System.out.println("Module: " + module + " Remainder: " + remainder);
    }

    public final void circleSquare(double r) {
        double square = pi * (r * r);
    }

    public static void circleLength(double r) {
        double length = 2 * pi * r;
    }

    public final void detailsOfValues (double r) {
        System.out.println("Circle radius: " + r);
        System.out.println("Circle square: " + circleSquare);
        System.out.println("Circle length: " + circleLength);
    }
}
