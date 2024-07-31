
package clases;


public class Comida {
    //Encapsulamiento de atributos
    private String nombre;
    private String ingrediente;
    private String sabor;
    private String olor;
    private String estado;
    
    //metodo constructor
    public Comida(String nombre0, String ingrediente0,String sabor0, String olor0, String estado0){
        nombre = nombre0;
        ingrediente = ingrediente0;
        sabor = sabor0;
        olor = olor0;
        estado = estado0;
        
    }
    
    //metodo get
    public String getNombre(){
        return nombre;
    }
    public String getIngrediente(){
        return ingrediente;
    }
    public String getSabor(){
        return sabor;
    }
    public String getOlor(){
        return olor;
    }
    public String getEstado(){
        return estado;
    }
   
   //metodo modificar set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setIngrediente(String newingrediente){
        ingrediente = newingrediente;
    }
    public void setSabor(String newsabor){
        sabor = newsabor;
    }
    public void setOlor(String newolor){
        olor = newolor;
    }
    public void setEstado(String newestado){
        estado = newestado;
    }
}
