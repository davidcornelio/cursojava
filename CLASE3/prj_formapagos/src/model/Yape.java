
package model;


public class Yape extends formaPago {
 private String num_telefono;
 
 public Yape(double monto){
   super("PAGO POR YAPE");
   num_telefono="";
   this.monto=monto;
     
 }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
 
 
 
}
