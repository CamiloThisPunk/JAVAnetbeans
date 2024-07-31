
package clases;


public class Maquina {
    //Encapsulamiento de atributos
    private String nombre;
    private String tipo;
    private String estado;
    private int durabilidad;
    private String color;
    
    //METODO CONSTRUCTOR
    public Maquina(String nombre0,String color0, String estado0, int durabilidad0,String tipo0){
        this.nombre = nombre0;
        this.color = color0;
        this.estado = estado0;
        this.durabilidad = durabilidad0;
        this.tipo = tipo0;
    }
    
    //metodo get
    public String getNombre(){
        return this.nombre;
    }
    public String getColor(){
        return this.color;
    }
    public String getEstado(){
        return this.estado;
    }
    public int getDurable(){
        return durabilidad;
    }
    public String getTipo(){
        return tipo;
    }
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setColor(String newcolor){
        color = newcolor;
    }
    public void setEstado(String newestado){
        estado = newestado;
    }
    public void setDurable(int newdurabilidad){
        durabilidad = newdurabilidad;
    }
    public void setTipo(String newtipo){
        tipo = newtipo;
    }
    
    
    
    public String toString(){
        
        return "nombre: "+ nombre + "\n"+"color: "+color+"\n"+"estado: "+estado +"\n"+"durabilidad: "+ durabilidad +"\n"+"tipo: "+tipo;
    }
}
    
    

