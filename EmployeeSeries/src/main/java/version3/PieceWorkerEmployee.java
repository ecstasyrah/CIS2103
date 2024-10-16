/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author Tisay
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        super();
    }

    public PieceWorkerEmployee(int empID, Name empName) {
        super(empID, empName.getFirstN(), empName.getMiddleN(), empName.getLastN());
    }

    public PieceWorkerEmployee(Name empName, int empID) {
        super(empID, empName.getFirstN(), empName.getMiddleN(), empName.getLastN());
    }

    public PieceWorkerEmployee(double ratePerPiece, int totalPiecesFinished) {
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public PieceWorkerEmployee(int empID, Name empName, int totalPiecesFinished, double ratePerPiece) {
        super(empID, empName.getFirstN(), empName.getMiddleN(), empName.getLastN());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public void setFinishedPieces (int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public int getFinishedPieces () {
        return this.totalPiecesFinished;
    }

    public void setRate (double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double getRate() {
        return this.ratePerPiece;
    }

    public double computeSalary() {
        return totalPiecesFinished * ratePerPiece + ((int) totalPiecesFinished / 100) * (10 * ratePerPiece);
    }

    public void displayHourlyEmployee() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(super.toString())
            .append("Total Pieces Finished: ").append(getFinishedPieces()).append("\n")
            .append("Rate per hour: ").append(getRate()).append("\n");
        return sb.toString();
    }
}
