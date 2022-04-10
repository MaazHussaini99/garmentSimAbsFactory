/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimabsfactory;

/**
 *
 * @author maazh
 */
public class DriverClass {
    
    public static void main(String[] args) {
        System.out.println("Casual Wear: ");
        Garment CasualWear = new Garment("Casual");
        System.out.println("Professional Wear: ");
        Garment ProfessionalWear = new Garment("Professional");
        System.out.println("Party Wear: ");
        Garment PartyWear = new Garment("Party");
    }
}
