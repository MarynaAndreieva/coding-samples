package com.company.sixthHomeWorkNonAccessModifiers;

public class CalculationsTest {

    public static void main(String[] args) {
        Calculations product1 = new Calculations();
        product1.productOfNumbers(1, 3, 7);

        Calculations product2 = new Calculations();
        product2.productOfNumbers(4, 7, 8);

        Calculations division1 = new Calculations();
        division1.divisionOfNumbers(10, 4);

        Calculations division2 = new Calculations();
        division2.divisionOfNumbers(12, 4);

        Calculations calculationsOfCircle1 = new Calculations();
        calculationsOfCircle1.circleSquare(4);

        Calculations calculationsOfCircle2 = new Calculations();
        calculationsOfCircle2.detailsOfValues(7);

        Calculations calculationsOfCircle3 = new Calculations();
        calculationsOfCircle3.circleLength(7);
    }
}
