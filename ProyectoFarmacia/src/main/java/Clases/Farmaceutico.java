
package Clases;


public class Farmaceutico {
    //Atributos
    private String nombre;
    private String especialidad;
    private int edad;
    private double estatura;
    private int hora_trabajo;
    private char sexo;
    
    
    //metodo constructor
    public Farmaceutico(String nombre0, int edad0,double estatura0, char sexo0, String especialidad0, int hora_trabajo0){
        //Algoritmos
        nombre = nombre0;
        edad = edad0;
        estatura = estatura0;
        sexo = sexo0;
        especialidad = especialidad0;
        hora_trabajo = hora_trabajo0;
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
    public char getSexo(){
        return sexo;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public int getHoratrabajo(){
        return hora_trabajo;
    }
    //metodo modificador de objetos set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setEstatura(double newestatura){
        estatura = newestatura;
    }
    public void setSexo(char newsexo){
        sexo = newsexo;
    }
    public void setEspecialidad(String newespecialidad){
        especialidad = newespecialidad;
    }
    public void setHoratrabajo(int newhoratrabajo){
        hora_trabajo = newhoratrabajo;
    }
            
    
    
    
    
    
    
    
    public String toString(){
        return "nombre: "+nombre+"\n"+"edad: "+edad+"\n"+"estatura: "+estatura+"\n"+"sexo: "+sexo+"\n"+"especialidad: "+especialidad+"\n"+"hora de trabajo: "+hora_trabajo;
    }
}
