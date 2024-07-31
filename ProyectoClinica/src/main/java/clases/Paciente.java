
package clases;


public class Paciente {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private String dni;
    private double estatura;
    private String especialidad;
    
    public Paciente(String nombre0, int edad0, String dni0, double estatura0, String especialidad0){
        // algoritmo
        nombre = nombre0;
        edad = edad0;
        dni = dni0;
        estatura = estatura0;
        especialidad = especialidad0;
    }
    
   
    
    //metodo get
    public String getNombre1(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
        
    }
    public String getDni(){
        return dni;
    }
    public double getEstatura(){
        return estatura;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setDni(String newdni){
        dni = newdni;
    }
    public void setEstatura(double newestatura){
        estatura = newestatura;
    }
    public void setEspecialidad(String newespecialidad){
        especialidad = newespecialidad;
    }
    
    
    
    public String toString(){
        return "nombre: "+nombre+"\n"+"edad: "+edad+"\n"+"dni: "+dni+"\n"+"estatura: "+estatura+"\n"+"especialidad: "+especialidad;
    }
}
