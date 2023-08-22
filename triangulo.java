
import java.util.Scanner;
/*@author Corrales*/
public class triangulo {
    public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
 //ejerc 20
         int l1, l2, l3;
 
	 System.out.println("Escriba el lado A");
	 l1 = teclado.nextInt();
 
	System.out.println("Escriba el lado B");
	 l2 = teclado.nextInt();
 
	System.out.println("Escriba el lado C");
	 l3 = teclado.nextInt();
 
         if (l1 == l2 && l2 == l3){
	     System.out.println("Triangulo es Equilatero");
         }else if (l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("Triangulo es Isoceles");
         }else if (l1!=l2 || l1!=l3 || l3!=l2){
            System.out.println("Triangulo es Escaleno");
            }
    }
}

    

