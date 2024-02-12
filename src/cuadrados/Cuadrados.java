
package cuadrados;

import javax.swing.JOptionPane;

public class Cuadrados {

   
    public static void main(String[] args) {
        
     int numero,cuadrado;
     numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
     while(numero>=0)
     {
         cuadrado=(int)Math.pow( numero,2);
         JOptionPane.showMessageDialog(null,"El cuadrodo del numero es: "+cuadrado);
         numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
         
     }
        
        
    }
    
}
