
package clases;

/**
 *
 * @author RYZEN
 */
public class Diagnostico {
    //Atributos
    
    private String resultado;
    private String nombre;
    private String analisis;
    private String examen;
    private String contexto;
        
        public Diagnostico(String nombre0, String analisis0, String examen0, String contexto0, String resultado0){
            
            
            nombre = nombre0;
            analisis = analisis0;
            examen = examen0;
            contexto = contexto0;
            resultado = resultado0;
        }
        //metodo get
        public String getNombre(){
            return this.nombre;
        }
        public String getResulatado(){
            return resultado;
        }
        public String getAnalilsis(){
            return analisis;
        }
        public String getContexto(){
            return contexto;
        }
        public String getExamen(){
            return examen;
        }
        //metodo set
        public void setNombre(String newnombre){
            nombre = newnombre;
        }
        public void setResultado(String newresultado){
            resultado = newresultado;
        }
        public void setAnalisis(String newanalisis){
            analisis = newanalisis;
        }
        public void setContexto(String newcontexto){
            contexto = newcontexto;
        }
        public void setExamen(String newexamen){
            examen = newexamen;
        }
        
        //metodo toString para imprimir objetos...
        public String toString(){
            return "nombre:" + nombre+ "\n"+ "analisis: " + analisis+ "\n"+"contexto: " + contexto+"\n"+ "examen: "+examen+"\n"+"resultado: "+resultado;
         }
        
        
    
}
