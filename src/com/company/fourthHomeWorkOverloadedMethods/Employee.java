package com.company.fourthHomeWorkOverloadedMethods;

public class Employee {

    private final int id;
    private final String sureName;
    private final int age;
    private final int salary;
    private final String department;

    public Employee(int id, String sureName, int age, int salary, String department) {
        this.id = id;
        this.sureName = sureName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void doubleSalary() {
        int doubleSalary = salary * 2;
        System.out.println("Employee id, surname, age, salary, department: " + id + " and " + sureName);
        System.out.println("Employee age, salary, department: " + age + " and " + salary + " and " + department);
        System.out.println("Employee doubled salary: " + doubleSalary);
    }
}
