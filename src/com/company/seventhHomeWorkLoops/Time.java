package com.company.seventhHomeWorkLoops;

public class Time {
    public static void main(String[] args) {
        printTime(3, 6, 7);
    }

    public static void printTime(int h, int min, int s) {
        for (h = 0; h < 6; h++) {
            for (min = 0; min <= 59; min++) {
                for (s = 0; s <= 59; s++) {
                    System.out.println("Time " + h + ":" + min + ":" + s);
                    if (h > 1 && min == 10) { // Unclear why do we need this if?
                        System.out.println("Range is not supported");
                        break;
                    }
                }
            }
        }
        if ((s * h) > min) {
            min++;
            System.out.println("Check if min is growing");
        }
    }
}

