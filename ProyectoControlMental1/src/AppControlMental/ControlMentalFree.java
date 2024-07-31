
package AppControlMental;
import java.util.Scanner;

/**
 *
 * @author RYZEN
 */
public class ControlMentalFree extends ControlMental{
    //Es el unico método publico y accesible 
    public static void mostrarFree(){
        mostrarMenu(); 
    }
    
    //Métodos privados -> Si un método es estatico necesariamente todos deben compartir esta propiedad
     private static void mostrarMenu(){
        Scanner sc = new Scanner(System.in); 
        int opcion; 
        do {            
                        System.out.println("1. Meditar por la mañana ");
                        System.out.println("2. Salir de nivel");
                        System.out.println("3. Meditar a cualquier hora");
                        System.out.println("4. Salir");
                        System.out.print("-> ");
                        opcion = sc.nextInt(); 
                        switch (opcion) {
                            case 1: ejercicio1(); break; //Si opcion toma el valor de 1 invocamos al metodo "ejercicio1"
                            case 2: ejercicio2(); break; 
                            case 3: ejercicio3(); break;  
                        }
                        
        } while (opcion != 9);    
    }//Gestiona los ejercicios
    
     private  static void ejercicio1(){
        
        System.out.println("\n\t MEDITAR POR LA MAÑANA"); 
        Scanner sc = new Scanner(System.in); 
        int paso; 
        System.out.println("- El ejercicio contiene 7 pasos");
        System.out.println("- Seleccione con un entero del 1 al 7 al numero de paso al que desea ir ");
        System.out.println("- Si desea salir solo introduzca el numero 0");
        
        do {
            
            System.out.print("\n-> ");
            paso = sc.nextInt(); 
            
            switch (paso) {
                            case 1:  
                                System.out.println("Paso 1: Sientese comodamente con las piernas cruzadas");
                                break;
                                
                            case 2:  
                                System.out.println("Paso 2: Cierre los ojos y diríjalos hacia arriba, detrás de los parpados\nen un ángulo de 20 grados");
                                break; 
                                
                            case 3:  
                                System.out.println("Paso 3: Lentamente en intervalos de dos segundos aproximandamente\ncuente en forma regresiva del cien al uno ");
                                break; 
                            case 4: 
                                System.out.println("Paso 4: Una vez realizado el conteo, empiece a visualizar una pantalla\nen la cual usted proyectara cualquier cosa");
                                break; 
                            case 5: 
                                System.out.println("Paso 5: Puede proyectar algo sencillo como una naranja o una manzana\nconcentrese en hacerla cada vez mas real");
                                break;
                            case 6:
                                System.out.println("Paso 6: La idea es que usted pueda visualizar tal como es en la realidad, en tres dimensiones, a todo color ");
                                break;
                            
                            case 7:  
                                System.out.println("Paso 7: Haga esto durante 15 minutos en el siguiente ejercicio se le enseñara como salir de este estado, gracias.");
                                break;
                            
                            //Aumentamos o reducimos los pasos de acuerdo al ejercicio
                        }
            
            
        } while (paso != 0); 
        
    }
     
     private  static void ejercicio2(){
        System.out.println("\n\t SALIR DE NIVEL");
        Scanner sc = new Scanner(System.in); 
        int paso; 
        System.out.println("- El ejercicio contiene 3 pasos");
        System.out.println("- Seleccione con un entero del 1 al 3 al numero de paso al que desea ir ");
        System.out.println("- Si desea salir solo introduzca el numero 0");
        
        do {
            
            System.out.print("\n-> ");
            paso = sc.nextInt(); 
            
            switch (paso) {
                            case 1:  
                                System.out.println("Paso 1: Antes de terminar el ejercicio 1 realice unas 5 respiraciones profunzas  ");
                                break;
                                
                            case 2:  
                                System.out.println("Paso 2: Ahora mentalmente diga 'Saldre lentamente miestras cuento del uno al cinco\ny me sentire completamente despierto y mejor que antes' ");
                                break; 
                                
                            case 3:  
                                System.out.println("Paso 3: Uno...Dos...Tres...Cuatro...Cinco....ojos abiertos, completamente despierto y sintiéndome mejor que antes");
                                break; 
                            
                        }
            
            
        } while (paso != 0); 
        
        
    }
     
     private  static void ejercicio3(){
         
        System.out.println("\n\t MEDITAR A CUALQUIER HORA");
        Scanner sc = new Scanner(System.in); 
        int paso; 
        System.out.println("- El ejercicio contiene 8 pasos");
        System.out.println("- Seleccione con un entero del 1 al 8 al numero de paso al que desea ir ");
        System.out.println("- Si desea salir solo introduzca el numero 0");
        
        do {
            
            System.out.print("\n-> ");
            paso = sc.nextInt(); 
            
            switch (paso) {
                            case 1:  
                                System.out.println("Paso 1: Sientese un momento en silencio,"
                                        + "\n   y deje todo lo que esté haciendo en un instante ");
                                break;
                                
                            case 2:  
                                System.out.println("Paso 2: Cierra los ojos y respira ");
                                break; 
                                
                            case 3:  
                                System.out.println("Paso 3: Céntrate en tu respiración. Si en algún momento"
                                        + "\n        te das cuenta de que ha aparecido algún pensamiento, simplemente"
                                        + "\n        vuelve a centrar tu atención en el aire que entra y sale. ");
                                break; 
                                
                            case 4: 
                                System.out.println("Paso 4: Agradece por el tiempo y el movimiento ");
                                break; 
                                
                            case 5: 
                                System.out.println("Paso 5: Empieza por centrar tu atención en tus pies,"
                                        + "\n mueve tus dedos y estíralos. ");
                                break;
                                
                            case 6:
                                System.out.println("Paso 6: Lentamente, a intervalos de 2 segundos, cuente en forma"
                                        + "regresiva del cien al uno !. ");
                                break; 
                                
                            case 7:  
                                System.out.println("Paso 7: Cierre los ojos y dirijalos hacia arriba,\n detrás de los párpados en un ángulo de 20 grados. ");
                                break;
                                
                            case 8:  
                                System.out.println("Paso 8: Bien !. Ahora proyéctese mentalmente a su sitio ideal de relajación.  ");
                                break;
                        }
        } while (paso != 0); 
        
    }
    
    
}
    
    
    

