package com.company.fourthHomeWorkOverloadedMethods;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(568, "Savrasov", 23, 34534, "Economic");
        employee1.doubleSalary();

        Employee employee2 = new Employee(534, "Savrasova", 21, 34000, "Economic");
        employee2.doubleSalary();
    }
}
