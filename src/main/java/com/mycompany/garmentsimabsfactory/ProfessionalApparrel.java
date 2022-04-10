/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garmentsimabsfactory;

/**
 *
 * @author maazh
 */
public class ProfessionalApparrel {

    ProfessionalApparrel() {
        ProfessionalTop pt = new ProfessionalTop();
        ProfessionalPant pp = new ProfessionalPant();
        ProfessionalShoe ps = new ProfessionalShoe(); 
        
        pt.description();
        pp.description();
        ps.description();
    }
}
