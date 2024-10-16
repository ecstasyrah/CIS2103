/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act1;

/**
 *
 * @author Tisay
 */
public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;
    private boolean isPM;
    private boolean isAM;
    
    
    public MyTime(int hrs, int min, int sec, boolean mer) {
        setHours(hrs);
        setMinutes(min);
        setSeconds(sec);
        setMeridian(mer);
    }
    
    public void setMeridian(boolean meridian){
        this.meridian = meridian;
    }
    
    public String getMeridian() {
        return meridian ? "PM" : "AM";
    }
    
    public void setHours(int hours) {
        this.hours = (hours <= 12 && hours > 0) ? hours : 12;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : 0;
    }

    public MyTime(boolean isPM, boolean isAM) {
        this.isPM = isPM;
        this.isAM = isAM;
    }

    public boolean isIsPM() {
        return isPM;
    }

    public void setIsPM(boolean isPM) {
        this.isPM = isPM;
    }

    public boolean isIsAM() {
        return isAM;
    }

    public void setIsAM(boolean isAM) {
        this.isAM = isAM;
    }
    
    
    public void tickBySecond() {
        this.seconds++;
        if (this.seconds >= 60) {
            this.seconds = 0;
            tickByMinute();
        }
    }

    public void tickByMinute() {
        this.minutes++;
        if (this.minutes >= 60) {
            this.minutes = 0;
            tickByHour();
        }
    }

    public void tickByHour() {
        this.hours++;
        if (this.hours >= 12) {
            this.hours -= 12;
            meridian = !meridian;
        }
    }
    
    public void advanceTime(int seconds){
        this.seconds += seconds;
        
        this.minutes += this.seconds /60;
        this.seconds = this.seconds % 60;
        
        this.hours += this.minutes /60;
        this.minutes = this.seconds % 60;
        
        if(this.hours>12){
            this.isPM = !this.isPM;
            this.hours -= 12;
            this.hours = this.hours % 12;
        }
        
        if(this.hours == 0){
            this.hours = 12;
     }
    
//
//    @Override
//     String toString(){
//        return String.format("%02d:%02d:%02d", getHours, getMinutes, getSeconds);
//    }
   

    }

    @Override
    public String toString() {
        return "MyTime{" + "hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + '}';
    }

}