
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Elevado {
    public static void main(String[] args) {
        int numero;
        double elevado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("escriba un numero"));
        
        elevado = Math.pow(numero, 2);
        
        JOptionPane.showMessageDialog(null,numero+" elevado a la 2 es: "+elevado);



    }
}
