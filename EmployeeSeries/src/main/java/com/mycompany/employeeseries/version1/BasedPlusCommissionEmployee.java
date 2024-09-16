/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author Tisay
 */
public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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
        double salary = 0.0;
        
        if(this.totalSales < 0){
            System.out.println("Fire the employee.");
        }else if(this.totalSales < 10000){
            salary = this.totalSales * 0.05;
            salary += this.baseSalary;
        }else if(this.totalSales < 100000 && this.totalSales > 10000){
            salary = this.totalSales * 0.10;
            salary += this.baseSalary;
        }else if(this.totalSales < 1000000 && this.totalSales > 100000){
            salary = this.totalSales * 0.20;
            salary += this.baseSalary;
        }else{
            salary = this.totalSales * 0.30;
            salary += this.baseSalary;
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
        sb.append("Total salary: ");
        sb.append(computeSalary());
        
        return sb.toString();
    }
}
