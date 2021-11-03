package ExercLacos;

import javax.swing.JOptionPane;

public class Exerc04 {
    public static void main(String[] args) {    
        int numero = 0;     
        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:"));    
        if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "A raiz quadrada deste numero é " + Math.sqrt(numero), "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }      
        else {
            JOptionPane.showMessageDialog(null, "Este número elevado ao quadrado é: " + Math.pow(numero, 2), "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}