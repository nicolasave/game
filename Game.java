

import java.util.*;

public class Game
{
    private static Random numrandom;
    private static int opciones = 0;
    private static int count = 0;
    private static Scanner sc;
    private static int preguntas = 10;
    private static int Puntaje = 0;
    private static String Nombre ="";
    private static Boolean TF;
    private static int Multiple = 0;
    


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        numrandom = new Random();
        ArrayList<Integer> ListaP = new ArrayList<>();
        ArrayList<String> ListaN = new ArrayList<>();
        ArrayList<Integer> casos = new ArrayList<>();
        for (int i = 1; i <=10;i++){
            casos.add(i);
        }
        MainMenu();

    }
    private static void MainMenu(){
        do{
            System.out.println("-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@");
            System.out.println("@ 1. Jugar                   @");
            System.out.println("@ 2. Opciones                @");
            System.out.println("@ 3. Ayuda                   @");
            System.out.println("@ 4. Ranking                 @");
            System.out.println("@ 0. Salir                   @");
            System.out.println("-@-@-@-@-@-@-@-@-@-@-@-@-@-@-");
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
        System.out.println("1. Conjuntos");
        System.out.println("2. Teorema de Conjuntos");
        System.out.println("3. Funciones en Conjuntos");
        System.out.println("4. Grafos");
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
                System.out.println("A");
                break;
        }
    }

    private static void Conjuntos(){
    String[] conjuntos = {
        "Que es un conjunto", "Que es un conjunto finito", "Que es un conjunto Infinito ","Como definimos a un conjunto por extencion?",
        "Como defininos a un conjunto por comprencion?", "fdsafsd", "sda","fdsafsd", "sda","fdsafsd", "sda","fdsafsd", "sda","fdsafsd"
        , "sda","fdsafsd", "sda","fdsafsd", "sda","fdsafsd"
    };
 }
    private static void TeoremadeConjuntos(){

    String[] teoremadeConjuntos =  {
        "En teorema de conjuntos a que nos referimos al decir Universo ?", "En teorema de conjuntos a que nos referimos al decir interseccion de conjuntos?",
        "En teorema de conjuntos a que nos referimos al decir Union de conjuntos","fdsafsd", "sda","fdsafsd", "sda","fdsafsd", "sda","fdsafsd", "sda","fdsafsd"
        , "sda","fdsafsd", "sda","fdsafsd", "sda","fdsafsd"

    };
        preguntas(randomSort(), teoremadeConjuntos);
    }
    private static void FuncionesCOnjuntos(){

    }
       
            
    
    
    private static void Grafos(){
       
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
    private static int[] randomSort(){
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = numrandom.nextInt(20);
            for (int j = 0; j < i; j++) {
                if(a[i] == a[j]) {
                    i--;
                    break;


                }
            }
            
        }
            return a;
    }
    private static void preguntas(int a[],String[] pregunta){
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x= a[i];
            switch (x) {
                case 1:
                    System.out.println(pregunta[0]);
                    break;
                case 2:
                    System.out.println(pregunta[1]);
                    break;
                case 3:
                    System.out.println(pregunta[2]);
                    break;
                case 4:
                    System.out.println(pregunta[3]);
                    break;
                case 5:
                    System.out.println(pregunta[4]);
                    break;
                case 6:
                    System.out.println(pregunta[5]);
                    break;
                case 7:
                    System.out.println(pregunta[6]);
                    break;
                case 8:
                    System.out.println(pregunta[7]);
                    break;
                case 9:
                    System.out.println(pregunta[8]);
                    break;
                case 10:
                    System.out.println(pregunta[9]);
                    break;

                default:
                    break;
            }
            
        }
    }
    }

    







