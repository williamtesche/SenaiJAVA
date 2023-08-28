package exerciciomath;

import javax.swing.JOptionPane;


public class ExercicioMATH {

    public static void main(String[] args) {
        
        int primeiroNumero = 0;
        int segundoNumero = 0;
        
        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero: "));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero: ")); 
        
        JOptionPane.showMessageDialog(null, "O primiero valor foi: " + primeiroNumero + "\nSegundo valor: " + segundoNumero);
    }
    
}
