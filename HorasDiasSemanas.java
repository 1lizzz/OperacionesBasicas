
import javax.swing.JOptionPane;


/*@author Corrales*/
public class HorasDiasSemanas {
    public static void main(String[] args) {
        
        int hora,dia,sem,horatotal;
        
        horatotal = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de horas"));
        
        
        sem = horatotal / 168;
        dia = horatotal % 168 / 24;
        hora = (horatotal % 168) % 24;

         JOptionPane.showMessageDialog(null,horatotal +" "+"horas equivale a: "+"\n"+"semanas: "+sem+"\n"+"dias: " + dia+"\n"+"horas: "+hora);
       
        
    }
 
}
