
package model;
//clase para gestionar a las personas naturales como com�entes
//clientenatural sera hija de cliente
//clientenatural es sub clase de la super clase cliente
//clientenatural proviene de cliente
public class ClienteNatural extends Cliente {

    private String DNI;
    
    public ClienteNatural(String DNI,String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
        this.DNI=DNI;
    }
    
    public ClienteNatural(String DNI,String nombre, double capacidad_compra,String domicilio,String email, int a�o_inscrip) {
        super(nombre, capacidad_compra,domicilio,email,a�o_inscrip);
        this.DNI=DNI;
        this.a�o_inscrip=2010;
    }
    public int getAntiguedad(){
     return 2025-a�o_inscrip;   
    }  

    @Override
    public String toString() {
        return "ClienteNatural{" + "DNI=" + DNI + '}';
    }
    
    
    
    
}
