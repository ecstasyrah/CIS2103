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
        HourlyEmployee emp1 = new HourlyEmployee();
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee();
        CommissionEmployee emp3 = new CommissionEmployee();
        BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee();
        
        emp1.setEmpID(123);
        emp1.setEmpName("Sarah");
        emp1.setRatePerHour(100);
        emp1.setTotalHrsWorked(41);
        
        emp2.setEmpID(234);
        emp2.setEmpName("Alfred");
        emp2.setRatePerPc(100);
        emp2.setTotalPcsFin(101);
        
        emp3.setEmpId(345);
        emp3.setEmpName("Dot");
        emp3.setTotalSales(100000);
        
        emp4.setEmpID(456);
        emp4.setEmpName("Say");
        emp4.setBaseSalary(5000);
        emp4.setTotalSales(100000);

        System.out.println("----Hourly Employee----");
        emp1.display();
        System.out.println("\n----Piece Worker Employee----");
        emp2.display();
        System.out.println("\n----Commission Employee----");
        emp3.display();
        System.out.println("\n----Based plus Commission Employee----");
        emp4.display();
    }
    
    
}
