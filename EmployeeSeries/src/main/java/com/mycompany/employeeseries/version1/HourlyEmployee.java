/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private float totalHrsWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee() {
    }

    public float getTotalHrsWorked() {
        return totalHrsWorked;
    }

    public void setTotalHrsWorked(float totalHrsWorked) {
        this.totalHrsWorked = totalHrsWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
   
    
    public double computeSalary(){
        float excess;
        double overtimePay;
        double salary;
        
        if(this.totalHrsWorked <= 40 && this.totalHrsWorked > 0){
            salary = this.totalHrsWorked * this.ratePerHour;
        }else{
            excess = (this.totalHrsWorked - 40);
            this.totalHrsWorked -= excess;
            overtimePay = excess * (this.ratePerHour * 1.5);
            salary = (this.totalHrsWorked * this.ratePerHour) + overtimePay;
        }
        return salary;
    }
    
    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Employee ID: ");
        sb.append(this.empID);
        sb.append("\n");
        sb.append("Employee Name: ");
        sb.append(this.empName);
        sb.append("\n");
        sb.append("Rate Per Hour:");
        sb.append(this.ratePerHour);
        sb.append("\n");
        sb.append("Total hours worked: ");
        sb.append(this.totalHrsWorked);
        sb.append("\n");
        sb.append("Total salary: ");
        sb.append(computeSalary());
        
        return sb.toString();
    }
}
