package exerciciomath;

import javax.swing.JOptionPane;

public class Nomes {

    public static void main(String[] args) {

        boolean sobrenomeBusca;
        String[] nomes = {
            "Willian Matheus",
            "Matheus Willian",
            "Gabriela Kasulke",
            "Matheus Geraldini",
            "Jaquelyne Silva",
            "Roberto Carlos",
            "Cristiano Ronaldo",
            "Jair Bolsonaro",
            "Thailise Maikele",
            "Carlos Kriguer"
        };
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome: ");
        for (int i = 0; i < 10; i++) {
            
          sobrenomeBusca =  (nomes[i].endsWith(sobrenome));
            if (sobrenomeBusca == true) {
                System.out.println("Nome: " + nomes[i]);
            }else{
                System.out.println("SobreNome não encontrado! ");
            }

        }
        
    }
}
