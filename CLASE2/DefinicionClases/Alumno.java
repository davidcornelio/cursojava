
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
   private int cod_alum;
   private String apellido;
   private String nombre;
   private String DNI;
   private String especialidad;
   private String fec_nacim;
   private String fec_inscrio;
   private int año_estudios;
  
   public void registraralumno(int cod,String ape,String nom,int año_est){
   cod_alum=cod;
   apellido=ape;
   nombre=nom;
   año_estudios=año_est;
       
   }
   
   public int obtenerañoestudios(){
       return año_estudios;
   }
   
   public void mostrarcarnet(){
    
   System.out.println("codigo    :"+cod_alum);   
   System.out.println("apellido    :"+apellido);
   System.out.println("nombre    :"+nombre);
   System.out.println("año estudio    :"+año_estudios);   
   }
   
  /*public int obtenerañoestudios(){
   return año_estudios;   
  }
*/   
   
   
   
   
   
}
//metodos o operaciones
