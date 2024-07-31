
package Clases;

/**
 *
 * @author RYZEN
 */
public class Producto_Aseo extends Producto{
    //Atributos
    private String tipodeaplicacion;
    private String peso;
    
    /*public Producto_Aseo(String nombre, int fechadecreacion, int fechadecaducidad, int cantidad, int precio, String sabor, double tamaño){
        super(nombre,fechadecreacion,fechadecaducidad,cantidad,precio,sabor,tamaño);
    
    }*/
    public Producto_Aseo(String nombre, String fechadecreacion, String fechadecaducidad, int cantidad, double precio, String sabor, double tamaño,String aplicaciona,String peso){
        super(nombre,fechadecreacion,fechadecaducidad,cantidad,precio,sabor,tamaño);
        this.tipodeaplicacion = aplicaciona;  
        this.peso =  peso;    
    }

    
    
    
    public String getAplicacion(){
        return tipodeaplicacion;
    }
    public void setAplicacion(String newaplicacion){
        this.tipodeaplicacion = newaplicacion;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }
}
