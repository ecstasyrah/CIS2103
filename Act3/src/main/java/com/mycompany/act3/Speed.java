/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act3;

/**
 *
 * @author Tisay
 */
public class Speed {

      public static void main(String[] args){
        vehicle car1 = new vehicle(160,156,"red","vios","toyota","GAK 1234",false);
        vehicle car2 = new vehicle(150, 50, "metallic gray","celerio", "suzuki", "JAA 1234", false);
        
        System.out.println("==========First Car==========");
        System.out.println(car1);
        car1.accelerate();
        System.out.println(car1);
        car1.decelerate();
        System.out.println(car1);
        
        
        System.out.println("\n==========Second Car==========");
        System.out.println(car2);
        car2.accelerate();
        System.out.println(car2);
        car2.decelerate();
        System.out.println(car2);
        
    }
}
