
/**
 * Write a description of class TEST here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TEST
{
    public static void main(String X[]){
    //definicion/creacion de objeto
    //nombre_clase nombre_objeto
    Alumno alum1;
    //inicializar el objeto(darle un espacio en memoria)
    //opcionalmente darle valores iniciales
    alum1=null ;// es nada, no tiene asignado espacio en memoria
    
    //...muchas lineas adelante recien se requiere llenar datos
    alum1=new Alumno();//asignación de espacio en memoria
    
    // recien se puede usar el objerto alum1
    alum1.registraralumno(12345,"TELLO","ANGIE",4);
   //VERIFICAMOS
   alum1.mostrarcarnet();
    
    }
    
}
