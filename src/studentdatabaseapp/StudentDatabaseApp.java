package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        //Enter how many students we want to add
        System.out.println("Enter number of students you want to add: ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];
        // create a number of new students
        for (int i=0; i<numOfStudent; i++ ) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for (int i=0; i<numOfStudent; i++ ) {
            System.out.println(students[i].toString());
        }
    }
}
