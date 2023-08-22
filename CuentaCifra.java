
import java.util.Scanner;

/*@author Corrales*/
public class CuentaCifra {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        //ejerci 4
        
       int numero,contador=0;
       
        System.out.println("Introduce un numero");
        numero = teclado.nextInt();
        
        while(numero!=0){
         numero=numero/10;
         contador++;
        }
        System.out.println("Numero de cifras: "+contador );       
    }
}
 

