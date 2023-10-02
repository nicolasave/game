package Practicas;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Game
    {
    private static Random numrandom;
    private static int opciones = 0;
    private static Scanner sc;
    private static int preguntas = 10;
    private static int Puntaje = 0;
    private static String Nombre ="";
    private static Boolean Respuesta; 
    
    
	public static void main(String[] args) {
	    sc = new Scanner(System.in);
	    numrandom = new Random();
        ArrayList<Integer> ListaP = new ArrayList<>();
        ArrayList<String> ListaN = new ArrayList<>();
	    MainMenu();
	    
	}
	private static void MainMenu(){
	    do{
	        System.out.printf("--------------- aaa -----------");
	        System.out.printf("-----    - ----   -------------");
	    opciones = sc.nextInt();
	        
	    switch(opciones){
	        case 1:
	            System.out.println("Jugar");
                opciones = 0;
                Nombres();
	            break;
	        case 2:
	            System.out.println("Opciones");
                Opciones();
	            break;
	        case 3:
	            System.out.println("Ayuda");
                Ayuda();
	            break;
	            case 4:
	                System.out.println("Ranking");
	                break;
	           case 0:
                   System.out.println("Fin");
	        default:
	            System.out.println("Ingresa un valor correcto");
	            break;
	    }
	    
	    }while(opciones != 0);
    }

	    private static void Categorias(){
            opciones = sc.nextInt();
	        switch (opciones){
	            case 1:
	                System.out.println("Conjuntos");
                    Conjuntos();
	                break;
	           case 2:
	               System.out.println("Teorema de Conjuntos");
                   TeoremadeConjuntos();
	               break;
	           case 3:
	               System.out.println("Funciones en Conjuntos");
                   FuncionesCOnjuntos();
	               break;
	           case 4:
	               System.out.println("Grafos");
                   Grafos();
	               break;
	               default:
	               System.out.println("");
	               break;
            }
	        }

	        private static void Conjuntos(){
                do{
                    switch (numrandom.nextInt(10)+ 1 ) {
                        case 1: System.out.println("a");
                                
                            break;
                        case 2: System.out.println("b");
                         break;
                        case 3 : System.out.println("c");
                        break;
                        case 4: System.out.println("d");
                        break;
                        case 5: System.out.println("f");
                        break;
                        case 6: System.out.println("g");
                        break;
                        case 7: System.out.println("h");
                        break;
                        case 8: System.out.println("i");
                        break;
                        case 9: System.out.println("j");
                        break;
                        case 10: System.out.println("k");
                        break;

                
                        default:System.out.println("ta Todo mal con vo"); 
                            break;
                    }
                } while(preguntas!=0);
            }
            private static void TeoremadeConjuntos(){
                do {
                   switch (numrandom.nextInt(10)+ 1 ) {
                        case 1: System.out.println("a");
                            break;
                        case 2: System.out.println("b");
                         break;
                        case 3 : System.out.println("c");
                        break;
                        case 4: System.out.println("d");
                        break;
                        case 5: System.out.println("f");
                        break;
                        case 6: System.out.println("g");
                        break;
                        case 7: System.out.println("h");
                        break;
                        case 8: System.out.println("i");
                        break;
                        case 9: System.out.println("j");
                        break;
                        case 10: System.out.println("k");
                        break;

                
                        default:System.out.println("ta Todo mal con vo"); 
                            break;
                    } 
                }while (preguntas!=0);
            }
            private static void FuncionesCOnjuntos(){
                do{
                    switch (numrandom.nextInt(10)+ 1 ) {
                        case 1: System.out.println("a");
                            break;
                        case 2: System.out.println("b");
                         break;
                        case 3 : System.out.println("c");
                        break;
                        case 4: System.out.println("d");
                        break;
                        case 5: System.out.println("f");
                        break;
                        case 6: System.out.println("g");
                        break;
                        case 7: System.out.println("h");
                        break;
                        case 8: System.out.println("i");
                        break;
                        case 9: System.out.println("j");
                        break;
                        case 10: System.out.println("k");
                        break;

                
                        default:System.out.println("ta Todo mal con vo"); 
                            break;
                    } 
                }while (preguntas!=0);
                    }
                private static void Grafos(){
                    do{
                        switch (numrandom.nextInt(10)+ 1 ) {
                        case 1: System.out.println("a");
                            break;
                        case 2: System.out.println("b");
                         break;
                        case 3 : System.out.println("c");
                        break;
                        case 4: System.out.println("d");
                        break;
                        case 5: System.out.println("f");
                        break;
                        case 6: System.out.println("g");
                        break;
                        case 7: System.out.println("h");
                        break;
                        case 8: System.out.println("i");
                        break;
                        case 9: System.out.println("j");
                        break;
                        case 10: System.out.println("k");
                        break;

                
                        default:System.out.println("ta Todo mal con vo"); 
                            break;
                    } 
                }while (preguntas!=0);
                    

                }
                private static void Opciones(){
                    System.out.println("Que queres configurar no descanse");
                    System.out.println("Apreta 0 para volver");
                    opciones = sc.nextInt();
                    MainMenu();
                }
                private static void Ayuda(){
              System.out.println("El juego se trata de un juego de preguntas, que consta de 10 preguntas de metodos discretos\t Sobre Conjuntos, Teorema de Conjuntos, Funciones y Grafos");
              System.out.println("Apreta 0 para volver");
              opciones = sc.nextInt();
            
                }
                private static void Nombres(){
                System.out.println("Ingresa tu nombre");
                Nombre = sc.next();
                System.out.println("Bienvenido "+Nombre);
                Categorias();
        
                }
        
                
                
                
                

            

	            
	        }
    
    
    


