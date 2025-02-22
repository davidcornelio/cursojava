
package controller;

import model.*;
public class Test2 {
  
    public static void main(String[] args) {
       
      Cliente cli1;//instancia de cliente
      cli1=new ClienteNatural("102003","angel abad",2000);
      //determinar el tipo de cliente que es de cli1 
      
      if(cli1 instanceof ClienteNatural){
       System.out.println("cli1 es un  tipo de cliente natural");     
      }
      else{
      System.out.println("cli1 no es un  tipo de cliente natural");    
      }
      
//  
      
      
      
    }
    
}
