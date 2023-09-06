
package login;

import javax.swing.JOptionPane;

public class CadastrandoAluno {
    public static void main(String[] args) {
        int turma, contador, continuar;
        String status = "";
        
        do{
            int x = 0;
            float somaNota = 0, nota;
            String relatorio = "";
            
            turma = Integer.parseInt(JOptionPane.showInputDialog(null,"Informa quantos Alunos tem na sala: "));
            String[] nomes = new String[turma];
            float[] media = new float[turma];
            
            for(int i = 0; i < turma; i++){
                nomes[i] = JOptionPane.showInputDialog("Informe o nome do Aluno " + (1 + 1) + ":");
                
                for(int j = 0; j < 3; j++){
                    nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota" + (j + i) + ": "));
                    somaNota += nota;
                }
                media[i] = somaNota /3;
                somaNota = 0;
            }
            
            for(int i = 0; i < turma; i++){
                
                if(media[i] >= 7){
                    status = "Aprovado";
                }else if(media[i] >= 6 && media[i] < 7){
                    status = "Em Exame";
                }else{
                    status = "Reprovado";
                }
                
                relatorio += "Aluno: " + nomes[i] + "\nMedia: " + media[i] + "\n" +status;
            }
            JOptionPane.showMessageDialog(null, relatorio);
            
             continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar Sim / Nao: "));
             
        }while(continuar == 1);
    }
}
