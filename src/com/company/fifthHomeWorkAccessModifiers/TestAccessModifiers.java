package com.company.fifthHomeWorkAccessModifiers;

public class TestAccessModifiers {

    public static void main(String[] args) {
        Employee employeeIdSureName = new Employee(32, "Test sure name1");
        Employee.printResults(employeeIdSureName.id, employeeIdSureName.sureName);

        Employee employeeIdSalarySureName = new Employee(23, 8788, "Test sure name2");
        Employee.printResults(employeeIdSalarySureName.id, employeeIdSalarySureName.sureName);

        //Object for salary variable can't be created as it has private access modifier
       // Employee employeeSalary = new Employee();
    }
}
