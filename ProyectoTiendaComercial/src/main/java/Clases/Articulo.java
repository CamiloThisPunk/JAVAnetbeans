
package Clases;


public class Articulo {
    
    //Atributos
    private double precioUnitario; //encapsulando el atributo precioUnitario
    private double descuento;
    private int cantidad;
    private String descripcion; //nombre
    private String id; //codigo
    
    //Metodos (en lo real se habla de interfaces: botoon)
    //metodo constructor(inicializar valores a los objetos con datos )
    public Articulo(String descripcion0,double precioUnitario0){
        //algoritmo
        descripcion = descripcion0;
        precioUnitario = precioUnitario0;
    }
    //NUEVO METODO  CONSTRUCTOR
    public Articulo(double precioUnitario0, double descuento0, int cantidad0, String descripcion0, String id0){
        
        precioUnitario = precioUnitario0;
        descuento = descuento0;
        cantidad = cantidad0;
        descripcion = descripcion0;
        id = id0;
    
    
    }
            
      
    
    
            
    //metodos accesores (get`^s).- nos permite obtener los valores de los atributos de un bojeto
    public String getId(){
        return this.id;
    }
    public String getDescripcion(){
        return this.descripcion;
     
    }
    public double getPreciounitario(){
        return precioUnitario;
    }
    public int getCantidad(){
        return cantidad;
    }
    public double getDescuento(){
        return descuento;
    }
    //metodos mutadores (set^s)
    //establecer o modificar 
    public void setId(String nuevocodigo){
        this.id = nuevocodigo;
    
    }
    public void setDescuento(double nuevoDescuento){
        this.descuento = nuevoDescuento;
    }
    public void setCantidad(int nuevacantidad){
        this.cantidad = nuevacantidad;
    }
    //metodos especiales

    public String toString(){ 
        return "descripcion: " + descripcion + "\n" + "precioUnitario: " + precioUnitario;
        
        
    }
}
