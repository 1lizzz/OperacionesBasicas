
import java.util.Scanner;

/*@author Corrales*/
public class CrecienteDecreciente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ejerci 6
        
        int num1,num2,num3;
        
        System.out.println("digite el primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("digite el segundo numero");
        num2 = teclado.nextInt();
        
        System.out.println("digite el tercer numero");
        num3 = teclado.nextInt();
        
        if (num1<num2 && num2<num3 && num3>num1){
            System.out.println("estan en orden creciente"); 
            } else if (num1>num2 && num2>num3 && num3<num1){
               System.out.println("estan en orden decreciente"); 
            }else {
               System.out.println("no aumenta ni disminuye el orden");
            }
        
    }
}
