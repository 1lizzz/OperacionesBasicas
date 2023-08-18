
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Triangulo {
    public static void main(String[] args) {
       
        //area de un triangulo: base por altura dividido 2.
        
        int b,a,resultado;
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de la base del triangulo: "));
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de la altura del triangulo: "));
        
        resultado = (b * a)/2;
        
        JOptionPane.showMessageDialog(null,"el area de el triangulo es: "+resultado);
    }
}
