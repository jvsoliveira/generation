package ExercLacos;

import javax.swing.JOptionPane;

public class Exerc04 {
    public static void main(String[] args) {    
        int numero = 0;     
        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um n�mero inteiro:"));    
        if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "A raiz quadrada deste numero � " + Math.sqrt(numero), "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }      
        else {
            JOptionPane.showMessageDialog(null, "Este n�mero elevado ao quadrado �: " + Math.pow(numero, 2), "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}