
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Raiz10 {
    public static void main(String[] args) {
        //variable
        int numero;
        double resultado;
        
        //proceso
        numero = 10;
        resultado = Math.sqrt(numero);
        
        JOptionPane.showMessageDialog(null,"La raiz cuadrada de "+numero+" es "+resultado);

        
    }
}
