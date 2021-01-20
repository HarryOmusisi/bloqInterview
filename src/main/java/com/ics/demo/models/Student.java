package com.ics.demo.models;

import javax.persistence.Column;

public class Student {

//   @Column(name = "student_number")
    private String StudentNumber;

//   @Column(name = "first_name")
   private String firstName;

//   @Column(name = "score")
//   private int score = 0;

    public Student(String studentNumber, String firstName) {
        StudentNumber = studentNumber;
        this.firstName = firstName;
    }

//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
