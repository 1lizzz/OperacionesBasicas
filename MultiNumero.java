
import java.util.Scanner;


/* @author Corrales */
public class MultiNumero {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
       //ejerc 12
       
         int numero1, numero2;
         // Introducir por pantalla un numero
         System.out.println("Introduce un numero entero:");
         numero1 = teclado.nextInt();
         System.out.println("Introduce otro numero entero:");
         numero2 = teclado.nextInt();
         
         if (numero1 % numero2 == 0) {
              System.out.println("Son multiplos");
         } else {
              System.out.println("No son multiplos");
         }
     }

}

