
package Usuario;
import AppControlMental.ControlMental;
import AppControlMental.ControlMentalFree;
import AppControlMental.ControlMentalPremium;

public class GestorDeUsuario {
    //Atributos 
            private String nombre;
            private byte edad; 
            private boolean confirmarPago = false; 

            //Contructores
            public GestorDeUsuario (String nombre, byte edad){
                this.nombre = nombre; 
                this.edad = edad; 
            }

            public GestorDeUsuario(boolean confirmarPago) {
                this.confirmarPago = confirmarPago;
            }
            
            public GestorDeUsuario(String nombre, byte edad, boolean confirmarPago){
                this.nombre = nombre; 
                this.edad = edad; 
                this.confirmarPago = confirmarPago;
            }

            //Getters
            public String getNombre() {
                return nombre;
            }

            public boolean getConfirmarPago() {
                return confirmarPago;
            }

            //Metodos especiales
            public void ejecutarVersionPremium(){              
                System.out.println("\n\t" + "Bienvenido a la  version Premium");
                System.out.println("Esta versión pone a disposición todos los ejercicios de control mental");
                ControlMentalPremium.mostrarPremium();
            } 

            public void ejecutarVersionGratuita(){
                
                ControlMentalFree.mostrarFree(); 
            }
    
    
}
