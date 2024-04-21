package com.vg.restapi.entity;

// POJO
public class Student {

    private String firstName;
    private int rollNo;

    public Student(String firstName, int rollNo) {
        this.firstName = firstName;
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
