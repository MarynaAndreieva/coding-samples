package com.company.thirdHomeWork;

public class StudentTest {

    public static void main(String[] args) {
        Student studentOne = new Student(9, 10, 12, "Petr", "Karasov", 2, 367);
        studentOne.averageValueOfThreeSubjects(studentOne);

        Student studentTwo = new Student(8, 9, 8, "Viktor", "Nevdiachnyy", 4, 645);
        studentTwo.averageValueOfThreeSubjects(studentTwo);

        Student studentThree = new Student(5, 8, 11, "Sergiy", "Velykiy", 1, 23);
        studentThree.averageValueOfThreeSubjects(studentThree);

        Student student1 = new Student("Petia", "Piatochkin", 2, 34);

        Student student2 = new Student("Petia", "Piatochkin", 2, 34);

        compareStudents(studentOne, studentTwo);
        compareStudentsAttributes(student1, student2);

        System.out.println(student1.equals(student2));
    }

    public static void compareStudents(Student studentA, Student studentB) {
        if (studentA.getStudentCourse() == studentB.getStudentCourse()) {
            System.out.println("These students are on the same course");
        } else {
            System.out.println("These students are on different courses");
        }
    }

    public static void compareStudentsAttributes(Student studentC, Student studentD) {
        if (studentC.getStudentName() == studentD.getStudentName()) {
            if (studentC.getStudentSureName() == studentD.getStudentSureName()) {
                if (studentC.getStudentCourse() == studentD.getStudentCourse()) {
                    if (studentC.getStudentIdNumber() == studentD.getStudentIdNumber()) {
                        System.out.println("Students attributes are equal");
                    }
                }
            }
        } else {
            System.out.println("Students attributes are different");
        }
    }
}
