
package Clases;


public class Persona {
    private String nombre;
    private int fechaNacimiento;
    private char genero;
    private String estadoFisico;

    public Persona(String nombre, int fechaNacimiento, char genero, String estadoFisico) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoFisico = estadoFisico;
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
     * @return the estadoFisico
     */
    public String getEstadoFisico() {
        return estadoFisico;
    }

    /**
     * @param estadoFisico the estadoFisico to set
     */
    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }
    
    
    
    
}
