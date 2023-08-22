
import java.util.Scanner;
/**
 *
 * @author Corrales
 */
public class Temperatura {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
      //ejerc 16
      
      double temp;
    
    System.out.print("Ingrese la temperatura: ");
    temp= teclado.nextDouble();
    
    if(temp<=10){
        System.out.println("La temperatura es FRIO");
     }
        else if(temp>10 && temp<=20){
             System.out.println("La temperatura es NUBLADO");
                
        }else if(temp>20 && temp<=30){
            System.out.println("La temperatura es CALUROSO");
            
        }else if(temp>30){
            System.out.println("La temperatura es TROPICAL");   
        }
       
    }
}
