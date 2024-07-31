
package Clases;


public class Lector {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String profesion;
    private double estatura;
    
    //metodo constructor
    public Lector(String nombre0, int edad0, char sexo0, String profesion0, double estatura0){
        nombre = nombre0;
        edad = edad0;
        sexo = sexo0;
        profesion = profesion0;
        estatura = estatura0;
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
    public String getProfesion(){
        return profesion;
    }
    public double getEstatura(){
        return estatura;
    }
    //metodo set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setSexo(char newsexo){
        sexo = newsexo;
    }
    public void setProfesion(String newprofesion){
        profesion = newprofesion;
    }
    public void setEstatura(double newestatura){
        estatura = newestatura;
    }
}
