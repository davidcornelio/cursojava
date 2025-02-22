
package model;


public class Efectivo extends formaPago {
 private String tipomoneda;//dolares o soles
    
 
 public Efectivo( double monto){
     super("PAGO EN EFECTIVO");
     tipomoneda="soles";
     this.monto=monto;
 }

    public String getTipomoneda() {
        return tipomoneda;
    }

    public void setTipomoneda(String tipomoneda) {
        this.tipomoneda = tipomoneda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
 
 
    
}
