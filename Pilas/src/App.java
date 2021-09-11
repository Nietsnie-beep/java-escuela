import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("   ___");
        System.out.println(" _/ oo\\ ");
        System.out.println("( \\  O/__");
        System.out.println(" \\    \\__)");
        System.out.println(" /     \\");
        System.out.println("/__ ~~~~\\");
        System.out.println("----(Creador)------Nietsnie-Beep-----");
        System.out.println("-----(Repositorio)-----(https://github.com/Nietsnie-beep/java-escuela.git)-----");

        //entraadas de tiempos variables 
        int Tiempo_editado, Tiempo_libro;

        Scanner uno = new Scanner(System.in);
        Scanner dos = new Scanner(System.in);
    
        /**
         * Se multiplica por 1000 por que son milisegundos
         */

        System.out.println(" ");

        System.out.println("Ingresa los meses para editar el libro");
        Tiempo_editado = uno.nextInt()*1000;
        System.out.println("Ingresa los meses para escribir el libro");
        Tiempo_libro = dos.nextInt()*1000;

    Pila Stack = new Pila(4);
    
    //variable generadora para numeros 
    Random random = new Random();
    
    Timer timer = new Timer();

    //funcion push ejecutado por tiempo
    TimerTask execute = new TimerTask(){

        @Override
        public void run() {

            int min = 4;

            int max = 8;
        
            int numero = random.nextInt(max + min) + min;
        
            // TODO Auto-generated method stub
            System.out.println(numero);
            Stack.push( String.valueOf(numero));
            
        }
    };

    //funcion pop ejecutado por tiempo
    TimerTask pop = new TimerTask(){

        @Override
        public void run() {
            // TODO Auto-generated method stub
            Stack.pop();
            System.out.println("Pop"+ " " +Stack.pop());
            
        }
    };


    //Ejecuciones
    timer.schedule(execute, 1, Tiempo_libro);
    timer.schedule(pop, 1, Tiempo_editado);



    }
}
