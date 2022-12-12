package com.company.sixthHomeWorkNonAccessModifiers;


public class Calculations {

    static final double PI = 3.14;

    public static int productOfNumbers(int a, int b, int c) {
        int result1 = a * b * c;
        return result1;
    }

    public static void divisionOfNumbers(int d, int i) {
        int module = d / i;
        try {
            int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(i[0]);
        } catch (Exception e) {
            System.out.println("Сan't divide by zero");
        }
        int remainder = d % i;
        System.out.println("Module: " + module + " Remainder: " + remainder);
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
