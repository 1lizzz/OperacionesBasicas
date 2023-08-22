
import java.util.Scanner;

/**
 *
 * @author Corrales
 */
public class Meses {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        //ejerc 17
        
        int mes;
        
        System.out.println("ingrese el numero del mes  ");
        mes = teclado.nextInt();
    
      if (mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12){
      System.out.println("El mes seleccionado tiene 31 días");
      
    } else if (mes ==2){
      System.out.println("Febrero tiene 28 días");
      
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
      System.out.println("El mes seleccionado tiene 30 días");
      
    } 
    }
}
