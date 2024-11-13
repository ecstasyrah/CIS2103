/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author markalfredpardillo
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasedPlusCommissionEmployee() {
        super();
    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, String fname, String mname, String lname) {
        super(empID, fname, mname, lname);
    }

    public BasedPlusCommissionEmployee(String empName, int empID, double baseSalary, double totalSales) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, Name empName, double totalSales, double baseSalary) {
        super(empID, empName.getFirstN(), empName.getMiddleN(), empName.getLastN());
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
            sb.append(super.toString())
            .append("Base salary: ").append(getBaseSalary()).append("\n")
            .append("Total sales: ").append(super.getTotalSales()).append("\n");
        return sb.toString();
    }
}

