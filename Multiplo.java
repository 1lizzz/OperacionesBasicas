
import java.util.Scanner;

/*@author Corrales*/
public class Multiplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
               //ejerci 3
               
        int numero, multiplo;

        multiplo = 8;
        
        System.out.println("escriba un número");
        numero = teclado.nextInt();
        
        if (numero % multiplo == 0){
            System.out.println("el numero "+numero+" es multiplo de 8");
        }else {
            System.out.println("el numero "+numero+" es multiplo de 8");
        }
                
        
    }
}
