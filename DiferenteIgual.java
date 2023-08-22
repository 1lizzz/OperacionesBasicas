
import java.util.Scanner;

/*@author Corrales*/
public class DiferenteIgual {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        //ejerci 5
        
        int nu1,nu2,nu3;
        
        System.out.println("escribe un número" );
        nu1 = teclado.nextInt();
        
        System.out.println("escribe otro número" );
        nu2 = teclado.nextInt();
        
        System.out.println("escribe un tercer numero" );
         nu3 = teclado.nextInt();
        
        
        if (nu1 == nu3 && nu2 == nu1 && nu3 == nu2){
            System.out.println("los tres numeros son iguales");
            
        } else if (nu3 != nu2 && nu1 != nu2 && nu3 != nu1){
          System.out.println("los tres numeros son diferentes");
      } else {
          System.out.println("Ninguno de los dos es igual o diferente");
          
      }
        
        
    }
}
