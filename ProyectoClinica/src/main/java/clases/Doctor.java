
package clases;


public class Doctor {
    // encapsulamiento de atributos
    private String nombre;
    private int edad;
    private String especialidad;
    private double estatura;
    private String dni;
    
    public Doctor(String nombre0, int edad0,String dni0, String especialidad0, double estatura0 ){
        nombre  = nombre0;
        edad = edad0;
        dni = dni0;
        especialidad =  especialidad0;
        estatura = estatura0;   
        
}
    public String getNombre(){
        return this.nombre;
    
    }
    public String getJob(){
        return this.especialidad;
    }
    public double getEstarura(){
        return this.estatura;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getDni(){
        return this.dni;
    }
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setJob(String newjob){
        especialidad = newjob;
    }
    public void setEstatura(double newestatura){
        estatura = newestatura;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setDni(String newdni){
        dni = newdni;
    }
    
    
    
    
    
    public String toString(){
        return"nombre: "+ nombre +"\n"+"edad: "+ edad +"\n" +"dni: "+dni+"\n"+"especialidad: "+especialidad +"\n"+"estatura: "+estatura;  
    }
}
