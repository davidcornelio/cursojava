/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
import model.Cliente;
import model.ClienteJuridico;
public class Test1 {
  
    
    public static void main(String[] args) {
     //cliente no puede instanciarse por ser abstracto
     //el fin de cliente es ser modelo para otro tipo de cliente
        /*Cliente clien1=new Cliente("JUAN",1500);
        
        System.out.println(clien1);*/
        model.ClienteNatural clienN1=new model.ClienteNatural("12345678", "ANA ABAD", 5000,"av. lima13","micorreo@peru.com",2010);
        System.out.println("clienN1");
        System.out.println("Antiguedad de cliente natural: "+clienN1.getAntiguedad());
    ClienteJuridico clienJ1=new ClienteJuridico("456789956","09405724","ABC CONSUOLTORES","JUAN PEREZ",5000);
    
    
    
    
    
    }
}
