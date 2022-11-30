package com.company.fifthHomeWorkAccessModifiers;

public class CountSum {

    public static void main(String[] args) {
        CountSum sumOfFourDigits = new CountSum();
        System.out.println(sumOfFourDigits.sum(4, 6, -1, 10));
    }

    public int sum() {
        int result = 0;
        return result;
    }

    public int sum(int a) {
        int result1 = a;
        return result1;
    }

    public int sum(int b, int c) {
        int result2 = b + c;
        return result2;
    }

    public int sum(int d, int e, int f) {
        int result3 = d + e + f;
        return result3;
    }

    public int sum(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        return result4;
    }
}

