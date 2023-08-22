
import java.util.Scanner;
/*@author Corrales*/
public class Zodiaco {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         //ejerc 21
        
          int dia,mes;
       
        System.out.print("Introduce tu dia: ");
        dia = teclado.nextInt();
        
        System.out.print("Introduce tu mes: ");
        mes = teclado.nextInt();
        

        if (mes == 1) {
            if (dia >= 21) {
                //acuario
               System.out.print("acuario");
            } else {
                //capricornio
                System.out.print("capricornio");
            }
        }
        if (mes == 2) {
            if (dia >= 19) {
                System.out.print("piscis");
            } else {
                System.out.print("acuario");
            }
        }
        if (mes == 3) {
            if (dia >= 20) {
                //acuario
                System.out.print("aries");
            } else {
                //capricornio
                System.out.print("piscis");
            }
        }
        if (mes == 4) {
            if (dia >= 20) {
                System.out.print("tauro");
            } else {
                System.out.print("Aries");
            }
        }
        if (mes == 5) {
            if (dia >= 21) {
                //acuario
                System.out.print("geminis");
            } else {
                //capricornio
                System.out.print("tauro");
            }
        }
        if (mes == 6) {
            if (dia >= 20) {
                System.out.print("cancer");
            } else {
                System.out.print("geminis");
            }
        }
        if (mes == 7) {
            if (dia >= 22) {
               
               System.out.print("leo");
            } else {
              
               System.out.print("cancer");
            }
        }
        if (mes == 8) {
            if (dia >= 21) {
                System.out.print("virgo");
            } else {
               System.out.print("leo");
            }
        }
        if (mes == 9) {
            if (dia >= 22) {
                //acuario
                System.out.print("libra");
            } else {
                //capricornio
                System.out.print("virgo");
            }
        }
        if (mes == 10) {
            if (dia >= 22) {
                System.out.print("escorpion");
            } else {
                System.out.print("libra");
            }
        }
        if (mes == 11) {
            if (dia >= 21) {
                //acuario
                System.out.print("sagitario");
            } else {
                //capricornio
                System.out.print("escorpion");
            }
        }
        if (mes == 12) {
            if (dia >= 21) {
                System.out.println("capricornio");
            } else {
               System.out.println("sagitario");
            }
        }
        
         
    }   
}

