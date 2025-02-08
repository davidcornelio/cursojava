
import java.util.Scanner;
public class CURSO
{
  private int codigo_curso;
  private String nombre_curso;
  private String fecha_inicio;
    
   public void registrarcurso(int cod,String nom,String fecin){
   codigo_curso=cod;
   nombre_curso=nom;
   fecha_inicio=fecin;
          
   }  
    
    public void modificarfecha(String fech){
     fecha_inicio=  fech;
   }
   
   public String mostrarnuevafecha(){
       
       return fecha_inicio;
   }
   public void mostrardatoscurso(){
    
   System.out.println("codigo    :"+codigo_curso);   
   System.out.println("nombre curso    :"+nombre_curso);
   System.out.println("fecha inicio    :"+fecha_inicio);
      
   }
   
   
    
}
