package com.ics.demo.models;

import javax.persistence.Column;

public class Appointment {

    @Column(name = "confirmed")
    private boolean confirmed;

    @Column(name = "student_id")
    private int studentId;

    @Column(name = "lecturer_id")
    private int teacherId;

    public Appointment(int studentId, int teacherId) {
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
