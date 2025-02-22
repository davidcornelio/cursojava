
package model;

import interfei.*;
public class VehiculoHibrido implements Electrico, Combustion{

    @Override
    public void motorElectrico() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("TIENE MOTOR ELECTRICO");
    
    }

    @Override
    public void motorCombustion() {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("TIENE MOTOR A COMBUSTION");   
    
    }
    
}
