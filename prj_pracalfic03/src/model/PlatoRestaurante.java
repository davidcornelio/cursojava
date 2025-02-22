/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class PlatoRestaurante extends Productos {
private String tipodeplato;

    public PlatoRestaurante(String tipodepalto, String nombre, double precio) {
        super(nombre, precio);
        this.tipodeplato = tipodepalto;
    }
    public PlatoRestaurante(String nombre, double precio) {
        super(nombre, precio);
    }

    public String getTipodeplato() {
        return tipodeplato;
    }

    public void setTipodeplato(String tipodeplato) {
        this.tipodeplato = tipodeplato;
    }
   
    
    
    
}
