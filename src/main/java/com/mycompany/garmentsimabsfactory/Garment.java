/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimabsfactory;

/**
 *
 * @author maazh
 */
public class Garment {
    
    Garment (String type) {
    switch (type) {
      case "Casual":
        new CasualApparrel();
        break;
      case "Professional":
        new ProfessionalApparrel();
        break;
      case "Party":
        new PartyApparrel();
        break;
      default:
        throw new IllegalArgumentException("Type not supported.");
    }
  }
}
