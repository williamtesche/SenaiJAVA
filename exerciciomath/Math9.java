
package exerciciomath;

import javax.swing.JOptionPane;

public class Math9 {
    public static void main(String[] args) {
        String op = "S";
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        do{
            
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            
            menor = Math.min(numero, menor);
            maior = Math.max(numero, maior);
            
            JOptionPane.showMessageDialog(null, "O menor valor é: " +menor+
                                                "\n O maior valor digitado é: " +maior);
            
            op = JOptionPane.showInputDialog("Deseja sair?\n S\nN".toUpperCase());
                                    
        }while(! op.equals("S"));
    }
}
