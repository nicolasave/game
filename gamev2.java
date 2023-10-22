
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
        private static int respuesta =0;
        


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
                        Puntaje = 0;
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
            System.out.println("1. Multiple");
            System.out.println("2. Verdadero");
            
            opciones = sc.nextInt();
            switch (opciones){
                case 1:
                    System.out.println("Multple");
                    ConjuntosMultiple();
                    break;
                case 2:
                    System.out.println("VerdaderoyFalso");
                    funcionesdeConjuntosMultiple();
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

            String [] [] VerdaderoyFalso ={
                 {"Un conjunto es la agrupacion de elemntos siempre y cuando existan una condicion para que tales elementos pertenezcan a los conjuntos","V","F"},
                 {"Un conjunto infinito es aquel que posse un numero de elementos los cuales son incontables osea infinitos","V","F"},
                 {"Que es un conjunto finito aquel que posee un numero de elementos , los cuales pueden contarse","V","F"},
                 {"Un conjunto lo definimos cuando enumeramos los elementos del conjuntos","V","F"},
                 {"Universo es todo lo que rode a un conjunto/s de elementos","V","F"},
                 {"interseccion de conjuntos ss la cantidad de elementos que comparten 2 conjuntos o mas","V","F" },
                 {"Union de conjuntos Son todos los elementos de 2 conjuntos o mas","V","F"},
                 {"Una relacion Reflexsiva se define como  Para todo x que pertenece al conjunto A , (x,x ) pertenece a la relacion","V","F"},
                 {"Una relacion Irreflexsiva se define como  Para todo x que pertenece al conjunto A. (x,x) no pertenece a la relacion","V","F"},
                 {"Una relacion Simetrica se define como  Para todo x que pertenece al conjunto A , Para todo y que pertecenece al conjunto A , Si ( x,y) pertenecen a la relacion entonces ( y/x) pertenece a la relacion","V","F"},
                 {"Una relacion Transitiva para todo x que pertenece al conjunto A , (x,y) pertenece a la relacion , ( y,z) pertenece a la relacion , entonces ( x,z) pertenece a la relacion","V","F"},
                 {"Una relacion Asimetrica  para todo x que pertenece al conjunto A , (x,y) pertenece a la relacion entonces (y,x) no pertenece a la relacion","V","F"},
                 {"Una relacion Antisimetrica no hay lazos","V","F"},
                 {"Una funcion Inyectiva  se define como : A distintos elementos de A le corresponden distintos elementos de B","V","F"},
                {"Una funcion Sobreyectiva para rodo elemento de b en B existe un elemento de a en A tal que f(a)=b","V","F"},
                 {"una funcion Biyectiva si es biyectiva quiere decir que al mismo tiempo es inyectiva y sobreyectiva entonces la propiedad de ambas funciones se aplica para esta","V","F"},
                 {"una fucion Total A los elementos del dominio le pertenecen elementos del Codominio","V","F"},
                 {"una funcion Parcial a dos elementos del conjunto A le corresponden un elemento del conjunto B","V","F"}, //Hasta que llegan las verdaderas
                 {"El conjunto de números naturales tiene 50 elementos.","V","F"},
                 {"a intersección es el conjunto vacío.","V","F"},
                 {"El complemento del conjunto vacío es el conjunto universal.","V","F" },
                 {"un conjunto puede tener elementos repetidos.","V","F"},
                 {"El conjunto de números primos menores que 10 es {2, 3, 5, 7}.","V","F"},
                 {"¿Un conjunto puede ser su propio complemento?","V","F"},
                 {"La intersección de dos conjuntos siempre es igual a uno de los conjuntos originales?","V","F"},
                 {"Si un conjunto contiene números pares, ¿entonces su complemento contiene números impares?","V","F"},
                 {"¿La unión de dos conjuntos siempre da como resultado un conjunto más pequeño?","V","F"},
                 {"¿Puedes sumar dos conjuntos para obtener un tercer conjunto?","V","F"},


            };
        
            VYF(randomSort(28), VerdaderoyFalso);
        }
        private static void VYF(int a[], String[][] VerdaderoyFalso){
            int x = 0;
            for (int i = 0; i < 10; i++) {
                x = a[i];
                switch (x) {
                    case 1:
                    System.out.println(VerdaderoyFalso[0][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,0);
                    break;
                     case 2:
                    System.out.println(VerdaderoyFalso[1][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,1);
                    break;
                     case 3:
                    System.out.println(VerdaderoyFalso[2][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,2);
                    break;
                     case 4:
                    System.out.println(VerdaderoyFalso[3][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,3);
                    break;
                     case 5:
                    System.out.println(VerdaderoyFalso[4][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,4);
                    break;
                     case 6:
                    System.out.println(VerdaderoyFalso[5][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,5);
                    break;
                     case 7:
                    System.out.println(VerdaderoyFalso[6][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,6);
                    break;
                     case 8:
                    System.out.println(VerdaderoyFalso[7][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,7);
                    break;
                     case 9:
                    System.out.println(VerdaderoyFalso[8][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,8);
                    break;

                     case 10:
                    System.out.println(VerdaderoyFalso[9][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,9);
                    break;

                     case 11:
                    System.out.println(VerdaderoyFalso[10][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,10);
                    break;
                     case 12:
                    System.out.println(VerdaderoyFalso[11][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,11);
                    break;
                     case 13:
                    System.out.println(VerdaderoyFalso[12][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,12);
                    break;
                     case 14:
                    System.out.println(VerdaderoyFalso[13][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,13);
                    break;

                     case 15:
                    System.out.println(VerdaderoyFalso[14][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,14);
                    break;
                     case 16:
                    System.out.println(VerdaderoyFalso[15][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,15);
                    break;
                     case 17:
                    System.out.println(VerdaderoyFalso[16][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,16);
                    break;
                     case 18:
                    System.out.println(VerdaderoyFalso[17][0]);
                    ComprobacionVYD(VerdaderoyFalso,1,17);
                    break;

                     case 19:
                    System.out.println(VerdaderoyFalso[18][0]);
                     ComprobacionVYD(VerdaderoyFalso,1,18);
                    break;
                     case 20:
                    System.out.println(VerdaderoyFalso[19][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,19);
                    break;
                    case 21:
                    System.out.println(VerdaderoyFalso[20][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,20);
                    break;
                    case 22:
                    System.out.println(VerdaderoyFalso[21][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,21);
                    break;
                    case 23:
                    System.out.println(VerdaderoyFalso[22][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,22);
                    break;
                    case 24:
                    System.out.println(VerdaderoyFalso[23][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,23);
                    break;
                    case 25:
                    System.out.println(VerdaderoyFalso[24][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,24);
                    break;
                    case 26:
                    System.out.println(VerdaderoyFalso[25][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,25);
                    break;
                    case 27:
                    System.out.println(VerdaderoyFalso[26][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,26);
                    break;
                    case 28:
                    System.out.println(VerdaderoyFalso[27][0]);
                     ComprobacionVYD(VerdaderoyFalso,2,27);
                    break;

                }
            }
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
                        ComprobacionMultiple(preguntaYrespuesta, 2,0); // respuestas correctas con el numero correcto toma de referencia el doc.rtf
                       
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
        public static void ComprobacionVYD(String[][] repuestasYpreguntas,int respuesta, int pregunta){
            int ind = 0;
            for (int i = 0; i < 2; i++) {
                ind++;
            System.out.println(repuestasYpreguntas[pregunta][ind]);
            }
            opciones = sc.nextInt();
            while (true){
            if (opciones == respuesta) {
                System.out.println("+ 1");
                Puntaje++;
                
                break;
            }
             else {
                System.out.println("perdiste");
                break;
            }
        }
    }
            
        
        
        public static void ComprobacionMultiple(String[][] repuestasYpreguntas,int respuesta, int pregunta){
            int ind = 0;
            for (int i = 0; i < 4; i++) {
                ind++;
            System.out.println(repuestasYpreguntas[pregunta][ind]);
            }
            opciones = sc.nextInt();
            while (true){
            if (opciones == respuesta) {
                System.out.println("+ 1");
                Puntaje++;
                
                break;
            }
             else {
                System.out.println("perdiste");
                break;
            }
        }
           
            
        
        }
        private static void Ranking(){
            puntaje.add(Puntaje);
            try {
                 for (int index = 0; index < nombres.size(); index++) {
                System.out.println("nombre: " + nombres.get(index) + " puntaje: " + puntaje.get(index));
                
            }
            } catch (Exception e) {
                // TODO: handle exception
            }
           
                
            }
        }
                
        
