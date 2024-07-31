
package Clases;

/**
 *
 * @author RYZEN
 */
public class Trabajador1 {
    //atributos
    private String nombre;
    private int fechaNacimiento;
    private String dni;
    private String direccion;
    private String numeroTelefono;
    //private double estatura;
    //private String especialidad;

    public Trabajador1(String nombre0, int fechaNacimiento0,String dni0, String direccion0, String numeroTelefono) {
        this.nombre = nombre0;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni0;
        this.direccion = direccion0;
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaNacimiento
     */
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the numeroTelefono
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * @param numeroTelefono the numeroTelefono to set
     */
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    

   
    
    
}
