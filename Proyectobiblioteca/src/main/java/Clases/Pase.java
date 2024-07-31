
package Clases;


public class Pase {
    //Encapsulamiento de atributos
    private String persona;
    private String datos_personales;
    private int tiempoVigente;
    
    //metodo constructor
    public String getPersona(){
        return persona;
    }
    public String getDatos_personales(){
        return datos_personales;
    }
    public int getTimeViget(){
        return tiempoVigente;
    }
    
   //metodo modificador set
    public void setPersona(String newpersona){
        persona = newpersona;
    }
    public void setConfidencial(String newdatos){
        datos_personales = newdatos;
    }
    public void setTiempovigente(int newtiempovigente){
        tiempoVigente = newtiempovigente;
    }
}
