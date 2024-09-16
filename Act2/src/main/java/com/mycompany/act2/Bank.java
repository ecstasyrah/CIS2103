/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act2;

/**
 *
 * @author Tisay
 */
public class Bank {

    public static void main(String[] args){
        Account account1 = new Account("SarahP", 123456);
        Account account2 = new Account("SayO", 213423);
        Account account3 = new Account("Jolie", 123890);
        
        System.out.println("Account 1 details: ");
        System.out.println(account1);
        
        System.out.println("\nAccount 2 details: ");
        System.out.println(account2);
        
        System.out.println("\nAccount 3 details: ");
        System.out.println(account3);
                
        account1.deposit(200.00);
        account1.verify();
        System.out.println("\nAfter depositing $200 into Account 1:");
        System.out.println(account1);
        
        account2.deposit(500.00);
        account2.verify();
        System.out.println("\nAfter depositing $500 into Account 2:");
        System.out.println(account2);
        
        account3.deposit(1000.00);
        account3.verify();
        System.out.println("\nAfter depositing $1000 into Account 3:");
        System.out.println(account3);
         
        account2.transfer(account3, 500);
        System.out.println(account2);
        System.out.println(account3);
    }
}
