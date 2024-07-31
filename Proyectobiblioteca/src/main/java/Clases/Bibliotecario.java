
package Clases;


public class Bibliotecario {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String especialidad;
    private int hora_trabajo;
    
    //metodo constructor
    public Bibliotecario(String nombre0, int edad0, char sexo0, String especialidad0, int hora_trabajo0){
        nombre = nombre0;
        edad = edad0;
        sexo = sexo0;
        especialidad = especialidad0;
        hora_trabajo = hora_trabajo0;
        
    }
    //metodo accesor get
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
    public int getHoraTrabajo(){
        return hora_trabajo;
    }
    //metodo set
    public void setNombre(String nombre0){
        nombre = nombre0;
    }
    public void setEdad(int edad0){
        edad = edad0;
    }
    public void setSexo(char sexo0){
        sexo = sexo0;
    }
    public void setEspecialidad(String newespecialidad){
        especialidad = newespecialidad;
    }
    public void setHoratrabajo(int newhoratrabajo){
        hora_trabajo = newhoratrabajo;
    }
}
