
package Class;

/**
 *
 * @author RYZEN
 */
public class Operando {
    public String suma = "suma";
    public String resta = "resta";
    public String multiplicacion = "multiplicacion";
    public String division = "division";
    private int operando1;
    private int operando2;
    String select;
    
    
    //CONSTRUCTOR
    public Operando(){
    }
    
    public Operando(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    //METODOS
    public int suma(){
        return operando1 + operando2;
    }
    public int resta(){
        return operando1 - operando2;
    }
    public int multiplicacion(){
        return operando1 * operando2;
    }
    
    public double division(){
        return (double)operando1 / (double)operando2;
    
    }
    // GET y SET
    
    public int getOperando1(){
        return operando1;
     
    }
    public int getOperando2(){
        return operando2;
    }
    
    
    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }
    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }
    
    
    
    
    
    
   
}
