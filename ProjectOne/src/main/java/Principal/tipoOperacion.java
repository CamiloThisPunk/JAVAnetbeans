
package Principal;


public class tipoOperacion {
    Operaciones so = new Operaciones();
    //ProjectOne cl =  new ProjectOne();
    String suma;
    String multipllicacion;
    String division;
    String resta, seleccion;
  
    
   
    /*public void condicional(int a, int b){
    if (suma == seleccion){
         
        System.out.println(so.suma(a, b));
        
    }else if (resta == seleccion){
        System.out.println(so.resta(a, b));
    
    }*/
    
    
    public void condicional(int a, int b){
    if (suma == seleccion) System.out.println(so.suma(a, b));else System.out.println(" vete ");
         
        
        
    
    
    if (resta == seleccion) System.out.println(so.resta(a, b)); else System.out.println("fuera");
   
        
    }    
}
