/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act3;

/**
 *
 * @author Tisay
 */
public class vehicle {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;
    
    public vehicle(int topS, int currS, String col, String mod, String manu, String plateNum, boolean disabled){
        this.topSpeed = topS;
        this.currSpeed = currS;
        this.color = col;
        this.model = mod;
        this.manufacturer = manu;
        this.plateNumber = plateNum;
        this.disabled = disabled;
    }
    
    public void setTopSpeed(int topS){
        this.topSpeed = topS;
    }
    
    public int getTopSpeed(){
        return this.topSpeed;
    }
    
    public void setCurrSpeed(int currS){
        this.currSpeed = currS;
    }
    
    public int getCurrSpeed(){
        return this.currSpeed;
    } 
    
    public void setColor(String col){
        this.color = col;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setModel(String mod){
        this.model = mod;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public void setManu(String manu){
        this.manufacturer = manu;
    }
    
    public String getManu(){
        return this.manufacturer;
    }
    
    public void setPlateNum(String plateNum){
        this.plateNumber = plateNum;
    }
    
    public String getPlateNum(){
        return this.plateNumber;
    }
    
    public void setDisabled(boolean disabled){
        this.disabled = disabled;
    }
    
    public boolean getDisabled(){
        return this.disabled;
    }
    
    public boolean accelerate() {
        if (!disabled && currSpeed < topSpeed) {
            currSpeed += 10;
            return true; 
        }
        return false;
    }
    
    public boolean decelerate() {
        if (!disabled && currSpeed > 0) {
            currSpeed -= 5; 
            return true; 
        }
        return false;
    }
    
    public boolean disabled(){
        if(this.currSpeed > topSpeed){
            return this.disabled = false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "The " + this.color +" "+this.manufacturer +" "+ this.model + " with a plate No. "+ this.plateNumber + " is running from " + this.currSpeed + "kph to " + this.topSpeed + "kph.";
    }
}
