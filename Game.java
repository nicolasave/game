
import java.util.*;

public class Main
{
    private static Random numrandom;
    private static int opciones = 0;
    private  static  int randomComp = 0;
    private static int count = 0;
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
        //Instanciacion de las clases
        MainMenu();

    }
    private static void MainMenu(){
        do{
            System.out.println("-@-@-@-@-@-@-@-@-@-@-@-@-@-@-");
            System.out.println("-                            @");
            System.out.println("-----------------------------@");
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
        preguntas = 0;
        randomComp = 0;
        count = 0;
        Set<Integer> set = new HashSet<>();
        do{
            set.clear();
            for (int i = 0; i < 10; i++) {
                set.add(i);
            }
            randomComp = numrandom.nextInt();
            switch (randomComp)  {
                case 1 : System.out.println("a");

                    opciones = sc.nextInt(); // cambiala por la comprobacion
                    break;
                case 2: System.out.println("b");

                    count += 1;
                    opciones = sc.nextInt();
                    break;
                case 3 : System.out.println("c");
                    count += 1;
                    opciones = sc.nextInt();
                    break;
                case 4: System.out.println("d");
                    opciones = sc.nextInt();
                    count += 1;
                    break;
                case 5: System.out.println("f");
                    opciones = sc.nextInt();
                    count += 1;
                    break;
                case 6: System.out.println("g");
                    opciones = sc.nextInt();
                    count += 1;
                    break;
                case 7: System.out.println("h");
                    opciones = sc.nextInt();
                    count += 1;
                    break;
                case 8: System.out.println("i");
                    opciones = sc.nextInt();

                    count += 1;
                    break;
                case 9: System.out.println("j");
                    opciones = sc.nextInt();
                    count += 1;
                    break;
                case 10: System.out.println("k");
                    count += 1;
                    opciones = sc.nextInt();
                    break;
                case 0:
                    System.out.println("aaaa");
            }
        } while(count!=10);
    }
    private static void TeoremadeConjuntos(){
        preguntas = 10;
        do {
            switch (numrandom.nextInt(0,10)) {
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
                default:
                    System.out.println("ta Todo mal con vo");
                    break;
            }
        }while (preguntas!=0);
    }
    private static void FuncionesCOnjuntos(){
        preguntas = 10;
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
        preguntas = 10;
        do{
            switch (numrandom.nextInt(10)+ 1 ) {
                case 1:
                    System.out.println("a"); // pregunta
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




