
package Clases;

/**
 *
 * @author RYZEN
 */
public class Enfermera1 extends Empleado {
    //Atributos
    private String valor;
    public Enfermera1(String nombre, int fechaNacimiento, int horaTrabajo, char genero, String dni,String valor){
        super(nombre,fechaNacimiento,horaTrabajo,genero,dni);
        this.valor = valor;
    
    }
    public String getValor(){
        return valor;
    }
    public void setValor(String newValor){
        this.valor = newValor;
    }
    
    
    }
    
    

