/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class PWE {
    private int totalPcsFin;
    private double ratePerPc;
    private String empName;
    private int empID;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(String empName, int empID) {
    this();
    }

    public PieceWorkerEmployee(int totalPcsFin, double ratePerPc, String empName, int empID) {
        this.totalPcsFin = totalPcsFin;
        this.ratePerPc = ratePerPc;
        this.empName = empName;
        this.empID = empID;
    }
    
    
    public int getTotalPcsFin() {
        return totalPcsFin;
    }

    public void setTotalPcsFin(int totalPcsFin) {
        this.totalPcsFin = totalPcsFin;
    }

    public double getRatePerPc() {
        return ratePerPc;
    }

    public void setRatePerPc(double ratePerPc) {
        this.ratePerPc = ratePerPc;
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
        double bonus = 0;
        double salary = 0;
        if(this.totalPcsFin < 100){
            salary = this.ratePerPc * this.totalPcsFin;
        }else{
            salary = (this.totalPcsFin * this.ratePerPc);
            int hundredPcs = this.totalPcsFin / 100;
            bonus = hundredPcs * 10 * this.ratePerPc;
            salary += bonus;
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
            .append("\nRate Per Piece: ")
            .append(this.ratePerPc)
            .append("\nTotal Pieces Finished: ")
            .append(this.totalPcsFin)
            .append("\nTotal salary: ")
            .append(computeSalary());
        
        return sb.toString();
    }
}
