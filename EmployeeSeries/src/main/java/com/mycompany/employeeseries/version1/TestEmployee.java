/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author User
 */
public class TestEmployee {
    
    public static void main(String[] args){
        HourlyEmployee emp1 = new HourlyEmployee(50, 100, "Sarah", 123);
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(101, 100, "Alfred", 234);
        CommissionEmployee emp3 = new CommissionEmployee(100000,"Dot", 345);
        BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee(100000, 5000,"Say", 456);

        System.out.println("Hourly Employee");
        emp1.display();
        System.out.println("\nPiece Worker Employee");
        emp2.display();
        System.out.println("\nCommission Employee");
        emp3.display();
        System.out.println("\nBased plus Commission Employee");
        emp4.display();
    }
    
    
}
