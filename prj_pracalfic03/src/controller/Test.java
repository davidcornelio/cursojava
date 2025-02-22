
package controller;

import model.*;
public class Test {
    public static void main(String[] args) {
        
   Productos p1=new Productos("",0.0);     
        
  // ProductoFerrreteria pfe1=new ProductoFerrreteria();     
   ProductoFerrreteria pfe1=new ProductoFerrreteria("ABC123","CANDADO",125.8);
  // ProductoFarmacia pfa1=new ProductoFarmacia(); 
  
        System.out.println("CODIGO "+pfe1.getCodigo()+"NOMBRE "+pfe1.getNombre()+" PRECIO "+pfe1.getPrecio());
  
  ProductoFarmacia pfa1=new ProductoFarmacia("abcquimica","panadol",1.0);
   //PlatoRestauarante plato1=new PlatoRestauarante();
    System.out.println("PROVEEDOR "+pfa1.getProveedor()+"NOMBRE "+pfe1.getNombre()+" PRECIO "+pfe1.getPrecio());
   PlatoRestaurante plato1=new PlatoRestaurante("A LA CARTA","arroz con pollo",125.69);
   
    System.out.println("TIPO DE PLATO "+plato1.getTipodeplato()+"NOMBRE "+pfe1.getNombre()+" PRECIO "+pfe1.getPrecio()); 
    
    }
 
}
