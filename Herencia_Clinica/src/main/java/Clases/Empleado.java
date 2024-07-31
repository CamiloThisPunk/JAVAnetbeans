
package Clases;

/**
 *
 * @author RYZEN
 */
public class Empleado {
    //Atributos
    private String nombre;
    private int fechaNacimiento;
    private int horaTrabajo;
    private char genero;
    private String dni;

    public Empleado(String nombre, int fechaNacimiento, int horaTrabajo, char genero, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.horaTrabajo = horaTrabajo;
        this.genero = genero;
        this.dni = dni; 
       
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
     * @return the horaTrabajo
     */
    public int getHoraTrabajo() {
        return horaTrabajo;
    }

    /**
     * @param horaTrabajo the horaTrabajo to set
     */
    public void setHoraTrabajo(int horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
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
    
    
    
}
