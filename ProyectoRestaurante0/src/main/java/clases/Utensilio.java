
package clases;


public class Utensilio {
    //Encapsulamiento de atributos
    private String nombre;
    private String color;
    private String tipo;
    private double tamaño;
    private String material;
    
    //Metodo constructor
    public Utensilio(String nombre0, String material0,double tamaño0,String color0,String tipo0){
        
        nombre = nombre0;
        material = material0;
        tamaño = tamaño0;
        color = color0;
        tipo = tipo0;
    }
    
    //metodo get
    public String getNombre(){
        return nombre;
    }
    public String getMaterial(){
        return material;
    }
    public double getTamaño(){
        return tamaño;
    }
    public String getColor(){
        return color;
    }
    public String getTipo(){
        return tipo;
    }
    //METODO MODIFICADOR SET
    public void setNombre(String newname){
        nombre = newname;
    }
    public void setMaterial(String newmaterial){
        material = newmaterial;
    }
    public void setTamaño(double newtamaño){
        tamaño = newtamaño;
    }
    public void setColor(String newcolor){
        color = newcolor;
    }
    public void setTipo(String newtipo){
        tipo = newtipo;
    }
}
