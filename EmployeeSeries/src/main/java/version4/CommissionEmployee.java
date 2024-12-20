
package version4;

public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int empID) {
        super(empID);
    }

    public CommissionEmployee(int empID, String fname, String mname, String lname) {
        super(empID, fname, mname, lname);
    }

    public CommissionEmployee(int empID, Name empName, Date empDOB, Date empDOJ) {
        super(empID, empName, empDOB, empDOJ);
    }

    public CommissionEmployee(int empID, Name empName, Date empDOB, Date empDOJ, double totalSales) {
        super(empID, empName, empDOB, empDOJ);
        this.totalSales = totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double computeSalary() {
        double salary;
        if (totalSales < 10000) {
            salary = totalSales * 0.05;
        } else if (totalSales < 100000 && totalSales >= 10000) {
            salary = totalSales * 0.1;
        } else if (totalSales < 1000000) {
            salary = totalSales * 0.2;
        } else {
            salary = totalSales * 0.3;
        }
        return salary;
    }

    public void display() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(super.toString())
            .append("Total sales: ")
            .append(getTotalSales())
            .append("\n");
        return sb.toString();
    }
}
