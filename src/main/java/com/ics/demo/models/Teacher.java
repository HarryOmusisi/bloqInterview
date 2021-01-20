package com.ics.demo.models;

import javax.persistence.Column;

public class Teacher {

    @Column(name = "id")
    private Long teacherId;

    @Column(name = "name")
    private String name;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
