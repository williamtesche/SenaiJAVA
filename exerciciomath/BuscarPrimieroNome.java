
package exerciciomath;

import javax.swing.JOptionPane;

public class BuscarPrimieroNome {
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
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        for (int i = 0; i < 10; i++) {
            
          sobrenomeBusca =  (nomes[i].startsWith(nome));
            if (sobrenomeBusca == true) {
                System.out.println("Nome: " + nomes[i]);
            }else{
                 System.out.println("Nome não encontrado! ");
            }

        }
    }
}
