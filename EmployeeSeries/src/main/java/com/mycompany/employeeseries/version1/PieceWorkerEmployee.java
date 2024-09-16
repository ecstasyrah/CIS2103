/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author Tisay
 */
public class PieceWorkerEmployee {
    private int totalPcsFin;
    private double ratePerPc;
    private String empName;
    private int empID;

    public PieceWorkerEmployee(int totalPcsFin, double ratePerPc, String empName, int empID) {
        this.totalPcsFin = totalPcsFin;
        this.ratePerPc = ratePerPc;
        this.empName = empName;
        this.empID = empID;
    }

    public int getTotalPcsFin() {
        return totalPcsFin;
    }

    public void setTotalPcsFin(int totalPcsFin) {
        this.totalPcsFin = totalPcsFin;
    }

    public double getRatePerPc() {
        return ratePerPc;
    }

    public void setRatePerPc(double ratePerPc) {
        this.ratePerPc = ratePerPc;
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
        double bonus;
        double bonusPay;
        double salary;
        if(this.totalPcsFin > 100){
            bonus = this.totalPcsFin - 100;
            this.totalPcsFin -= bonus;
            bonusPay = bonus * (this.ratePerPc * 10);
            salary = (this.ratePerPc * this.totalPcsFin) + bonusPay;
        }else{
            salary = this.ratePerPc * this.totalPcsFin;
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
