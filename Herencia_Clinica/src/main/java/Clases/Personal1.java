
package Clases;

/**
 *
 * @author RYZEN
 */
public class Personal1 extends Empleado {
    //Atributos
    private String estadoCivil;
    
    public Personal1(String nombre, int fechaNacimiento, int horaTrabajo, char genero, String dni,String estadoCivil){
      super(nombre,fechaNacimiento,horaTrabajo,genero,dni);
      this.estadoCivil = estadoCivil;
       
     
    }
    public String getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(String newCivil){
        estadoCivil = newCivil;
    }
   
    
    }
    

