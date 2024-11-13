/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version4;

import java.time.LocalDate;

public class BasedPlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedPlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public BasedPlusCommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalPiecesFinished, totalSales, ratePerPiece);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece, double baseSalary) {
        super(empName, empDateHired, empBirthDate, totalPiecesFinished, totalSales, ratePerPiece);
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
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nBase Salary: $" + getBaseSalary()
                + "\n";
    }
}
