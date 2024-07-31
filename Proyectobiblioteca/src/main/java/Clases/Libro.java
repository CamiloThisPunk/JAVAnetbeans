
package Clases;


public class Libro {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private String materia;
    private String clave;
    private String diseño;
    
    //metodo constructor
    public Libro(String nombre0, int edad0, String materia0, String clave0, String diseño0){
        nombre = nombre0;
        edad = edad0;
        materia = materia0;
        clave = clave0;
        diseño = diseño0;
    }
    
    //metodo accesor get
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getMateria(){
        return materia;
    }
    public String getClave(){
        return clave;
    }
    public String getDiseño(){
        return diseño;
    }
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setMateria(String newmateria){
        materia = newmateria;
    }
    public void setClave(String newclave){
        clave = newclave;
    }
    public void setDiseño(String newdiseño){
        diseño = newdiseño;
    }
    
    
}
