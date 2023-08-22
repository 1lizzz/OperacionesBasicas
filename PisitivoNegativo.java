import java.util.Scanner;

/*@author Corrales*/
public class PisitivoNegativo {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        //ejercicio 1
        
        int num;
        
        System.out.println("introdusca un número");
        num = teclado.nextInt();
        
        if (num > 0){
            System.out.println("el numero "+num+" es positivo");
        }else{
            System.out.println("el numero "+num+" es negativo");
        }
        
    }
    
    
}
