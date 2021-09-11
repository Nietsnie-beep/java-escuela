import java.util.Collection;
import java.util.Collections;

public class Pila {
    
    String stack[];
    int maximo;
    int ultimo;
    

    //constructor
    public Pila(int n){
        maximo = n;
        stack = new String[maximo];
        ultimo = 0;
    }

    public void push(String str){
        if(ultimo < maximo){
            stack[ultimo] = str;
            ultimo++;
        }
    }
    
    public Boolean empty(){
        if(ultimo == 0){
            return true;
        }else{
            return false;
        }
    } 

    public String pop(){
        String temporal = null;
        if(ultimo > 0){
            temporal = stack[ultimo -1];
            stack[ultimo-1] = null;
            ultimo--;
        }
        return temporal;
    }


}
