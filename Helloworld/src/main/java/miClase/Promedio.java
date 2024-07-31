
package miClase;

public class Promedio {
    //Atributos
    private String alumno;
    private int n1;
    private int n2;

   

    
    

    /**
     * @return the alumno
     */
    public String getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    /*public int getN1(){
        return n1;
    }*/
   //calculando el promedio
    public double calculaPromedio(){
        return (getN1()+ getN2())/2.0;
    }
    
    //determinar el estado
    public String determinaCondicion(){
        if(calculaPromedio()>= 12.5){
            return "APROBADO";
        }
        
        else{
            return "DESAPROBADO";
        }
        
            
        
    }
    
}
