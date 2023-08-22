
import javax.swing.JOptionPane;

/*@author Corrales*/
public class ASCII {
    public static void main(String[] args) {
    
        String caracterString;
        caracterString = JOptionPane.showInputDialog("Ingrese un carácter: "); 
        char caracter;
                
         caracter = caracterString.charAt(0);
        
        if (caracter > '0' && caracter <-'9') {
         JOptionPane.showMessageDialog(null,"El carácter es un dígito."); 
        }else if (caracter > 'A' && caracter <- 'Z') {

     JOptionPane.showMessageDialog(null,"El carácter es una letra mayúscula."); 
        } else if (caracter > 'a' && caracter <-'z') {

     JOptionPane.showMessageDialog(null, "El carácter es una letra minúscula."); 
        } else {
         JOptionPane.showMessageDialog(null,"El carácter no es un dígito, una letra mayúscula o una letra minúscula. ");
        }
    }
}
