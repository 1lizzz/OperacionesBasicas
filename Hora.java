
import java.util.Scanner;


/*@author Corrales*/
public class Hora {
    public static void main(String[] args) {                                                                      
        int H,M,S;
        //ejerc 14
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H =  teclado.nextInt();
        
        System.out.print("Introduzca minutos: ");
        M =  teclado.nextInt();
        
        System.out.print("Introduzca segundos: ");
        S =  teclado.nextInt();
        
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60){                                                          
           System.out.println("su hora es " +H+":"+M+":"+S);
        }else{
            System.out.println("Hora incorrecta");
        }
    }
}

