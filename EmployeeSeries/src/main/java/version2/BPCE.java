/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class BPCE extends CE {

    private double baseSalary;
    
    public BPCE(){
        
    }

    public BPCE(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BPCE(String empName,int empId) {
        super(empId,empName);   
    }
    
    public BPCE(double baseSalary, double totalSales){
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BPCE(double totalSales, String empName, int empId , double baseSalary) {
        super(totalSales, empName,empId);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary() {
        return baseSalary + super.computeSalary();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString())
                .append("\nBase Salary: $")
                .append(getBaseSalary())
                .append("\nTotal Salary: $");
        
        return sb.toString();
    }
}
