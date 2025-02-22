
package model;


public class TarjetaCredito extends formaPago {
 private int cantCuotas;
 private String nu_tarjeta;
public TarjetaCredito(double monto){
    super("TARJETA DE CREDITO");
    cantCuotas=1;
    nu_tarjeta="";
    this.monto=monto;
}    

    public String getNu_tarjeta() {
        return nu_tarjeta;
    }

    public void setNu_tarjeta(String nu_tarjeta) {
        this.nu_tarjeta = nu_tarjeta;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
    
}
