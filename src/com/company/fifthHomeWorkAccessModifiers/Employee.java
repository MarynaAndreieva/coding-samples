package com.company.fifthHomeWorkAccessModifiers;

public class Employee {
    int id;
    public String sureName;
    private int salary;

    Employee(int id) {
        this.id = id;
    }

    public Employee(String sureName) {
        this.sureName = sureName;
    }

    private Employee(int salary) {
        this.salary = salary;
    }

    public static void printResults(String sureName) {
        System.out.println(sureName);
    }

    static void printResults(int id) {
        System.out.println(id);
    }

    private static void printResults(int salary) {
        System.out.println(salary);
    }
}
