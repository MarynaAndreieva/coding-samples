package com.company.fourthHomeWorkOverloadedMethods;

public class Employee {

    private final int salary;

    public Employee(int id, String sureName, int age, int salary, String department) {
        this.salary = salary;
    }

    public void doubleSalary() {
        int doubleSalary = salary * 2;
        System.out.println(doubleSalary);
    }
}
