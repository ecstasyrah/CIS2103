/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version6;

public class Main {
    public static void main(String[] args) {
        EmployeeRoster ros = new EmployeeRoster(10);
        
        ros.addEmployee(new HourlyEmployee(1, new Name("Palabrica", "Sarah")
                                            , new Date(1997, 1, 15)
                                            , new Date(2024, 5, 10)
                                            , 12.3f, 1.5));
        
        ros.addEmployee(new CommissionEmployee(2, new Name("Pardillo", "Mark")
                                                , new Date(1997, 1, 15)
                                                , new Date(2024, 5, 10)
                                                , 8000.75));
        
        ros.addEmployee(new BasePlusCommissionEmployee(3, new Name("Lim", "Mika", "Sho")
                                                        , 500.2
                                                        , 12000.0));
        ros.addEmployee(new PieceWorkerEmployee(4, new Name("Menendez", "Aiah", "Odin")
                                                 , 100
                                                 , 50)); 
        
        ros.displayAllEmployees();
        System.out.println("\n");
        ros.removeEmployee(1);
        ros.displayAllEmployees();
        ros.setEmployee(new Employee("Palabrica", "Sarah", "Ordonez", 2004, 07, 30), 5);
        System.out.println("\n");
        ros.displayAllEmployees();
    }
}