/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author Tisay
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(int empID, Name empName, Date empDOB, Date empDOJ, float totalHoursWorked, double ratePerHour) {
        super(empID, empName, empDOB, empDOJ);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, Name empName, Date empDOB, Date empDOJ, float totalHoursWorked) {
        super(empID, empName, empDOB, empDOJ);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = 0.0;
    }

    public HourlyEmployee(int empID, Name empName, Date empDOB, Date empDOJ, double ratePerHour) {
        super(empID, empName, empDOB, empDOJ);
        this.totalHoursWorked = 0;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, Name empName, Date empDOB, Date empDOJ) {
        super(empID, empName, empDOB, empDOJ);
        this.totalHoursWorked = 0;
        this.ratePerHour = 0.0;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public double computeSalary() {
        double salary = 0;
        if (totalHoursWorked <= 40) {
            salary += totalHoursWorked * ratePerHour;
        } else {
            salary += 40 * ratePerHour;
            totalHoursWorked -= 40;
            salary += totalHoursWorked * 1.5;
        }
        return salary;
    }

    public void display() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(super.toString())
            .append("Total hours worked: ").append(getTotalHoursWorked()).append("\n")
            .append("Rate per hour: ").append(getRatePerHour()).append("\n");
        return sb.toString();
    }
}
