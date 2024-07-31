
package Clases;

/**
 *
 * @author RYZEN
 */
public class Doctor1 extends Empleado {
     // encapsulamiento de atributos
  
    //private String finalEstudio;
    //private double estatura;
    //private String dni;
    private String anosExperiencia;
    
    //metodo constructor
    public Doctor1(String nombre, int fechaNacimiento, int horaTrabajo, char genero, String dni,String anosExperiencia){
        super(nombre,fechaNacimiento, horaTrabajo, genero,dni);
        this.anosExperiencia = anosExperiencia;
        
        
        //this.dni=dni;
        //this.finalEstudio = finalEstudio;
    }

    public String getAñosExperiencia(){
        return anosExperiencia;
    }
    public void setAñosExperiencia(String nuevaExperiencia){
        this.anosExperiencia = nuevaExperiencia;
    }
    
    
    
}
