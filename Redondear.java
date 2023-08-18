
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Redondear {
    public static void main(String[] args) {
    
        double numero,redon;
        
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite el número que quieras redondear"));
        
        redon = Math.round(numero);
        
        JOptionPane.showMessageDialog(null,"el numero "+numero+" redondeado es: "+redon);

       
    }
}
