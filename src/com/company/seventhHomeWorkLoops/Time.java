package com.company.seventhHomeWorkLoops;

public class Time {
    public static void main(String[] args) {
        printTime(5, 6, 7);
    }

    public static void printTime(int h, int min, int s) {
        for (h = 0; h <= 6; h++) {
            for (min = 0; min <= 59; min++) {
                for (s = 0; s <= 59; s++) {
                    if (h > 1 && min == 10) {
                        break;
                    }
                    if ((s * h) > min) {
                        min++;
                    }
                }
            }
        }
    }
}

