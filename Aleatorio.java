
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Aleatorio {
    public static void main(String[] args) {
       int numero;
       
       numero = (int)(Math.random()*100+1);
       
    JOptionPane.showMessageDialog(null,"numero aleatorio es: "+numero);

    }
}
