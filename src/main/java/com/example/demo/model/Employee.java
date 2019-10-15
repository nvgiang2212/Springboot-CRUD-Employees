package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    private long id;
    private String firstname;
    private String lastname;
    private String emailId;

    public Employee() {

    }

    public Employee(long id, String firstname, String lastname, String emailId) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailId = emailId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
