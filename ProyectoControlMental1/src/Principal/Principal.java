
package Principal;
//import Usuario.Usuario;
import java.util.Scanner;
import Usuario.GestorDeUsuario;
import Usuario.GestorUsuarioColegio;
import Usuario.GestorUsuarioComun;
import Usuario.GestorUsuarioDeUniversidad;

public class Principal {
    public static void main(String[] args) {
        
        
        //PARTE 1: Registro inicial
        Scanner sc = new Scanner(System.in); 
        System.out.println("\tBIENVENIDO AL METODO SILVA DE CONTROL MENTAL");
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine(); 
        System.out.print("Introduce tu edad: ");
        byte edad = sc.nextByte(); 
        System.out.println("\n");
        
        
        
        //PARTE 2: Se determina  si el usuario es Premium o Free 
        System.out.println("\t----> GRACIAS POR LLENAR EL REGISTRO INICIAL <----"); 
        System.out.println("1.Deseas confirmar el pago por nuestra membresia Premium");
        System.out.println("2.Deseas usar la version gratuita de nuestra aplicacion");
        System.out.print("-> ");
        int decisionPago = sc.nextInt(); 
        boolean confirmarPago = false; 
        if (decisionPago == 1)  confirmarPago = true;
        else if  (decisionPago == 2)  confirmarPago = false; 
        System.out.println("\n");
        
        
        //PARTE 3: Determinar rol de usuario 
        System.out.println("Finalmente escoge tu rol: ");
        System.out.println("1.Estudiante de Colegio");
        System.out.println("2.Estudiante universitario");
        System.out.println("3.Usuario comun ");
        System.out.print("-> ");
        byte rol = sc.nextByte(); 
        System.out.println("\n");
        //Desde aquí es donde se aplica el polimorfismo por herencia
        GestorDeUsuario usuario1 = null; //Declaramos una variable de tipo Gestor usuario que no sabemos especificamente que rol tendra
        
        sc.nextLine(); //Para corregir error de salto de linea
        
        if ( rol == 1) {
            System.out.print("Introduce el nombre de tu colegio: ");
            String colegio = sc.nextLine(); 
            usuario1 = new GestorUsuarioColegio(colegio, nombre, edad, confirmarPago);
       
        }else if (rol == 2) {
            System.out.print("Introduce el nombre de tu universidad: ");
            String universidad = sc.nextLine(); 
            usuario1 = new GestorUsuarioDeUniversidad(universidad, nombre, edad, confirmarPago); 
            
        } else if (rol == 3){
            System.out.print("Introduce tu ocupación actual: ");
            String ocupacion = sc.nextLine(); 
            usuario1 = new GestorUsuarioComun(ocupacion, nombre, edad, confirmarPago); 
        }
        System.out.println("\n");
        
        
        
        // PARTE 4: Se ejecuta el programa para el usuario dependiendiendo si es Premiun o Free  
        if (usuario1.getConfirmarPago() == true)  {
            System.out.println("\n\t" + "Bienvenido a la  version Premium");
            System.out.println("Esta versión pone a disposición todos los ejercicios de control mental");
            System.out.println("\tHey " + usuario1.getNombre() + " ¿qué entrenamiento escogeras hoy? ");
            usuario1.ejecutarVersionPremium();
        } else {
            System.out.println("\n" + "Bienvenido a la  version Free");
            System.out.println("Esta versión pone a disposición 3 ejercicios esenciales de control mental");
            System.out.println("\tHey " + usuario1.getNombre() + " ¿qué entrenamiento escogeras hoy?");
            usuario1.ejecutarVersionGratuita();
        } 
        System.out.println("");
        System.out.println("Hasta pronto "  + usuario1.getNombre() +" esperamos verte pronto");
    

    }
    
    
   
    
}
