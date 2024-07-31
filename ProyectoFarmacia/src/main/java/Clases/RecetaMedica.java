
package Clases;


public class RecetaMedica {
    //encapsulamiento de atributos
    private String nombre;   
    private int fecha;
    private String centrodesalud;
    private String medicamento;
    private String indicacion;
    
    public RecetaMedica(String nombre0, int fecha0, String centrodesalud0,String medicamento0, String indicacion0){
        
        nombre = nombre0;
        fecha = fecha0;
        centrodesalud = centrodesalud0;
        medicamento = medicamento0;
        indicacion  = indicacion0;
    }
    
    //METODO GET OBTENER
    public String getNombre(){
        return nombre;
    }
    public int getFecha(){
        return fecha;
    }
    public String getHospital(){
        return centrodesalud;
    }
    public String getMedicamento(){
        return medicamento;
    }
    public String getIndicacion(){
        return indicacion;
    }
    //metodo modificador set
    public void setNombre(String newnombre){
        nombre = newnombre;
    }
    public void setFecha(int newfecha){
        fecha = newfecha;
    }
    public void setHospital(String newhospital){
        centrodesalud = newhospital;
    }
    public void setMedicamento(String newmedicamento){
        medicamento = newmedicamento;
    }
    public void setIndicacion(String newindicacion){
        indicacion = newindicacion;
    }
    
}
