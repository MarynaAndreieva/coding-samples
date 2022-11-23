package com.company.thirdHomeWork;

public class Student {

    private final int studentIdNumber;
    private final int studentCourse;
    private final int averageValueMath;
    private final int averageValueEconomics;
    private final int averageValueForeignLanguage;
    private final String studentSureName;
    private final String studentName;

    public Student(int averageValueMath, int averageValueEconomics, int averageValueForeignLanguage, String studentName, String studentSureName, int studentCourse, int studentIdNumber) {
        this.averageValueMath = averageValueMath;
        this.averageValueEconomics = averageValueEconomics;
        this.averageValueForeignLanguage = averageValueForeignLanguage;
        this.studentName = studentName;
        this.studentSureName = studentSureName;
        this.studentCourse = studentCourse;
        this.studentIdNumber = studentIdNumber;
    }

    public void averageValueOfThreeSubjects(Student student) {
        int averageValueOfThreeSubjects = (student.averageValueMath + student.averageValueEconomics + student.averageValueForeignLanguage) / 3;
        System.out.println("Student's name and surname: " + studentName + " " + studentSureName);
        System.out.println("Student's course and ID Number: " + studentCourse + " and " + studentIdNumber);
        System.out.println("Student's average value of three subjects: " + averageValueOfThreeSubjects);
    }
}

