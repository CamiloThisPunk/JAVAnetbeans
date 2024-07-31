
package clases;


public class Visitante {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private char genero;
    private String lugarvisita;
    private String habilidad;
    private String profesion;
    
    
    //metodo constructor
    public Visitante(String nombre0,int edad0,char genero0,String lugarvisita0,String habilidad0,String profesion0 ){
        
        nombre = nombre0;
        edad = edad0;
        genero = genero0;
        lugarvisita = lugarvisita0;
        habilidad = habilidad0;
        profesion = profesion0;
        
    }
    //metodo get
    /*public String getNombre2(){
        return this.nombre;
    }
    public String getHabilidad2(){
        return this.habilidad;
    }*/
    //metodo get
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public char getGenero(){
        return genero;
    }
    public String getLugarvisita(){
        return lugarvisita;
    }
    public String getHabilidad(){
        return habilidad;
    }
    public String getProfesion;
    
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre= newnombre;
    }
    public void setHabilidad(String newhabilidad){
        habilidad = newhabilidad;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setGenero(char newgenero){
        genero = newgenero;
    }
    public void setLugarvisita(String newlugarvisita){
        lugarvisita = newlugarvisita;
    }
    public void setProfesion(String newprofesion){
        profesion = newprofesion;
    }
    
    
    
    public String toString(){
        return "nombre: "+nombre+"\n"+"edad: "+edad+" años"+"\n"+"genero: "+genero+"\n"+"lugar de visita: "+lugarvisita+"\n"+"habilidad: "+habilidad+" a simple vista"+"\n"+"profesion: "+profesion; 
        
    }
}
