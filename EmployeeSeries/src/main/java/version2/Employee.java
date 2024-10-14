/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class Employee {
    public static void main(String[] args){
        HE empHE1 = new HE();
        PWE empPWE1 = new PWE();
        CE empCE1 = new CE();
        BPCE empBPCE1 = new BPCE();
        
       
        empHE1.setEmpId(123);
        empHE1.setEmpName("Sarah");
        empHE1.setRatePerHour(100);
        empHE1.setTotalHrsWorked(41);
        
        empPWE1.setEmpId(234);
        empPWE1.setEmpName("Alfred");
        empPWE1.setRatePerPc(100);
        empPWE1.setTotalPcsFin(101);
        
        empCE1.setEmpId(345);
        empCE1.setEmpName("Dot");
        empCE1.setTotalSales(100000);
        
        empBPCE1.setEmpId(456);
        empBPCE1.setEmpName("Say");
        empBPCE1.setBaseSalary(5000);
        empBPCE1.setTotalSales(100000);
        
        HE empHE2 = new HE("Saoirse", 124);
        PWE empPWE2 = new PWE("Jarren", 235);
        CE empCE2 = new CE("Sofia",346);
        BPCE empBPCE2 = new BPCE("Colet",457);
        
        empHE2.setRatePerHour(100);
        empHE2.setTotalHrsWorked(45);
        empPWE2.setRatePerPc(100);
        empPWE2.setTotalPcsFin(99);
        empCE2.setTotalSales(10000);
        empBPCE2.setBaseSalary(5000);
        empBPCE2.setTotalSales(10000);
        
        HE empHE3 = new HE(100,51,"Jade", 125);
        PWE empPWE3 = new PWE(105,100,"Shai", 236);
        CE empCE3 = new CE(1230000,"Sheena", 347);
        BPCE empBPCE3 = new BPCE(12000,"Aiah", 458, 5000);
        

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
