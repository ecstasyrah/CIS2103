/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class HE extends Employee{
    private float totalHrsWorked;
    private double ratePerHour;
    private String empName;
    private int empId;

    public HE() {
        
    }
    public HE(String empName, int empId) {
        super(empId,empName);
    }
    
    public HE(String empName, int empId, double ratePerHour){
        super(empId,empName);
        this.ratePerHour = ratePerHour;
    }
    
    public HE(float totalHrsWorked){
        this.totalHrsWorked = totalHrsWorked;
    }
  
    public HE(float totalHrsWorked, double ratePerHour, String empName, int empId) {
        super(empId,empName);
        this.totalHrsWorked = totalHrsWorked;
        this.ratePerHour = ratePerHour;
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
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nEmployee ID: ")
            .append(this.empId)
            .append("\nEmployee Name: ")
            .append(this.empName)
            .append("\nRate Per Hour: $")
            .append(this.ratePerHour)
            .append("\nTotal hours worked: ")
            .append(this.totalHrsWorked)
            .append("\nTotal salary: $")
            .append(computeSalary());
        
        return sb.toString();
    }
}
