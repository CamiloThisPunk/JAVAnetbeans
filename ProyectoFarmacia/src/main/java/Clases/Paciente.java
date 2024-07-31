
package Clases;


public class Paciente {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private String dni;
    private double estatura;
    private String profesion;
    private char sexo;
    
    //Metodo constuctor
    public Paciente(String nombre0, int edad0,char sexo0,double estatura0,String profesion0,String dni0){
        nombre = nombre0;
        edad = edad0;
        sexo = sexo0;
        estatura = estatura0;
        profesion = profesion0;
        dni = dni0;
    }
    // metodo obtener get
    public String getNombre(){
            return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public char getSexo(){
        return sexo;
    }
    public double getEstatura(){
        return estatura;
    }
    public String getProfesion(){
            return profesion;
    }
    public String getDni(){
        return dni;
    }
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setSexo(char newsexo){
        sexo = newsexo;
    }
    public void setEstatura(double newestatura){
        estatura = newestatura;
    }
    public void setProfesion(String newprofesion){
        profesion = newprofesion;
    }
    public void setDni(String newdni){
        dni = newdni;
    }
    //metodo para imprimir objetos
   public String toString(){
       return "nombre: "+nombre+"\n"+"edad: "+edad+" años"+"\n"+"sexo: "+sexo+"\n"+"estatura: "+estatura+" metros"+"\n"+"profesion: "+profesion+"\n"+"dni: "+dni;
   }
}
