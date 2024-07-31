
package Clases;

/**
 *
 * @author RYZEN
 */
public class Cocinero1 extends Trabajador1{
    //atributos
    private int añosExperiencia;
    private String especialidad;
    //private String[] experienciaLaboral;

    
    
    public Cocinero1(String nombre0, int fechaNacimiento0,String dni0, String direccion0, String numeroTelefono, int añosExperiencia0,String especialidad0 ){
        super(nombre0, fechaNacimiento0, dni0, direccion0, numeroTelefono);
        añosExperiencia = añosExperiencia0;
        especialidad = especialidad0;
        //experienciaLaboral = experienciaLaboral0; 
       
    
    }

    /**
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    /*public String[] getExperienciaLaboral() {
        return experienciaLaboral;
    }

    /**
     * @param experienciaLaboral the experienciaLaboral to set
     */
    /*public void setExperienciaLaboral(String[] experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }*/
    
     
    
}
