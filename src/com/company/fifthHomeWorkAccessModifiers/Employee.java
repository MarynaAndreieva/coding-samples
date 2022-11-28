package com.company.fifthHomeWorkAccessModifiers;

public class Employee {
    int id;
    public String sureName;
    private int salary;

    Employee(int id, int salary, String sureName) {
        this.id = id;
        this.salary = salary;
        this.sureName = sureName;
    }

    public Employee(int id, String sureName) {
        this.id = id;
        this.sureName = sureName;
    }

    private Employee(int salary) {
        this.salary = salary;
    }

    private static void printResults(int salary) {
        System.out.println(salary);
    }

    static void printResults(int id, String sureName) {
        System.out.println(id + " " + sureName);
    }

    static void printResults(int id, int salary, String sureName) {
        System.out.println(id + " " + salary + " " + sureName);
    }
}
