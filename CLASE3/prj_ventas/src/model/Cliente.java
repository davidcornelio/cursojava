
package model;

//cliente no puede instanciarse por ser abstracto
     //el fin de cliente es ser modelo para otro tipo de cliente
public abstract class Cliente {

private String nombre;
private double capacidad_compra;
private String domicilio;
private String email;
protected int año_inscrip;


    public Cliente(String nombre, double capacidad_compra) {
        this.nombre = nombre;
        this.capacidad_compra = capacidad_compra;
    }

  public Cliente(String nombre, double capacidad_compra, String domicilio,String email,int año_inscrip) {
        this.nombre = nombre;
        this.capacidad_compra = capacidad_compra;
        this.domicilio = "SIN DATO";
        this.email = "SIN DATO";
         this.año_inscrip=0;
    } 

    public int getAño_inscrip() {
        return año_inscrip;
    }

    public void setAño_inscrip(int año_inscrip) {
        this.año_inscrip = año_inscrip;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad_compra() {
        return capacidad_compra;
    }

    public void setCapacidad_compra(double capacidad_compra) {
        this.capacidad_compra = capacidad_compra;
    }
//definir una salida 

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", capacidad_compra=" + capacidad_compra + ", domicilio=" + domicilio + ", email=" + email + ", a\u00f1o_inscrip=" + año_inscrip + '}';
    }

    
   







    
}
