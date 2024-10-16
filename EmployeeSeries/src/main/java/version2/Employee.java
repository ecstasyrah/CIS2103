/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author markalfredpardillo
 */
public class Employee {
    private int empId;
    private String empName;
    
    public Employee(){
        
    }

    public Employee(int empId){
        this.empId = empId;
    }
    
    public Employee(String empName){
        this.empName = empName;
    }    
    
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    public Employee(String empName, int empId){
        this.empName = empName;
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public void display(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return String.format("""
                             Employee ID: %d
                             Employee Name: %s
                             """,
                             empId,
                             empName);

    }
}
