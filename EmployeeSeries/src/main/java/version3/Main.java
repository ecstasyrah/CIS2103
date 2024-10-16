/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author markalfredpardillo
 */
public class Main {
    public static void main(String[] args){
        Name n1 = new Name();
        Name n2 = new Name("Palabrica");
        Name n3 = new Name("Palabrica","Sarah");
        Name n4 = new Name("Palabrica","Sarah","Ordonez");
        Name n5 = new Name();

        n1.setFirstN("Lucy");
        n1.setLastN("Chen");
        n1.setMiddleN("Go");

        n2.setMiddleN("Enad");
        n2.setFirstN("Dot");

        n3.setMiddleN("Pardillo");

        n5.setName("Sar", "Halo", "Nolan");

        n1.displayName();
        n2.displayName();
        n3.displayName();
        n4.displayName();
        n5.displayName();

        Date d1= new Date();
        Date d2 = new Date(2003);
        Date d3 = new Date(2002, 12);
        Date d4 = new Date(2,12,2006);
        Date d5 = new Date();

        System.out.println("\n");

        d1.setDay(25);
        d1.setMonth(6);
        d1.setYear(2003);

        d2.setDay(24);
        d2.setMonth(7);

        d3.setDay(30);

        d5.setDate(2012,2,21);

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();

        Employee e1 = new Employee();
        Employee e2 = new Employee(1);
        Employee e3 = new Employee(2,"Say","Ordonez");
        Employee e4 = new Employee(3,"Sarah", "Maligro", "Ocupe");
        Employee e5 = new Employee(5, "Justin","Bieber");

        System.out.println("\n");

        e1.setEmpID(9);
        e1.setEmpName("Dot","Alfred","Pardz");
        e1.setEmpDOB(2002, 7, 21);
        e1.setEmpDOJ(2024,9,12);

        e2.setEmpName("Jolie","Ocuper","Maligro");
        e2.setEmpDOB(2003,1,5);
        e2.setEmpDOJ(2022,9,15);
        
        e3.setEmpDOB(2000,12,25);
        e3.setEmpDOJ(2021,2,27);

        e4.setEmpDOJ(1999,6,8);
        e4.setEmpDOJ(2023,11,18);

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
        e4.displayEmployee();
        e5.displayEmployee();

    }
}
