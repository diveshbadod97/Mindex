package com.mindex.challenge.data;

/**
 * Reptrieving and setting data for the compensation structure
 */

public class Compensation {

    private String employeeId;
    private int salary;
    private String Date;

    public Compensation(){

    }
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(String id){
        this.employeeId = id;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date){
        this.Date = Date;
    }
}
