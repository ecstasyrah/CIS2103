/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2;

/**
 *
 * @author Tisay
 */
public class Account {
    private String accountName;
    private int accountNumber;
    private double currentBalance;
    private double availableBalance;
    
    
    public Account(String accountName, int accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    
    public double getCurrBalance(){
        return this.currentBalance;
    }
   
    public double getAvailBalance(){
        return this.availableBalance;
    }
    
    public void setAccName(String accountName){
        this.accountName = accountName;
    }
    
    public String getAccName(){
        return this.accountName;
    }
    
    public void setAccNumber(int accountNum){
        this.accountNumber = accountNum;
    }
    
    public int getAccNumber(){
        return this.accountNumber;
    }
    
    public boolean deposit(double amount){
        if(amount > 0){
            this.currentBalance += amount;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= this.availableBalance){
            this.availableBalance -= amount;
            this.currentBalance -= amount;
            return true;
        }
        return false;
    }
    
    public double checkBalance(){
        return this.availableBalance;
    }
    
    public void verify(){
        this.availableBalance += this.currentBalance;
    } 
    
    public boolean transfer(Account another, double amount){
        if(amount > 0 && amount < this.availableBalance){
           amount += another.availableBalance;
           amount += another.currentBalance;
           amount -= this.availableBalance;
           amount -= this.currentBalance;
           return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Account ID:");
        sb.append(this.accountNumber);
        sb.append("\n");
        sb.append("Account Name:");
        sb.append(this.accountName);
        sb.append("\n");
        sb.append("Current Balance:");
        sb.append(this.currentBalance);
        sb.append("\n");
        sb.append("Available Balance: ");
        sb.append(this.availableBalance);
        
        return sb.toString();
        
    }
}
