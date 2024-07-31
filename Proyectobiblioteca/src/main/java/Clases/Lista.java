
package Clases;


public class Lista {
    //Encapsulamiento de atributos
    private String alumno;
    private String requisito;
    private int tiempo_entrega;
    
    
    //metodo constructor
    public Lista(String alumno0, String requisito0, int tiempo_entrega0){
        alumno = alumno0;
        requisito = requisito0;
        tiempo_entrega = tiempo_entrega0;
    }
    //metodo accesor get
    public String getAlumno(){
        return alumno;
    }
    public String getRequisito(){
        return requisito;
    }
    public int getPlazo(){
        return tiempo_entrega;
    }
    //metodo modificador set
    public void setAlumno(String newalumno){
        alumno = newalumno;
    }
    public void setrequisito(String newrequisito){
        requisito = newrequisito;
    }
    public void setPlazo(int newplazo){
        tiempo_entrega = newplazo;
    }
    
  
    
}
