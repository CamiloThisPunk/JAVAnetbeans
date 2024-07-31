
package AppControlMental;
import java.util.Scanner;


public class ControlMentalPremium extends ControlMental{
    //Metodo público - estatico  es accesible sin crear un objeto.
    public static void mostrarPremium(){ //mostrarPremium tiene una funcion dentro que es mostrarMenu
        mostrarMenu(); 
        
        
    }
    //Metodos privados - solo disponibles para la clase
    private static void mostrarMenu(){
        Scanner sc = new Scanner(System.in); 
        int opcion; 
      
        do {            
                        System.out.println("\t\t¿ Qué quieres aprender hoy ? ");
                        System.out.println("1. Meditar por la mañana ");
                        System.out.println("2. Salir de nivel");
                        System.out.println("3. Meditar a cualquier hora");
                        System.out.println("4. Visualización");
                        System.out.println("5. Meditación dinamica ");
                        System.out.println("6. Resolver problemas");
                        System.out.println("7. La tecnica de los tres dedos");
                        System.out.println("8. Aprendizaje acelerado");
                        
                        
                        System.out.println("9. Salir");
                        System.out.print("-> ");
                        opcion = sc.nextInt(); 

                        switch (opcion) {
                            case 1: ejercicio1(); break; //Si opcion toma el valor de 1 invocamos al metodo "ejercicio1"
                            case 2: ejercicio2(); break; 
                            case 3: ejercicio3(); break; 
                            case 4: ejercicio4(); break; 
                            case 5: ejercicio5(); break;
                            case 6: ejercicio6(); break;
                            case 7: ejercicio7(); break;
                            case 8: ejercicio8(); break;   
                        }
                        
        } while (opcion != 9);    
    }
    
