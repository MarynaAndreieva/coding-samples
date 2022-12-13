package com.company.sixthHomeWorkNonAccessModifiers;


public class Calculations {

    static final double PI = 3.14;

    public static int productOfNumbers(int a, int b, int c) {
        int result1 = a * b * c;
        return result1;
    }

    public static void divisionOfNumbers(int d, int i) {

        try {
            int module = d / i;
            int remainder = d % i;
            System.out.println("Module: " + module + " Remainder: " + remainder);
        } catch (Exception e) {
            System.out.println("Сan't divide by zero");
        }
    }

    public double circleSquare(double r) {
        double square = PI * (r * r);
        return square;
    }

    public static double circleLength(double r) {
        double length = 2 * PI * r;
        return length;
    }

    public final void detailsOfValues(double r) {
        System.out.println("Circle radius: " + r);
        System.out.println("Circle square: " + circleSquare(r));
        System.out.println("Circle length: " + circleLength(r));
    }
}
