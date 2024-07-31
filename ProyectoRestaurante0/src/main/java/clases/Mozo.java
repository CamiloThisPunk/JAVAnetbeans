
package clases;


public class Mozo {
    //Encapsulamiento de atributos+
    private String nombre;
    private int edad;
    private double estatura;
    private char sexo;
    private String habilidad;
    
    //Metodo constructor
    public Mozo(String nombre0, char sexo0, int edad0,double estatura0,String habilidad0){
        nombre = nombre0;
        sexo = sexo0;
        edad = edad0;
        estatura = estatura0;
        habilidad = habilidad0;
    }
    //metodo get
    public String getName1(){
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
    public String getHabilidad(){
        return habilidad;
    }
    //metodo modificador set
    public void setName(String newname){
        nombre = newname;
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
    public void setHabilidad(String newhabilidad){
        habilidad = newhabilidad;
    }
    
    
    
    public String toString(){
        return "nombre: "+nombre+"\n"+"sexo: "+sexo+"\n"+"edad: "+edad+" años"+"\n"+"estatura: "+estatura+" metros"+"\n"+"tiene la habilidad de entrega: "+habilidad;
    }
}
