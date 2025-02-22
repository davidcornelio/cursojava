
package model;


public class formaPago {
 protected double monto;
 protected String formapago;
 
public formaPago(String formapago){
    
 this.formapago=formapago;
 monto=0.0;
} 

    @Override
    public String toString() {
        return "formaPago{" + "monto=" + monto + ", formapago=" + formapago + '}';
    }
 
 
 
 
}
