
import java.util.Scanner;
/**
 *
 * @author Corrales
 */
public class Descuento {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        //ejerc 15
        
     double compra, descuento, total;
     
    System.out.println("escribe de cuanto fue su compra ");
    compra = teclado.nextInt();
    
     descuento = compra*0.20;
     total = compra - descuento;
      
     if (compra>300) {
      System.out.println("El descuento es de: " + descuento);
      
      System.out.println("El total a pagar es: " + total);
     }else{
      System.out.println("Sin descuentos, el total es:" + total);
      }
    }  
}
