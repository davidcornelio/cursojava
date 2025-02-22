
package model;


public class ClienteJuridico extends Cliente {
private String RUC;
private String DNI_repre_legal;
private String nombre_repre_legal;

    public ClienteJuridico(String RUC, String DNI_repre_legal, String nombre_repre_legal, String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
        this.RUC = RUC;
        this.DNI_repre_legal = DNI_repre_legal;
        this.nombre_repre_legal = nombre_repre_legal;
    }

    public ClienteJuridico(String RUC, String DNI_repre_legal, String nombre_repre_legal, String nombre, double capacidad_compra, String domicilio, String email, int a�o_inscrip) {
        super(nombre, capacidad_compra, domicilio, email, a�o_inscrip);
        this.RUC = RUC;
        this.DNI_repre_legal = DNI_repre_legal;
        this.nombre_repre_legal = nombre_repre_legal;
    }

    

  



}
