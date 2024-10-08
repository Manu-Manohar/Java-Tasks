package com.nt.serialization;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Student implements Serializable {
    // Instance variables
    private Integer studentId;
    private String studentName;
    private Double studentFee;
    private Date dateOfAdmission;

    // Parameterized constructor
    public Student(Integer studentId, String studentName, Double studentFee, Date dateOfAdmission) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFee = studentFee;
        this.dateOfAdmission = dateOfAdmission;
    }

    // Static method to get Student object
    public static Student getStudentObject() {
        Student student = null;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the StudentId: ");
            // Use sc.nextLine() and parse the integer
            String stIdStr = sc.nextLine();
            int stId = Integer.parseInt(stIdStr); // Convert the input into an int

            System.out.println("Enter the StudentName: ");
            String name = sc.nextLine();  // Take full student name

            System.out.println("Enter the StudentFee: ");
            String feeStr = sc.nextLine();
            double fee = Double.parseDouble(feeStr);  // Convert to double

            // Create a new Student object with the current date
            student = new Student(stId, name, fee, new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }

    // Override toString() method to print Student class properties
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
                + ", dateOfAdmission=" + dateOfAdmission + "]";
    }
}
