
package model;


public class ProductoFarmacia extends Productos {
    private String proveedor;

    public ProductoFarmacia(String proveedor, String nombre, double precio) {
        super(nombre, precio);
        this.proveedor = proveedor;
    }

    public ProductoFarmacia(String nombre, double precio) {
        super(nombre, precio);
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
  
    
    
    
    
}
