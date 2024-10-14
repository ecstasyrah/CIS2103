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
    private int empId;

    public HE() {
        
    }
    public HE(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }
  
    public HE(float totalHrsWorked, double ratePerHour, String empName, int empId) {
        this.totalHrsWorked = totalHrsWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empId = empId;
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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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