     private static void ejercicio1(){
        
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
     
     private static void ejercicio2(){
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
     
     private static void ejercicio3(){
        System.out.println("\n\t MEDITAR A CUALQUIER HORA");
        Scanner sc = new Scanner(System.in); 
        int paso; 
        System.out.println("- El ejercicio contiene 9 pasos");
        System.out.println("- Seleccione con un entero del 1 al 9 al numero de paso al que desea ir ");
        System.out.println("- Si desea salir solo introduzca el numero 0");
        
        do {
            
            System.out.print("\n-> ");
            paso = sc.nextInt(); 
            
            switch (paso) {
                            case 1:  
                                System.out.println("Paso 1: ");
                                break;
                                
                            case 2:  
                                System.out.println("Paso 2: ");
                                break; 
                                
                            case 3:  
                                System.out.println("Paso 3: ");
                                break; 
                            case 4: 
                                System.out.println("Paso 4: ");
                                break; 
                            case 5: 
                                System.out.println("Paso 4: ");
                                break;
                            case 6:
                                System.out.println("Paso 4: ");
                                break;
                            
                            case 7:  
                                System.out.println("Paso 4: ");
                                break;
                            case 8:  
                                System.out.println("Paso 4: ");
                                break;   
                            //Aumentar o reducir pasos de acuerdo al ejercicio
                        }
            
            
        } while (paso != 0); 
        
        
    }
     
      private static void ejercicio4(){    
      
           System.out.println("\n\t VISUALIZACIÓN");
           Scanner sc = new Scanner(System.in); 
           int paso; 
           System.out.println("- El ejercicio contiene 9 pasos");
           System.out.println("- Seleccione con un entero del 1 al 9 al numero de paso al que desea ir ");
           System.out.println("- Si desea salir solo introduzca el numero 0");

            do {

                System.out.print("\n-> ");
                paso = sc.nextInt(); 

                switch (paso) {
                                case 1:  
                                    System.out.println("Paso 1: ");
                                    break;

                                case 2:  
                                    System.out.println("Paso 2: ");
                                    break; 

                                case 3:  
                                    System.out.println("Paso 3: ");
                                    break; 
                                case 4: 
                                    System.out.println("Paso 4: ");
                                    break; 
                                case 5: 
                                    System.out.println("Paso 4: ");
                                    break;
                                case 6:
                                    System.out.println("Paso 4: ");
                                    break;

                                case 7:  
                                    System.out.println("Paso 4: ");
                                    break;
                                case 8:  
                                    System.out.println("Paso 4: ");
                                    break;   
                                //Aumentar o reducir pasos de acuerdo al ejercicio
                            }


            } while (paso != 0); 
        
    }
      
      private static void ejercicio5(){
          
          
          System.out.println("\n\t MEDITACION DINAMICA");
          Scanner sc = new Scanner(System.in); 
          int paso; 
          System.out.println("- El ejercicio contiene 9 pasos");
          System.out.println("- Seleccione con un entero del 1 al 9 al numero de paso al que desea ir ");
          System.out.println("- Si desea salir solo introduzca el numero 0");
        
        do {
            
            System.out.print("\n-> ");
            paso = sc.nextInt(); 
            
            switch (paso) {
                
                            case 1:  
                                System.out.println("Paso 1:Concentrece en un sonido como 'OM' o 'UNO' o \n'AMÉN', emitido en voz alta o mentalmente ");
                                break;
                                
                            case 2:  
                                System.out.println("Paso 2: Concentrece con un canto sonoro gregoriano, \npara llegar a la tranquilidad(meditación) ");
                                break; 
                                
                            case 3:  
                                System.out.println("Paso 3: Vaya más haya de su meditación pasiva, entrena tu \nmente de forma organizada y dinámica ");
                                break; 
                            case 4: 
                                System.out.println("Paso 4: Piensa en algo agradable no importa que tan trivial \nsea, algo sucedido receintemente (ayer-hoy), repase este hecho de forma breve es su mente");
                                break; 
                            case 5: 
                                System.out.println("Paso 5: Entre totalmente a nivel y proyecte el incidente \ncompleto en su pantalla mental ");
                                break;
                            case 6:
                                System.out.println("Paso 6: Realicese las siguientes preguntas;");
                                System.out.println(" ¿Cuáles fueron las escenas, los olores, los sonidos y \nlos sentimientos que usted tuvo en ese momento? ");
                                System.out.println("¿Qué valor tiene esto? ");
                                System.out.println("¿Se encuentran sobre su mesita de noche, en su bolsa, en el auto? ");
                                break;
                            
                            case 7:  
                                System.out.println("Paso 7: Escoja un acontecimiento que constituya solución a un problema");
                                break;
                            case 8:  
                                System.out.println("Paso 8: En su pantalla mental reviva detalladamente un \nacontecimiento en el que se manifestó el problema");
                                break; 
                            case 9:
                                System.out.println("Desplace suavemente esta escena hacia la derecha de la pantalla.\n Deslice sobre la pantalla otra escena que tendrá lugar el día de mañana. ");
                                System.out.println("En esta escena todos los que rodean a su jefe están alegres y el\n jefe está recibiendo buenas noticias");
                                break;
                            case 10:
                                System.out.println("Paso : Ahora empuje esta escena hacia la derecha de la pantalla\n y reemplácela con otra procedente de la izquierda");
                                System.out.println("El jefe está contento ahora, tan agradable como usted sabe que\n puede estarlo.");
                                break;
                            case 11:
                                System.out.println("Paso : Experimente esta escena tan vívidamente como si en\n realidad hubiera ya ocurrido. ");
                                System.out.println("Quédese con ella durante un momento, y siéntala a plenitud. ");
                                break;
                            case 12:
                                System.out.println("Paso : Ahora, sale usted de nivel contándose del uno al cinco\n y estará completamente despierto, sintiéndose mejor que antes. ");
                                break;
                            
                            //Aumentar o reducir pasos de acuerdo al ejercicio
                        }
      
    
         } while (paso != 0); 
        
    }
      
      private static void ejercicio6(){
         System.out.println("\n\t RESOLVER PROBLEMAS");
         Scanner sc = new Scanner(System.in); 
        int paso; 
        System.out.println("- El ejercicio contiene 9 pasos");
        System.out.println("- Seleccione con un entero del 1 al 9 al numero de paso al que desea ir ");
        System.out.println("- Si desea salir solo introduzca el numero 0");
        
        do {
            
            System.out.print("\n-> ");
            paso = sc.nextInt(); 
            
            switch (paso) {
                            case 1:  
                                System.out.println("Paso 1: ");
                                break;
                                
                            case 2:  
                                System.out.println("Paso 2: ");
                                break; 
                                
                            case 3:  
                                System.out.println("Paso 3: ");
                                break; 
                            case 4: 
                                System.out.println("Paso 4: ");
                                break; 
                            case 5: 
                                System.out.println("Paso 4: ");
                                break;
                            case 6:
                                System.out.println("Paso 4: ");
                                break;
                            
                            case 7:  
                                System.out.println("Paso 4: ");
                                break;
                            case 8:  
                                System.out.println("Paso 4: ");
                                break;   
                            //Aumentar o reducir pasos de acuerdo al ejercicio
                        }
            
            
        } while (paso != 0); 
        
    }
      
      private static void ejercicio7(){
          System.out.println("\n\t LA TECNICA DE LOS TRES DEDOS");
              Scanner sc = new Scanner(System.in); 
            int paso; 
            System.out.println("- El ejercicio contiene 2 pasos importantisimos");
            //System.out.println("- Seleccione con un entero del 1 al 9 al numero de paso al que desea ir ");
            System.out.println("Seleccione de 1 a 2 pasos ");
            System.out.println("- Si desea salir solo introduzca el numero 0");
            System.out.println("---------------------------------------------------");
            System.out.println("1).Domina tu mente");
            System.out.println("2).Concentracion");

            do {

                System.out.print("\n-> ");
                paso = sc.nextInt(); 

                switch (paso) {
                                case 1:  
                                    System.out.println("paso 1: Puedes utilizarlo en cualquier situacion que estes.");
                                    System.out.println("(Toma el dominio de tu mente)");
                                    
                                    break;

                                case 2:  
                                    System.out.println("Paso 2: Entre instantaneamente y opere de forma consciente de lo sucedido.");
                                    System.out.println("(Esto mejorara su concentracion y podras recordarla con mayor facilidad)");
                                    break; 

                             
                                //Aumentar o reducir pasos de acuerdo al ejercicio
                            }


            } while (paso != 0); 
            
        
        
      }
      
       private static void ejercicio8(){
           System.out.println("\t APRENDIZAJE ACELERADO");
        Scanner sc = new Scanner(System.in); 
        int paso; 
        System.out.println("- hay 3 pasos a seguir");
        System.out.println("- Seleccione de 1 al 3 al numero de paso al que desea ir siguiendo la secuencia  ");
        System.out.println("- Si desea salir solo introduzca el numero 0");
          System.out.println("-----------------------------------------------------------------");
          
          System.out.println("Prepare una grabadora");
          System.out.println("-----------------------------------------------------------------");
          
        do {
            
            System.out.print("\n-> ");
            paso = sc.nextInt(); 
            
            switch (paso) {
                            case 1:  
                                System.out.println("paso 1:En nivel beta, lee en voz alta lo que necesites aprender y grábalo.");
                                
                                break;
                                
                            case 2:  
                                System.out.println("Paso 2: Entra al nivel y escucha la grabación concentrándote en tu propia voz.");
                             
                                break; 
                            case 3: 
                                System.out.println("Paso 3: Deja que pasen varios días, vuelve a leer el material a nivel beta y escúchate a nivel alfa. Ahora la información será tuya, definitivamente.");
                               
                          
                            //Aumentar o reducir pasos de acuerdo al ejercicio
                        }
            
            
        } while (paso != 0);
              
            
            
            
        
    }
    
}
