
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Basico {
    public static void main(String[] args) {
               //declaracion de variables

        int n1, n2, suma, resta, multi, div, mod;
        
        //pedir datos
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba otro número"));
        
        //proceso
        
        suma = n1 + n2;
        resta = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        mod = n1 % n2;
        
        JOptionPane.showMessageDialog(null, "la suma es: "+suma+"\n"+"la resta es: "+resta+"\n"+"la multiplicación es: "+multi+"\n"+"la divición es: "+div+"\n"+"el modulo es: "+mod);
        
                
    }
           
}
