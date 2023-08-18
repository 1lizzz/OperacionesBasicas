
import javax.swing.JOptionPane;


/*@author Corrales*/
public class UnMillon {
    public static void main(String[] args) {
       //usuario del banco tiene 1 million
       
       int usuario,gasto,fin;
       
       usuario = 1000000;
       
       gasto = 400000 + 215000 + 51000;
       
       fin = usuario - gasto;
       
     JOptionPane.showMessageDialog(null, "el saldo final es: "+fin);
      
        
        
    }
}
