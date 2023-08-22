
import java.util.Scanner;

/*@author Corrales*/
public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ejercicio 2
        
        int numero;
        
        System.out.println("Inserte un número");
        numero = teclado.nextInt();
        
        if (numero % 2 == 0){
           System.out.println("el numero "+numero+" es par");
        }else{
            System.out.println("el numero "+numero+" es impar");
        }
        
    }
}
