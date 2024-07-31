
package clases;


public class Recepcionista {
    //Encapsulamietno de atributos
    private String nombre;
    private String habilidad;
    private int experiencia;
    private char sexo;
    private int labor;
    
    //metodo constructor
    public Recepcionista(String nombre0,char sexo0,String habilidad0,int experiencia0, int labor0){
        nombre = nombre0;
        sexo = sexo0;
        habilidad = habilidad0;
        experiencia = experiencia0;
        labor = labor0;
        
    }
    //metodo get
    public String getNombre(){
        return nombre;
    }
    public char getSexo(){
        return sexo;
    }
    public String getHabilidad(){
        return habilidad;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public int getLabor(){
        return labor;
    }
    //metodo modificar set
    public void setNombre(String newname){
        nombre= newname;
    }
    public void setSexo(char newsexo){
        sexo = newsexo;
    }
    public void setHabilidad(String newhabilidad){
        habilidad = newhabilidad;
    }
    public void setExperiencia(int newexperiencia){
        experiencia = newexperiencia;
    }
    public void setLabor(int newlabor){
        labor = newlabor;
    }
}
