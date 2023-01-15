package com.company.thirdHomeWork;

public class Student {
    public int getStudentCourse() {
        return studentCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSureName() {
        return studentSureName;
    }

    public int getStudentIdNumber() {
        return studentIdNumber;
    }

    private int studentIdNumber;
    private int studentCourse;
    public static int averageValueMath;
    private int averageValueEconomics;
    private int averageValueForeignLanguage;
    private String studentSureName;
    private String studentName;

    public Student(int averageValueMath, int averageValueEconomics, int averageValueForeignLanguage, String studentName, String studentSureName, int studentCourse, int studentIdNumber) {
        this.averageValueMath = averageValueMath;
        this.averageValueEconomics = averageValueEconomics;
        this.averageValueForeignLanguage = averageValueForeignLanguage;
        this.studentName = studentName;
        this.studentSureName = studentSureName;
        this.studentCourse = studentCourse;
        this.studentIdNumber = studentIdNumber;
    }

    public Student(String studentName, String studentSureName, int studentCourse, int studentIdNumber) {
        this.studentName = studentName;
        this.studentSureName = studentSureName;
        this.studentCourse = studentCourse;
        this.studentIdNumber = studentIdNumber;
    }

    public Student() {
    }

    public void averageValueOfThreeSubjects(Student student) {
        int averageValueOfThreeSubjects = (student.averageValueMath + student.averageValueEconomics + student.averageValueForeignLanguage) / 3;
        System.out.println("Student's name and surname: " + studentName + " and " + studentSureName);
        System.out.println("Student's course and ID Number: " + studentCourse + " and " + studentIdNumber);
        System.out.println("Student's average value of three subjects: " + averageValueOfThreeSubjects);
    }
}

