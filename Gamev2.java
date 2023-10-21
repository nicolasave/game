
    import java.util.*;
    public class gamev2
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
        private static ArrayList<Integer> puntaje;
        private static ArrayList<String> nombres;
        


        public static void main(String[] args) {
            puntaje = new ArrayList<>();
            nombres = new ArrayList<>();
            sc = new Scanner(System.in);
            numrandom = new Random();
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
                System.out.println("@-@-@-@-@-@-@-@-@-@-@-@-@-@-@-@");
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
                        Ranking();
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
            System.out.println("2. Funciones en Conjuntos");
            System.out.println("3. Relaciones");
            System.out.println("4. Grafos");
            opciones = sc.nextInt();
            switch (opciones){
                case 1:
                    System.out.println("CONJUNTOS");
                    ConjuntosMultiple();
                    break;
                case 2:
                    System.out.println("FUNCIONES DE CONJUNTOS");
                    funcionesdeConjuntosMultiple();
                    break;
                case 3:
                    System.out.println("RELACIONES");
                    RelacionesMultiple();
                    break;
                case 4:
                    System.out.println("Grafos");
                    GrafosMultiple ();
                    break;
                default:
                    System.out.println("A");
                    break;
            }
        }

        private static void ConjuntosMultiple(){
            String[][] PreguntasYRespuestas = {
                {"¿Cuál de las siguientes opciones representa un conjunto vacío?", "a) {1, 2, 3}", "b) {}", "c) {0}", "d) {A, B, C}"},
                {"Si A = {1, 2, 3} y B = {2, 3, 4}, ¿cuál es la intersección de A y B?", "a) {1, 2, 3, 4}", "b) {2, 3}", "c) {1, 4}", "d) {}"},
                {"¿Cuál de las siguientes afirmaciones es cierta?", "a) El conjunto de números naturales es un subconjunto del conjunto de números enteros.", "b) El conjunto de números enteros es un subconjunto del conjunto de números racionales.", "c) El conjunto de números racionales es un subconjunto del conjunto de números irracionales.", "d) El conjunto de números irracionales es un subconjunto del conjunto de números reales."},
                {"Si tienes un conjunto universal U = {a, b, c, d, e} y A = {a, b, c}, ¿cuál es el complemento de A?", "a) {a, b, c}", "b) {d, e}", "c) {a, b, c, d, e}", "d) {}"},
                {"Si tienes un conjunto C = {rojo, verde, azul} y D = {azul, amarillo, blanco}, ¿cuál es la unión de C y D?", "a) {rojo, verde, azul}", "b) {rojo, verde, azul, amarillo, blanco}", "c) {rojo, verde, blanco}", "d) {azul}"},
                {"¿Cuál de las siguientes opciones representa un conjunto finito?", "a) El conjunto de todos los números reales.", "b) El conjunto de números primos.", "c) El conjunto de números naturales.", "d) El conjunto de números racionales."},
                {"Si tienes un conjunto A = {2, 4, 6, 8} y un conjunto B = {3, 6, 9, 12}, ¿cuál es el conjunto de los números pares en la unión de A y B?", "a) {2, 4, 6, 8, 12}", "b) {2, 4, 6, 8}", "c) {6, 12}", "d) {3, 9}"},
                {"¿Cuál de las siguientes opciones describe un conjunto infinito?", "a) El conjunto de los días de la semana.", "b) El conjunto de los planetas del sistema solar.", "c) El conjunto de números enteros positivos.", "d) El conjunto de los continentes en la Tierra."},
                {"Si tienes un conjunto C = {a, b, c, d, e} y D = {b, c, d}, ¿cuál es la intersección entre C y D?", "a) {a, b, c, d, e}", "b) {a, e}", "c) {b, c, d}", "d) {}"},
                {"Si tienes un conjunto P = {perro, gato, pájaro} y Q = {pájaro, pez, reptil}, ¿cuál es la intersección de P y Q?", "a) {perro, gato, pájaro, pez, reptil}", "b) {pájaro}", "c) {perro, gato}", "d) {}"},
                {"¿Cuál de las siguientes opciones representa un conjunto finito?", "a) El conjunto de números naturales.", "b) El conjunto de números enteros.", "c) El conjunto de todos los números racionales.", "d) El conjunto de letras del alfabeto."},
                {"Si tienes un conjunto A = {1, 2, 3, 4} y un conjunto B = {3, 4, 5, 6}, ¿cuál es la unión de A y B?", "a) {1, 2, 3, 4, 5, 6}", "b) {1, 2, 5, 6}", "c) {3, 4}", "d) {}"},
                {"¿Cuál de las siguientes opciones es un subconjunto del conjunto de números racionales?", "a) El conjunto de números enteros.", "b) El conjunto de números irracionales.", "c) El conjunto de números complejos.", "d) El conjunto de números naturales."},
                {"Si tienes un conjunto X = {manzana, plátano, naranja} y un conjunto Y = {uva, pera, manzana}, ¿cuál es la unión de X y Y?", "a) {manzana, plátano, naranja, uva, pera}", "b) {manzana}", "c) {uva, pera}", "d) {plátano, naranja}"},
                {"Si tienes un conjunto M = {rojo, verde, azul} y un conjunto N = {azul, amarillo, verde}, ¿cuál es la intersección de M y N?", "a) {rojo, azul, amarillo, verde}", "b) {azul, verde}", "c) {amarillo}", "d) {}"},
                {"¿Cuál de las siguientes opciones representa un conjunto ?", "a) {1, 2, 3}", "b) {1, 2, 3, 4}", "c) {1, 2}", "d) todas son válidas"},
                {"Si tienes un conjunto A = {a, b, c, d} y un conjunto B = {c, d, e, f}, ¿cuál es el conjunto que contiene todos los elementos de A y B?", "a) {a, b, c, d}", "b) {c, d, e, f}", "c) {a, b, c, d, e, f}", "d) {}"},
                {"¿Cuál de las siguientes afirmaciones es cierta?","a) La intersección de dos conjuntos siempre es un conjunto vacío." ,"b) La diferencia entre dos conjuntos es conmutativa.", "c) El conjunto universal es igual al conjunto vacío.", "d) La unión de dos conjuntos siempre es igual a uno de los conjuntos originales."},
                {"Si tienes un conjunto C = {rojo, verde, azul} y un conjunto D = {azul, amarillo, blanco}, ¿cuál es la diferencia simétrica entre C y D?", "a) {rojo, verde, blanco}", "b) {verde, amarillo}", "c) {rojo, verde, amarillo, blanco}", "d) {azul}"},
            };

            preguntas(randomSort(19), PreguntasYRespuestas);
        }
        private static void funcionesdeConjuntosMultiple(){

        }
        private static void RelacionesMultiple(){

            //preguntas(randomSort(), funcionesdeConjuntos, funcionesdeConjuntosnRespuesta);
        }
        private static void GrafosMultiple(){

        
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
            nombres.add(Nombre);
            
            Categorias();
        }
        private static int[] randomSort(int s){
            int[] a = new int[s];
            for (int i = 0; i < a.length; i++) {
                a[i] = numrandom.nextInt(s + 1);
                for (int j = 0; j < i; j++) {
                    if(a[i] == a[j]) {
                        i--;
                        break;


                    }
                }
                
            }
                return a;
        }
        private static void preguntas(int a[], String[][] preguntaYrespuesta){
            int x = 0;
            for (int i = 0; i < 10; i++) {
                x = a[i];
                switch (x) {
                    case 1:
                        System.out.println(preguntaYrespuesta[0][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 2, 0); // respuestas correctas con el numero correcto toma de referencia el doc.rtf
                        break;
                    case 2:
                        System.out.println(preguntaYrespuesta[1][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 3, 1);
                        break;
                    case 3:
                        System.out.println(preguntaYrespuesta[2][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 2);
                        break;
                    case 4:
                        System.out.println(preguntaYrespuesta[3][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 3);
                        break;
                    case 5:
                        System.out.println(preguntaYrespuesta[4][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 4);
                        break;
                    case 6:
                        System.out.println(preguntaYrespuesta[5][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 5);
                        break;
                    case 7:
                        System.out.println(preguntaYrespuesta[6][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 2, 6);
                        break;
                    case 8:
                        System.out.println(preguntaYrespuesta[7][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 3, 7);
                        break;
                    case 9:
                        System.out.println(preguntaYrespuesta[8][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 8);
                        break;
                    case 10:
                        System.out.println(preguntaYrespuesta[9][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 9);
                        break;
                    case 11:
                        System.out.println(preguntaYrespuesta[10][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 2, 10);
                        break;
                    case 12:
                        System.out.println(preguntaYrespuesta[11][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 11);
                        break;
                    case 13:
                        System.out.println(preguntaYrespuesta[12][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 3, 12);
                        break;
                    case 14:
                        System.out.println(preguntaYrespuesta[13][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 4, 13);
                        break;
                    case 15:
                        System.out.println(preguntaYrespuesta[14][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 2, 14);
                        break;
                    case 16:
                        System.out.println(preguntaYrespuesta[15][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 1, 15);
                        break;
                    case 17:
                        System.out.println(preguntaYrespuesta[16][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 3, 16);
                        break;
                    case 18:
                        System.out.println(preguntaYrespuesta[17][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 4, 17);
                        break;
                    case 19:
                        System.out.println(preguntaYrespuesta[18][0]);
                        ComprobacionMultiple(preguntaYrespuesta, 2, 18);
                        break;
                    }
            }
        }
        private static void ComprobacionMultiple(String[][] repuestasYpreguntas, int respuesta, int pregunta){
            int ind = 0;
            for (int i = 0; i < 4; i++) {
                ind++;
            System.out.println(repuestasYpreguntas[pregunta][ind]);
            }
            opciones = sc.nextInt();
            if (opciones == respuesta) {
                System.out.println("+ 1");
                Puntaje++;
                
            }
            else{
                System.out.println("perdiste");
            }
            puntaje.add(Puntaje);
            
        }
        private static void Ranking(){
            for (int index = 0; index < nombres.size(); index++) {
                System.out.println("nombre: " + nombres.get(index) + " puntaje: " + puntaje.get(index));
                
            }
        }
                
    }
        
