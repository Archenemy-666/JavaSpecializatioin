package com.model;
import javax.persistence.Entity ;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {
    @Id @GeneratedValue
    private int employeeId ;
    private String employeeName;
    private String employeeEmailId ;
    private String UserName ;
    private String password ;
    private Date doj ;
    private String country ;
    private int contact;

    public Employee(){}

    public Employee(int employeeId, String employeeName, String employeeEmailId, String userName, String password, Date doj, String country, int contact) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmailId = employeeEmailId;
        UserName = userName;
        this.password = password;
        this.doj = doj;
        this.country = country;
        this.contact = contact;
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmailId() {
        return employeeEmailId;
    }

    public void setEmployeeEmailId(String employeeEmailId) {
        this.employeeEmailId = employeeEmailId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
