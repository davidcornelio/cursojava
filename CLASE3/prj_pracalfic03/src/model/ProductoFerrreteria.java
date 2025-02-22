
package model;


public class ProductoFerrreteria extends Productos {

    private String codigo;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public ProductoFerrreteria(String nombre, double precio) {
        super(nombre, precio);
    }

    public ProductoFerrreteria(String codigo, String nombre, double precio) {
        super(nombre, precio);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
  
    
    
    
    
}
