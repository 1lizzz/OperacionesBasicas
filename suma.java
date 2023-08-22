
import java.util.Scanner;


/**
 *
 * @author Corrales
 */
public class suma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ejerc 8
        
        int num1,num2;
        
        System.out.println("digite el primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("digite el segundo numero");
        num2 = teclado.nextInt();
        
        int respuesta = num1 + num2;
        
        System.out.println("la suma de los dos números es "+respuesta);
        
    }
}
