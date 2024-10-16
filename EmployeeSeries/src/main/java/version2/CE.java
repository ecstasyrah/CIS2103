/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;


/**
 *
 * @author User
 */
public class CE extends Employee{
    private double totalSales;
    private String empName;
    private int empId;

    public CE() {
    }
    public CE(int empId, String empName) {
        super(empId,empName);
    }

    public CE(double totalSales, String empName, int empId) {
        super(empId,empName);
        this.totalSales = totalSales;
    }
    
    public CE(double totalSales){
        this.totalSales = totalSales;
    }
    
    public CE(String empName, int empId){
        super(empName, empId);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
        
        return rate * this.totalSales;
    }

    @Override
    public void display(){
        System.out.println(this);
        System.out.println(computeSalary());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nEmployee ID: ")
            .append(this.empId)
            .append("\nEmployee Name: ")
            .append(this.empName);
        
        return sb.toString();
    }
}
