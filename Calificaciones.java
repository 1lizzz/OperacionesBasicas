
import javax.swing.JOptionPane;


/*@author Corrales*/
public class Calificaciones {
    public static void main(String[] args) {
       //variable
        float cal1,cal2,cal3,cal4,suma,div;
        
        
        //pedir datos
        cal1 = Float.parseFloat(JOptionPane.showInputDialog("escriba su primera calificación"));
        cal2 = Float.parseFloat(JOptionPane.showInputDialog("escriba su segunda calificación"));
        cal3 = Float.parseFloat(JOptionPane.showInputDialog("escriba su primera calificación"));
        cal4 = Float.parseFloat(JOptionPane.showInputDialog("escriba su cuarta calificación"));
        
        //proceso
        suma = cal1 + cal2 + cal3 + cal4;
        div = suma/4;
        
        JOptionPane.showMessageDialog(null, "su calificación total es: "+div);


        
        
        
        
        
        
    }
}
