package exerciciomath;

import javax.swing.JOptionPane;

public class MATH2 {
    public static void main(String[] args) {
         int primeiroNumero = 0;
         int segundoNumero = 0;
        
        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero: "));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o segundo numero: ")); 
        
        System.out.println("Valor maior: " + Math.max(primeiroNumero,segundoNumero));
    }
}
