package com.vg.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName, lastName, country, favLang;
    private List<String> favOS;

    public Student() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }

    public List<String> getFavOS() {
        return favOS;
    }

    public void setFavOS(List<String> favOS) {
        this.favOS = favOS;
    }
}
