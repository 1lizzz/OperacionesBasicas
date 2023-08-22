
import java.util.Scanner;
/*@author Corrales*/
public class Salario {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     //ejerc 18
     
        String nombre;
        int edad;
        float salario, sal;
        System.out.println ("introduce un nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println ("introduce una edad: ");
        edad = teclado.nextInt();
        
        System.out.println ("introduce un salario: ");
        salario = teclado.nextFloat();
       
        if(edad >= 18 && edad <= 50) {
            sal = salario + ((salario * 5) /100);
            System.out.println(nombre + " con " + edad + " años, tiene un salario " + sal);
        }
        else if(edad >= 51 && edad <= 60) {
            sal = salario + ((salario * 10)/100);
            System.out.println(nombre + " con " + edad + " años, tiene un salario " + sal);
        }
        else if(edad > 60) {
            sal = salario + ((salario * 15)/100);
            System.out.println(nombre + " con " + edad + " años, tiene un salario " + sal);
        }
        else if(edad < 17) {
            System.out.println("No tienes edad para trabajar");
        }
     }
}
