
package Clases;

/**
 *
 * @author RYZEN
 */
public class Personal1 {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String especialidad;
    private String herramienta;
    private String vestimenta;
    
    //metodo constructor
    public Personal1(String nombre0, int edad0,char sexo0,String especialidad0,String herramienta0,String vestimenta0){
        nombre = nombre0;
        edad = edad0;
        sexo = sexo0;
        especialidad = especialidad0;
        herramienta = herramienta0;
        vestimenta = vestimenta0;
        
    }
    //METODO GET
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public char getSexo(){
        return sexo;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public String getHerramienta(){
        return herramienta;
    }
    public String getVestimenta(){
        return vestimenta;
    }
    //metodo modificar set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setSexo(char newsexo){
        sexo = newsexo;
    }
    public void setEspecialidad(String newespecialidad){
        especialidad = newespecialidad;
    }
    public void setHerramienta(String newherramienta){
        herramienta = newherramienta;
    }
    public void setVestimenta(String newvestimenta){
        vestimenta =  newvestimenta;
    }
    
    
}
