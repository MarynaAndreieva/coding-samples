package com.company.thirdHomeWork;

public class StudentTest {

    private static int studentIdNumber;
    private static int studentCourse;
    private static int averageValueMath;
    private static int averageValueEconomics;
    private static int averageValueForeignLanguage;
    private int averageValueOfThreeSubjects;
    private static String studentSureName;
    private static String studentName;

    public StudentTest(int averageValueMath, int averageValueEconomics, int averageValueForeignLanguage, String studentName, String studentSureName, int studentCourse, int studentIdNumber) {
        StudentTest.averageValueMath = averageValueMath;
        StudentTest.averageValueEconomics = averageValueEconomics;
        StudentTest.averageValueForeignLanguage = averageValueForeignLanguage;
        StudentTest.studentName = studentName;
        StudentTest.studentSureName = studentSureName;
        StudentTest.studentCourse = studentCourse;
        StudentTest.studentIdNumber = studentIdNumber;
    }

    public static void main(String[] args) {

        StudentTest studentOne = new StudentTest(9, 10, 12, "Petr", "Karasov", 2, 367);
        studentOne.averageValueOfThreeSubjects = (averageValueMath + averageValueEconomics + averageValueForeignLanguage) / 3;
        System.out.println("Student's name and surname: " + studentName + " " + studentSureName);
        System.out.println("Student's course and ID Number: " + studentCourse + " and " + studentIdNumber);
        System.out.println("Student's average value of three subjects: " + studentOne.averageValueOfThreeSubjects);

        StudentTest studentTwo = new StudentTest(8, 9, 8, "Viktor", "Nevdiachnyy", 4, 645);
        studentTwo.averageValueOfThreeSubjects = (averageValueMath + averageValueEconomics + averageValueForeignLanguage) / 3;
        System.out.println("Student's name and surname: " + studentName + " " + studentSureName);
        System.out.println("Student's course and ID Number: " + studentCourse + " and " + studentIdNumber);
        System.out.println("Student's average value of three subjects: " + studentTwo.averageValueOfThreeSubjects);

        StudentTest studentThree = new StudentTest(5, 8, 11, "Sergiy", "Velykiy", 1, 23);
        studentThree.averageValueOfThreeSubjects = (averageValueMath + averageValueEconomics + averageValueForeignLanguage) / 3;
        System.out.println("Student's name and surname: " + studentName + " " + studentSureName);
        System.out.println("Student's course and ID Number: " + studentCourse + " and " + studentIdNumber);
        System.out.println("Student's average value of three subjects: " + studentThree.averageValueOfThreeSubjects);
    }
}

