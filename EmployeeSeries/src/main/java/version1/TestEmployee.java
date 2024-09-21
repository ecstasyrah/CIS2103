/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author User
 */
public class TestEmployee {
    
    public static void main(String[] args){
        HourlyEmployee empHE1 = new HourlyEmployee();
        PieceWorkerEmployee empPWE1 = new PieceWorkerEmployee();
        CommissionEmployee empCE1 = new CommissionEmployee();
        BasedPlusCommissionEmployee empBPCE1 = new BasedPlusCommissionEmployee();
        
       
        empHE1.setEmpID(123);
        empHE1.setEmpName("Sarah");
        empHE1.setRatePerHour(100);
        empHE1.setTotalHrsWorked(41);
        
        empPWE1.setEmpID(234);
        empPWE1.setEmpName("Alfred");
        empPWE1.setRatePerPc(100);
        empPWE1.setTotalPcsFin(101);
        
        empCE1.setEmpId(345);
        empCE1.setEmpName("Dot");
        empCE1.setTotalSales(100000);
        
        empBPCE1.setEmpID(456);
        empBPCE1.setEmpName("Say");
        empBPCE1.setBaseSalary(5000);
        empBPCE1.setTotalSales(100000);
        
        HourlyEmployee empHE2 = new HourlyEmployee("Saoirse", 124);
        PieceWorkerEmployee empPWE2 = new PieceWorkerEmployee("Jarren", 235);
        CommissionEmployee empCE2 = new CommissionEmployee("Sofia",346);
        BasedPlusCommissionEmployee empBPCE2 = new BasedPlusCommissionEmployee("Colet",457);
        
        empHE2.setRatePerHour(100);
        empHE2.setTotalHrsWorked(45);
        empPWE2.setRatePerPc(100);
        empPWE2.setTotalPcsFin(99);
        empCE2.setTotalSales(10000);
        empBPCE2.setBaseSalary(5000);
        empBPCE2.setTotalSales(10000);
        
        HourlyEmployee empHE3 = new HourlyEmployee(100,51,"Jade", 125);
        PieceWorkerEmployee empPWE3 = new PieceWorkerEmployee(105,100,"Shai", 236);
        CommissionEmployee empCE3 = new CommissionEmployee(1230000,"Sheena", 347);
        BasedPlusCommissionEmployee empBPCE3 = new BasedPlusCommissionEmployee(5000,12000,"Aiah", 458);
        

        System.out.println("----Hourly Employee----");
        empHE1.display();
        empHE2.display();
        empHE3.display();
        System.out.println("\n----Piece Worker Employee----");
        empPWE1.display();
        empPWE2.display();
        empPWE3.display();
        System.out.println("\n----Commission Employee----");
        empCE1.display();
        empCE2.display();
        empCE3.display();
        System.out.println("\n----Based plus Commission Employee----");
        empBPCE1.display();
        empBPCE2.display();
        empBPCE3.display();
    }
    
    
}
