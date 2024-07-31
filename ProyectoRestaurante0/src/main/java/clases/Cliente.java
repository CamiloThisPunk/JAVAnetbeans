
package clases;


public class Cliente {
    //Encapsulamiento de atributos
    private String nombre;
    private int edad;
    private String profesion;
    private char sexo;
    private String estadosocial;
    private String preferencia;
    
    //Metodo constructor
    public Cliente(String nombre0, int edad0, char sexo0, String profesion0, String estadosocial0,String gusto0 ){
        
        nombre = nombre0;
        edad = edad0;
        sexo = sexo0;
        profesion = profesion0;
        estadosocial = estadosocial0;
        preferencia = gusto0;
    }
    //METODO GET
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
    public String getClasesocial(){
        return estadosocial;
    }
    public String getGusto(){
    return preferencia;
    }
    //metodo modificar set
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
    public void setClasesocial(String newclasesocial){
        estadosocial = newclasesocial;
    }
    public void setPreferencia(String newpreferencia){
        preferencia = newpreferencia;
    }
}
