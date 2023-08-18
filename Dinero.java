
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Dinero {
    public static void main(String[] args) {
       //variable
       int pablo, jose, miguel;
       
       //pedir datos
        pablo = Integer.parseInt(JOptionPane.showInputDialog("pablo tiene de dinero"));
        
        //proceso
       
        jose = pablo * 2;
        miguel = (pablo + jose) / 2;
        
        JOptionPane.showMessageDialog(null, "jose tiene el doble que plablo "+jose+"\n"+"y miguel tiene la mitad de jose y pablo "+miguel);

        
        
    }
}
