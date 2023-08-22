
import java.util.Scanner;


/*@author Corrales*/
public class MasaPeso {
    public static String main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //ejerc 11
        /*kilogramos dividido por la estatura en metros cuadrados. 
        Debido a que la estatura por lo general se mide en centímetros
        int peso;*/
        int  peso;
        double alt,imc;
        
        System.out.println("digite su peso");
        peso = teclado.nextInt();
        
        System.out.println("digite su altura");
        alt = teclado.nextDouble();
        
        //proceso
        
        imc = peso / (alt*alt);
       
        if (imc >= 16 && imc<17){
        System.out.println("Tiene infra peso");
            
        }else if(imc >17 && imc<18) {
        System.out.println("Tiene bajo peso");

        }else if(imc>18 && imc<25){
          System.out.println("Tiene buen peso (saludable)");
            
        }else if(imc >25 && imc<30) {
        System.out.println("Tiene sobrepeso (obesidad de grado 1)");

        }else if(imc>30 && imc>35){
           System.out.println("Tiene sobrepeso cronico (obesidad d grado 2)");
        }else{
         System.out.println("no existe clasificacion");
     }
        return null;
 
    }
}
