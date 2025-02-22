
package controller;

import model.*;
public class Test1 {
 //proceso de venta

    static void pagar(formaPago pago){
        System.out.println("FORMA DE PAGO "+pago);   
    }
    
    public static void main(String[] args) {
      // formaPago pago1;   
//despues de verificar el producto y probar
// se decide el pago
       //pago1=new Efectivo(); 
       formaPago pago1=new Efectivo(150);
       pagar(pago1); 
       
       pago1=new TarjetaCredito(129.90);
        pagar(pago1);
       
       pago1=new Yape(2.5);
       pagar(pago1);
       
    }
    
    

    
}
