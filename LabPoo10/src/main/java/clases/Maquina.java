
package clases;


public class Maquina {
    private String color;
    private String tamaño;
    private int cantidad;
    private String licencia;

    public Maquina(String color, String tamaño, int cantidad, String licencia) {
        this.color = color;
        this.tamaño = tamaño;
        this.cantidad = cantidad;
        this.licencia = licencia;
    }
    
    public String getColor(){
        return color;
    
    }
    public String getTamaño(){
        return tamaño;
    }
    public int getCantidad(){
        return cantidad;
    
    }
    public String getlicencia(){
        return licencia;
    }
    
   
}