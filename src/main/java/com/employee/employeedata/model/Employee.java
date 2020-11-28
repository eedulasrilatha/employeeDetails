package com.employee.employeedata.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private int employeeId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "BUSINESS_UNIT")
    private String businessUnit;

    @Column(name = "PLACE")
    private String place;

    @Column(name = "SUPERVISOR_ID")
    private int supervisorId;

    @Column(name = "COMPETENCY")
    private int competency;

    @Column(name = "SALARY")
    private int salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String title, String businessUnit, String place, int supervisorId, int competency, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.title = title;
        this.businessUnit = businessUnit;
        this.place = place;
        this.supervisorId = supervisorId;
        this.competency = competency;
        this.salary = salary;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }

    public int getCompetency() {
        return competency;
    }

    public void setCompetency(int competency) {
        this.competency = competency;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", title='" + title + '\'' +
                ", businessUnit='" + businessUnit + '\'' +
                ", place='" + place + '\'' +
                ", supervisorId=" + supervisorId +
                ", competency=" + competency +
                ", salary=" + salary +
                '}';
    }
}
