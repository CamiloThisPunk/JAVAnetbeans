
package Clases;

/**
 *
 * @author RYZEN
 */
public class Producto {
    //Encapsulamiento de atributos
    private String  nombre;
    private String fechadecreacion;
    private String fechadecaducidad;
    private int cantidad;
    private double precio;
    private String sabor;
    private double tamaño;
    
    //Metodo constructor

    public Producto(String nombre, String fechadecreacion, String fechadecaducidad, int cantidad, double precio, String sabor, double tamaño) {
        this.nombre = nombre;
        this.fechadecreacion = fechadecreacion;
        this.fechadecaducidad = fechadecaducidad;
        this.cantidad = cantidad;
        this.precio = precio;
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechadecreacion
     */
    public String getFechadecreacion() {
        return fechadecreacion;
    }

    /**
     * @param fechadecreacion the fechadecreacion to set
     */
    public void setFechadecreacion(String fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }

    /**
     * @return the fechadecaducidad
     */
    public String getFechadecaducidad() {
        return fechadecaducidad;
    }

    /**
     * @param fechadecaducidad the fechadecaducidad to set
     */
    public void setFechadecaducidad(String fechadecaducidad) {
        this.fechadecaducidad = fechadecaducidad;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the tamaño
     */
    public double getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
