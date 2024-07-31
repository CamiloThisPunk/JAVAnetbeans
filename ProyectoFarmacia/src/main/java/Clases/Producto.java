
package Clases;


public class Producto {
    //Encapsulamiento de atributos
    private String  nombre;
    private int fechadecreacion;
    private int fechadecaducidad;
    private int cantidad;
    private int precio;
    private String sabor;
    private double tamaño;
    
    public Producto(String nombre0,int precio0,String sabor0, int cantidad0,int fechadecreacion0,int fechadecaducidad0, double tamaño0){
        
        nombre = nombre0;
        precio = precio0;
        sabor = sabor0;
        cantidad = cantidad0;
        fechadecreacion = fechadecreacion0;
        fechadecaducidad = fechadecaducidad0;
        precio = precio0;   
    }
    
    //metodo obtenener get
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public String getSabor(){
        return sabor;
    }
    public int getCantidad(){
    return cantidad;
    }
    public int getFechadecreacion(){
        return fechadecreacion;
    }
    public double getTamaño(){
        return tamaño;
    }
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setPrecio(int newprecio){
        precio = newprecio;
    }
    public void setSabor(String newsabor){
        sabor = newsabor;
    }
    public void setCantidad(int newcantidad){
        cantidad = newcantidad;
    }
    public void setFechadecreacion(int newfechadecreacion){
        fechadecreacion = newfechadecreacion;
    }
    public void setTamaño(double newtamaño){
        tamaño = newtamaño;
    }
     
    
    
}
