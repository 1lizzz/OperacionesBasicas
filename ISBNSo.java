
import java.util.Scanner;

/*@author Corrales*/
public class ISBNSo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//ejerc 13
        double nota1;
    
    System.out.print("Por favor, introduzca una nota: ");
    nota1 = teclado.nextDouble();

    
    if (nota1 < 5) {
      System.out.print(" Insuficiente");
    }
    
    if ((nota1 >= 5) && (nota1 < 6)) {
      System.out.print(" Suficiente");
    }
    
    if ((nota1 >= 6) && (nota1 < 7)) {
      System.out.print(" Bien");
    }
    
    if ((nota1 >= 7) && (nota1 < 9)) {
      System.out.print(" Notable");
    }
    
    if (nota1 >= 9) {
      System.out.print(" Sobresaliente");
    }
  }
}
