
package clases;


public class Vehiculo {
    //encapsulacion de atributos
    private String modelo;
    private String marca;
    private String color;
    private String nombre;
    private String placa;
    
    //metodo constructor
    public Vehiculo(String nombre0, String marca0, String modelo0, String color0, String placa0){
        nombre = nombre0;
        marca = marca0;
        modelo = modelo0;
        color = color0;
        placa = placa0;
    }
    
    //metodos get
    public String getNombre(){
        return nombre;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public String getPlaca(){
        return placa;
    }
    //metodo modificador  set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setMarca(String newmarca){
        marca = newmarca;
    }
    public void setModelo(String newmodelo){
        modelo = newmodelo;
    }
    public void setColor(String newcolor){
        color = newcolor;
    }
    public void setPlaca(String newplaca){
        placa = newplaca;
    }
    
}
