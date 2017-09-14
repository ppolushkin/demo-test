package com.example.testdemo;

/**
 * Created by Pavel Polushkin
 * 14.09.2017.
 */
public class User {

    public Long id;
    public String firstName;
    public String lastName;
    public String birthday;
    public String jobTitle;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String birthday, String jobTitle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.jobTitle = jobTitle;
    }

}
