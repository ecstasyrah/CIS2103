/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;

public abstract class Employee implements ComputeSalary{
    private int empID;
    private Name empName;
    private Date empDOB;
    private Date empHired;

    public Employee() {
        this.empName = new Name();
        this.empDOB = new Date();
        this.empHired = new Date();
    }

    public Employee(int empID) {
        this.empID = empID;
        this.empName = new Name();
        this.empDOB = new Date();
        this.empHired = new Date();
    }

    public Employee(int empID, String fname, String lname) {
        this.empID = empID;
        this.empName = new Name(lname, fname);
        this.empDOB = new Date();
        this.empHired = new Date();
    }

    public Employee(int empID, String fname, String mname, String lname) {
        this.empID = empID;
        this.empName = new Name(lname, fname, mname);
        this.empDOB = new Date();
        this.empHired = new Date();
    }

    public Employee(int empID, String fname, String mname, String lname, int year, int month, int day) {
        this.empID = empID;
        this.empName = new Name(lname, fname, mname);
        this.empDOB = new Date(year, month, day);
        this.empHired = new Date();
    }

    public Employee (int empID, Name empName, Date empDOB, Date empDOJ) {
        this.empID = empID;
        this.empName = empName;
        this.empDOB = empDOB;
        this.empHired = empDOJ;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpName(String fname, String mname, String lname) {
        empName.setName(lname, fname, mname);
    }

    public String getEmpName() {
        return empName.toString();
    }

    public void setEmpDOB(int year, int month, int day) {
        empDOB.setDate(year, month, day);
    }

    public Date getEmpDOB() {
        return empDOB;
    }

    public void setEmpHired(int year, int month, int day) {
        empHired.setDate(year, month, day);
    }

    public Date getEmpHired() {
        return empHired;
    }
   
    public abstract void display();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("Employee ID: ")
                    .append(getEmpID())
                    .append("\n")
            .append("Employee name: ")
                    .append(getEmpName())
                    .append("\n")
            .append("Join date: ")
                    .append(empHired.toString())
                    .append("\n")
            .append("Date of birth: ")
                    .append(empDOB.toString())
                    .append("\n");
        return sb.toString();
    }
}

