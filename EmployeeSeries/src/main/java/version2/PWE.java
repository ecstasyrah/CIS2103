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
    private int empId;

    public PWE() {
    }

    public PWE(String empName, int empId) {
        this.empId = empId;
        this.empName = empName;
    }

    public PWE(int totalPcsFin, double ratePerPc, String empName, int empId) {
        this.totalPcsFin = totalPcsFin;
        this.ratePerPc = ratePerPc;
        this.empName = empName;
        this.empId = empId;
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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    public double computeSalary(){
        double bonus;
        double salary;
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
        
        sb.append("\nEmployee ID: ")
            .append(this.empId)
            .append("\nEmployee Name: ")
            .append(this.empName)
            .append("\nRate Per Piece: $")
            .append(this.ratePerPc)
            .append("\nTotal Pieces Finished: ")
            .append(this.totalPcsFin)
            .append("\nTotal salary: $")
            .append(computeSalary());
        
        return sb.toString();
    }
}
