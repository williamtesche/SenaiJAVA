package exerciciomath;

import javax.swing.JOptionPane;

public class DuplicaNome {

    String frase = JOptionPane.showInputDialog("Informe uma frase: ");

    JOptionPane.showMessageDialog(null, "Frase do dia sem trim" +frase+ "" + "o 'a' por 'u'\n " +frase.replace("",""));
    
    JOptionPane.showMessageDialog(null, "Frase do dia sem trim" +frase+ "" + "\n" +frase.replace("",""));
    
    String[] cores = {"Azul", "Amarelo", "Laranja"};

    for(int i = 0;i< 3; i++){
        JOptionPane.showMessageDialog(null, "Trocando o caracter 'a' por 'o' da palavra do vetor: " + "\n" +cores[i]+"\n" +cores[i].replace("a","u"));
    }
    
    int qtd = frase.length();
    JOptionPane.showMessageDialog(null,"Quantidade de espaços da frase"+qtd);

}
