package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id =1000;
    // constructor student name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student firstName: ");
         this.firstName = in.nextLine();

        System.out.println("Enter student lastName: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - junior\n4 - senior\nEnter student gradeYear: ");
        this.gradeYear = in.nextInt();
        setStudentID();


    }
    // generate id
    private void setStudentID() {
        //Grade level + ID
        id++;
       this.studentID = gradeYear + "" + id;
    }
    // enroll in course
    public void enroll() {
        // Get inside a loop, user hits 0
      do {
          System.out.print("Enter course to enroll (Q to quit): ");
          Scanner in = new Scanner(System.in);
          String course = in.nextLine();

          if (!course.equals("Q")) {
              courses = courses + "\n    " + course;
              //we can adjust tuition cost
              tuitionBalance = tuitionBalance + costOfCourse;
          } else {
              System.out.println("BREAK!");
              break;
          }
      } while(1 != 0);

    }
    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: $ " + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        System.out.println("enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    // show status
    public String toString() {
        return "Name: " + firstName +" " + lastName +
                "\nGrade lavel: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" +
                "\nBalance: $" + tuitionBalance;

    }

}
