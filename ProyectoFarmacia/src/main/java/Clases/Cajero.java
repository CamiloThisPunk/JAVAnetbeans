
package Clases;


public class Cajero {
    //Encapsulamiento de atributos
    private String color;
    private String material;
    private int contraseña;
    private int separador;
    private double tamaño;
    
    //metodo constructor 
    public Cajero(String color0, String material0, int separador0, int contraseña0, double tamaño0 ){
        color = color0;
        material = material0;
        separador = separador0;
        contraseña = contraseña0;
        tamaño = tamaño0;    
    }
    
    //METODO get
    public String getColor(){
        return color;
    }
    public String getMaterial(){
        return material;
    }
    public int getDivision(){
        return separador;
    }
    public int getPassword(){
        return contraseña;
    }
    public double getTamaño(){
        return tamaño;
    }
    //metodo modifficador set
    public void setColor(String newcolor){
        color = newcolor;
    }
    public void setMaterial(String newmaterial){
        material = newmaterial;
    }
    public void setDivision(int newdivision){
        separador = newdivision;
    }
    public void setPassword(int newpassword){
        contraseña = newpassword;
    } 
    public void setTamaño(double newtamaño){
        tamaño = newtamaño;
    }
}
