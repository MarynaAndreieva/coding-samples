package com.company.seventhHomeWorkLoops;

public class Trees {

    public static void main(String[] args) {

        //Print different patterns
        //#1
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = 5 - 1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("x");
            }
            System.out.println();
        }

        //#2
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        //#3
        for (int i = 6 - 1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        //#4
        for (int i = 6 - 1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 4; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        //#5
        for (int i = 1; i < 6; i++) {
            for (int k = 6 - i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}