/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author Tisay
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(float totalPiecesFinished, double totalSales, float ratePerPiece, double baseSalary) {
        super(totalPiecesFinished, totalSales, ratePerPiece);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalPiecesFinished, totalSales, ratePerPiece);
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
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println("Salary: $" + computeSalary());
    }
}
