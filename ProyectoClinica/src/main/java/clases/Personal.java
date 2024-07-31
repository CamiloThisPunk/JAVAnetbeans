
package clases;


public class Personal {
    //encapsulacion de atributos 
    private String nombre;
    private int edad;
    private double estatura;
    private String especialidad;
    private int experiencia;
    
    public Personal(String nombre0, int edad0,double estatura0, String especialidad0,int experiencia0){
        nombre = nombre0;
        edad = edad0;
        estatura = estatura0;
        especialidad = especialidad0;
        experiencia = experiencia0;    
    }
    //metodo get
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getEstatura(){
        return estatura;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public int getExperiencia(){
        return experiencia;
    }
    //metodo mooificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setEstatura(double newestatura){
        estatura = newestatura;
    }
    public void setEspecialidad(String newespecialidad){
        especialidad = newespecialidad;
    }
    public void setExperiencia(int newexperiencia){
        experiencia = newexperiencia;
    }
}
