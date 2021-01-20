package com.ics.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "DOB")
    private Long dob;

    @column(name = "email")
    private String email;

    @column( name= "mobile")
    private Long mobile;


    private Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return surname;
    }

    public void setName(String surname) {
        this.name = surname;
    }

    public Long getMobile() {
        return mobile;
    }

    public Long getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public void setDob(Long dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public interface Create{}

    public interface Update{}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", surnamename='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email=" + email +
                ", dob=" + dob +
                ",mobile=" + mobile +
                '}';
    }
}
