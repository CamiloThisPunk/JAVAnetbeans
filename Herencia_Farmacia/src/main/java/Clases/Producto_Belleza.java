
package Clases;

/**
 *
 * @author RYZEN
 */
public class Producto_Belleza extends Producto{
    //ATRIBUTOS
    private String aplicacion;
    private String horaLavado;
    public Producto_Belleza(String nombre, String fechadecreacion, String fechadecaducidad, int cantidad, double precio, String sabor, double tamaño,String aplicacion,String horaLavado){
        super(nombre,fechadecreacion,fechadecaducidad,cantidad,precio,sabor,tamaño);
        this.aplicacion = aplicacion;
        this.horaLavado = horaLavado;
    }

    /**
     * @return the aplicacion
     */
    public String getAplicacion() {
        return aplicacion;
    }

    /**
     * @param aplicacion the aplicacion to set
     */
    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getHoraLavado() {
        return horaLavado;
    }

    public void setHoraLavado(String horaLavado) {
        this.horaLavado = horaLavado;
    }
    
    public void mostrarpantalla(){
        System.out.println("El nombre es : "+ getNombre() +
                "\ncreacion: " + getFechadecreacion() +
                "\nvencimiento: " + getFechadecaducidad() + 
                "\nla cantidades totales es: " + getCantidad()+
                "\nel precio del objeto es: " + getPrecio()+
                "\nel sabor que tienes es: "+ getSabor() +
                " \ny su tamaño es: " + getTamaño()+
                "\n las aplicaciones son en el: " + aplicacion +
                "\nlas horas o minutos de lavados son: " + horaLavado);
    }
    
}
