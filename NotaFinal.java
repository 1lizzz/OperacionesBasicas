
import javax.swing.JOptionPane;


/*@author Corrales*/
public class NotaFinal {
    public static void main(String[] args) {
       
       float nota1,nota2,nota3,media,punto;
       
       nota1 = Float.parseFloat(JOptionPane.showInputDialog("escriba la primera calificación del examen"));
       nota2 = Float.parseFloat(JOptionPane.showInputDialog("escriba su segunda calificación del examen"));
       nota3 = Float.parseFloat(JOptionPane.showInputDialog("escriba su tercera calificación del examen"));
       
       media = (nota1+nota2+nota3)/3;
       
       punto = media + 1;
       
    JOptionPane.showMessageDialog(null, "su calificación total es: "+punto);

    }
}
