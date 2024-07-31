
package clases;


public class Jaula {
    //Encapsulamiento de atributos
    private String material;
    private int cantidad;
    private int separador;
    private int durabilidad;
    private String color;
    private double tamaño;
    
    //Metodo constructor
    public Jaula(String material0,String color0,double tamaño0, int separador0,int durabilidad0,int cantidad0){
        material = material0;
        color = color0;
        tamaño = tamaño0;
        separador = separador0;
        durabilidad = durabilidad0;
        cantidad = cantidad0;
    }
    //METODO GET
    public String getMaterial(){
        return material;
    }
    public String getColor(){
        return color;
    }
    public double getTamaño(){
        return tamaño;
    }
    public int getDivision(){
        return separador;
    }
    public int getDurable(){
        return durabilidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    //metodo modificador set
    public void setMaterial(String newmaterial){
        material = newmaterial;
    }
    public void setColor(String newcolor){
        color = newcolor;
    }
    public void setTamaño(double newtamaño){
        tamaño = newtamaño;
    }
    public void setDivision(int newdivision){
        separador = newdivision;
    }
    public void setDurable(int newdurable){
        durabilidad = newdurable;
    }
    public void setCantidad(int newcantidad){
        cantidad = newcantidad;
    }
    
}
