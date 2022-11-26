package com.company;

import java.util.Scanner;

public class Test {

/*
Три числа
*/

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean A = a == b;
        boolean B = b == c;
        boolean C = c == a;

        if (A == B) {
            System.out.println(a + " " + b + " " + c);
        }
        else if (B == C) {
            System.out.println(a + " " + b + " " + c);
        }
        else if (A){
            System.out.println(a + " " + b);
        } else if (B) {
            System.out.println(b + " " + c);
        } else {
            System.out.println(a + " " + c);
        }
    }
}
