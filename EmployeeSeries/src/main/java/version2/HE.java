/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class HE {
    private float totalHrsWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee() {
        
    }
    public HourlyEmployee(String empName, int empID) {
        this();
    }
  
    public HourlyEmployee(float totalHrsWorked, double ratePerHour, String empName, int empID) {
        this.totalHrsWorked = totalHrsWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
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
        
        sb.append("Employee ID: ")
            .append(this.empID)
            .append("\nEmployee Name: ")
            .append(this.empName)
            .append("\nRate Per Hour:")
            .append(this.ratePerHour)
            .append("\nTotal hours worked: ")
            .append(this.totalHrsWorked)
            .append("\nTotal salary: ")
            .append(computeSalary());
        
        return sb.toString();
    }
}
