/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

import java.time.*;

/**
 *
 * @author User
 */
public class test {
    public static void main(String[] args){
        Employee E1 = new Employee();
        E1.setEmpId(234);
        E1.setEmpName("Olivia");
        
        Employee E2 = new Employee("Aria", 786);
        Employee E3 = new Employee(256, "Jav");
        Employee E4 = new Employee(735);
        E4.setEmpName("Aika");
        Employee E5 = new Employee("Basha");
        E4.setEmpId(827);
        System.out.println("----Employee----");
        E1.display();
        E2.display();
        E3.display();
        E4.display();
        E5.display();
        
        HE empHE1 = new HE();
        empHE1.setEmpId(123);
        empHE1.setEmpName("Sarah");
        empHE1.setRatePerHour(100);
        empHE1.setTotalHrsWorked(41);
        
        HE empHE2 = new HE("Saoirse", 124);
        empHE2.setRatePerHour(100);
        empHE2.setTotalHrsWorked(45);
        
        HE empHE3 = new HE("bea",513, 45);
        empHE3.setTotalHrsWorked(45);
        
        HE empHE4 = new HE(48);
        empHE4.setEmpId(789);
        empHE4.setEmpName("Alicia");
        empHE4.setRatePerHour(100);
        
        HE empHE5 = new HE(100,51,"Jade", 125); 
        System.out.println("----Hourly Employee----");
        empHE1.display();
        empHE2.display();
        empHE3.display();
        empHE4.display();
        empHE5.display();
        
        PWE empPWE1 = new PWE();
        empPWE1.setEmpId(234);
        empPWE1.setEmpName("Alfred");
        empPWE1.setRatePerPc(100);
        empPWE1.setTotalPcsFin(101);
        
        PWE empPWE2 = new PWE(235,"Jarren");
        empPWE2.setRatePerPc(100);
        empPWE2.setTotalPcsFin(90);
        
        PWE empPWE3 = new PWE("Amira", 742);
        empPWE3.setRatePerPc(100);
        empPWE3.setTotalPcsFin(105);
        
        PWE empPWE4 = new PWE(100);
        empPWE4.setEmpId(345);
        empPWE4.setEmpName("Lea");
        empPWE4.setTotalPcsFin(102);
        
        PWE empPWE5 = new PWE(105,100,"Mela", 236);
        
        System.out.println("\n----Piece Worker Employee----");
        empPWE1.display();
        empPWE2.display();
        empPWE3.display();
        empPWE4.display();
        empPWE5.display();
        
        CE empCE1 = new CE();
        empCE1.setEmpId(345);
        empCE1.setEmpName("Dot");
        empCE1.setTotalSales(100000);
        
        CE empCE2 = new CE(346,"Sofia" );
        empCE2.setTotalSales(10000);
        
        CE empCE3 = new CE(1000);
        empCE3.setEmpId(102);
        empCE3.setEmpName("Asher");
        
        CE empCE4 = new CE("Alia", 908);
        empCE4.setTotalSales(100000);
        
        CE empCE5 = new CE(1230000,"Sheena", 347);
        System.out.println("\n----Commission Employee----");
        empCE1.display();
        empCE2.display();
        empCE3.display();
        empCE4.display();
        empCE5.display();
        
        BPCE empBPCE1 = new BPCE();
        empBPCE1.setEmpId(456);
        empBPCE1.setEmpName("Say");
        empBPCE1.setBaseSalary(5000);
        empBPCE1.setTotalSales(100000);

        BPCE empBPCE2 = new BPCE("Colet",457);       
        empBPCE2.setBaseSalary(5000);
        empBPCE2.setTotalSales(10000);
        
        BPCE empBPCE3 = new BPCE(5000, 100000);
        empBPCE3.setEmpId(789);
        empBPCE3.setEmpName("Kayla");
        
        BPCE empBPCE4 = new BPCE(5000);
        empBPCE4.setEmpId(702);
        empBPCE4.setEmpName("Kori");
        empBPCE4.setTotalSales(1000);

        BPCE empBPCE5 = new BPCE(12000,"Aiah", 458, 5000);

        System.out.println("\n----Based plus Commission Employee----");
        empBPCE1.display();
        empBPCE2.display();
        empBPCE3.display();
        empBPCE4.display();
        empBPCE5.display();
    }
    
}
