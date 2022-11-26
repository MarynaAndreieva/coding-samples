package com.company.fifthHomeWorkAccessModifiers;

public class TestAccessModifiers {

    public static void main(String[] args) {
        Employee employeeId = new Employee(32);
        employeeId.printResults(employeeId.id);

        Employee employeeSureName = new Employee("Poplavskyi");
        employeeSureName.printResults(employeeSureName);

        //Object for salary variable can't be created as it has private access modifier
       // Employee employeeSalary = new Employee();
    }
}
