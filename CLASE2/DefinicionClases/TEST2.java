
import java.util.Scanner;
public class TEST2
{
    
   public static void main(String X[]){
    //definicion/creacion de objeto
    //nombre_clase nombre_objeto
    CURSO cur1;
    //inicializar el objeto(darle un espacio en memoria)
    //opcionalmente darle valores iniciales
    cur1=null ;// es nada, no tiene asignado espacio en memoria
    
    //...muchas lineas adelante recien se requiere llenar datos
    cur1=new CURSO();//asignación de espacio en memoria
    Scanner dato=new Scanner(System.in);
    // recien se puede usar el objerto alum1
    cur1.registrarcurso(12345,"JAVA","05/03/25");
   //VERIFICAMOS
   cur1.mostrardatoscurso();
   cur1.modificarfecha("8/02/2025") ;
    cur1.mostrardatoscurso();
    cur1.modificarfecha(dato.nextLine()) ;
    System.out.println("LA NUEVA FECHA ES "+cur1.mostrarnuevafecha());
    }
     
    
}
