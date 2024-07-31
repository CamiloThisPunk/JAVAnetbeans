
package principal;

import clases.Diagnostico;
import clases.Doctor;
import clases.Maquina;
import clases.Paciente;

/**
 *
 * @author RYZEN
 */
public class ProyectoClinica {

    //metodo principal
    public static void main(String[] args) {
        //objetos
       Diagnostico diagnostico1;
       diagnostico1 = new Diagnostico("paciente001","dolor de muela","profesional clinico", "abundacia de dulces","extraccion del diente");
       
       Doctor doctor1;
       doctor1 = new Doctor("camilo", 22, "confidencial", "odontologo", 1.32);
       
       Maquina maquina0 = new Maquina("maquinon", "blanco", "nuevo",5 , "odontologia");
       
       Paciente paciente1 = new Paciente("virginia",28,"confidencial",1.45,"abogada");
       
       //get
       String name = doctor1.getNombre();
       System.out.println("El nombre del doctor es: "+ name);
       
       String job = doctor1.getJob();
        System.out.println("y su profesion es: "+job);
        
       String pacienteone = paciente1.getNombre1();
       System.out.println("EL nombre del paciente es :" + pacienteone);
        
       int edad = paciente1.getEdad();
        System.out.println("tiene la edad de :"+ edad);
       
       
       
       
       
        /*System.out.println("PACIENTE001");
        System.out.println(diagnostico1);
        
        System.out.println("");
        System.out.println("DOCTOR");
        System.out.println(doctor1);
        
        System.out.println("");
        System.out.println("Maquina0");
        System.out.println(maquina0);*/
        
    }
}
