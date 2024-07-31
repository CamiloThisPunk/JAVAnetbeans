
package clases;


public class Cocinero {
    //ENCAPSULAMIENTO DE ATRIBUTOS
    private String nombre;
    private char sexo;
    private int edad;
    private String especialidad;
    private double estatura;
    private String color_ropa;
    
    //Metodo constructor
    public Cocinero(String nombre0, char sexo0,int edad0,double estatura0,String color_ropa0, String especialidad0){
        nombre = nombre0;
        sexo = sexo0;
        edad = edad0;
        estatura = estatura0;
        color_ropa = color_ropa0;
        especialidad = especialidad0;
    }
    public String getName(){
        return this.nombre;
    }
    public char getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public double getEstatura(){
        return estatura;
    }
    public String getColor_ropa(){
        return color_ropa;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    //metodo modificar set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setSexo(char newsexo){
        sexo = newsexo;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setEstatura(double newestatura){
        estatura = newestatura;
    }
    public void setColorropa(String newcolorropa){
        color_ropa  = newcolorropa;
    }
    public void setEspecialidad(String newespecialidad){
        especialidad = newespecialidad;
    }
    
    
    
    
    
    
    
    
    
    public String toString(){
        return "nombre: "+nombre+"\n"+"sexo: "+sexo+"\n"+"edad: "+edad+" años"+"\n"+"estatura: "+estatura+" metros"+"\n"+"color_ropa: "+color_ropa+"\n"+"especialidad: "+especialidad;
    }
    
}
