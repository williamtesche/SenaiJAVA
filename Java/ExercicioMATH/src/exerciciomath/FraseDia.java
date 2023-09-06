
package exerciciomath;

import javax.swing.JOptionPane;


public class FraseDia {
    public static void main(String[] args) {
        String fraseDoDia = JOptionPane.showInputDialog("Digite a frase do dia");
        
        JOptionPane.showMessageDialog(null, "Frase do dia sem trim" +fraseDoDia);
        
        JOptionPane.showMessageDialog(null,"Frase do dia com trim: " +fraseDoDia.trim());
    }
}
