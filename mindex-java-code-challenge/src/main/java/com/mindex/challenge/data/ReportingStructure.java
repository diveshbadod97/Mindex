package com.mindex.challenge.data;
/**
 * Retrieving and setting the data for the new type reporting structure
 */



public class ReportingStructure {
    private String employeeId;
    private int numberOfreports;

    public ReportingStructure() {
    }

    public String getEmployee(){
        return employeeId;
    }
    public void setEmployee(String Id){
        this.employeeId = Id;
    }

    public int getNumberOfreports(){
        return numberOfreports;
    }

    public void setNumberOfreports(int numberOfreports){
        this.numberOfreports = numberOfreports;
    }

}
