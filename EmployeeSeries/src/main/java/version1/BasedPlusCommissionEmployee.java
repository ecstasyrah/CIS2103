/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Tisay
 */
public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(String empName, int empID) {
    
    }

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
        double rate = 0;
        
        if(this.totalSales < 0){
            System.out.println("Fire the employee.");
        }else if(this.totalSales < 10000){
            rate = 0.05;
        }else if(this.totalSales < 100000 && this.totalSales >= 10000){
            rate = 0.10;
        }else if(this.totalSales < 1000000){
            rate = 0.20;
        }else{
            rate = 0.30;
        }
        
        
        return this.baseSalary + (rate * this.totalSales);
    }
    
    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Employee ID: ")
                .append(this.empID)
                .append("\nEmployee Name: ")
                .append(this.empName)
                .append("\nBase salary: ")
                .append(this.baseSalary)
                .append("\nTotal Sales: ")
                .append(this.totalSales)
                .append("\nTotal salary: ")
                .append(computeSalary());
        
        return sb.toString();
    }
}
