import java.util.Collections;
import java.util.Stack;

public class main {
    public static void main(String[] args) throws Exception{

        System.out.println("   ___");
        System.out.println(" _/ oo\\ ");
        System.out.println("( \\  O/__");
        System.out.println(" \\    \\__)");
        System.out.println(" /     \\");
        System.out.println("/__ ~~~~\\");
        System.out.println("----(Creador)------Nietsnie-Beep-----");
        System.out.println("-----(Repositorio)-----(https://github.com/Nietsnie-beep/java-escuela.git)-----");

        System.out.println("  ");
        System.out.println("  ");


        Stack<String> stack = new Stack<String>();
        stack.push("Esta");
        stack.push("es");
        stack.push("una");
        stack.push("palabra");
        System.out.println("Estado de stack: " + stack);



        Collections.reverse(stack);
        System.out.println("reverse stack: " + stack);
        System.out.println(" ");

    }
}
