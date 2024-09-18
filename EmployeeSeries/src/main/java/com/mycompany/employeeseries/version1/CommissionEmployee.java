/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author Tisay
 */
public class CommissionEmployee {
    private double totalSales;
    private String empName;
    private int empId;

    public CommissionEmployee(double totalSales, String empName, int empId) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empId = empId;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    public double computeSalary(){
        double salary = 0.0;
        
        if(this.totalSales < 0){
            System.out.println("Fire the employee.");
        }else if(this.totalSales < 10000){
            salary = this.totalSales * 0.05;
        }else if(this.totalSales < 100000 && this.totalSales >= 10000){
            salary = this.totalSales * 0.10;
        }else if(this.totalSales < 1000000){
            salary = this.totalSales * 0.20;
        }else{
            salary = this.totalSales * 0.30;
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
        sb.append(this.empId);
        sb.append("\n");
        sb.append("Employee Name: ");
        sb.append(this.empName);
        sb.append("\n");
        sb.append("Total salary: ");
        sb.append(computeSalary());
        
        return sb.toString();
    }
}
